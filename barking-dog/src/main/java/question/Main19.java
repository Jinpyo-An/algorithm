package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main19 {
    
    static int R, C;
    static char[][] maze;
    static int[][] fireDist, jDist;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char[R][C];
        fireDist = new int[R][C];
        jDist = new int[R][C];

        for (int[] row : fireDist) Arrays.fill(row, Integer.MAX_VALUE);
        for (int[] row: jDist) Arrays.fill(row, -1);
        
        int jr = -1, jc = -1;
        Deque<int[]> fireQueue = new ArrayDeque<>();

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                maze[i][j] = line.charAt(j);
                if (maze[i][j] == 'F') {
                    fireDist[i][j] = 0;
                    fireQueue.addLast(new int[]{i, j});
                }
                if (maze[i][j] == 'J') {
                    jr = i;
                    jc = j;
                }
            }
        }

        while (!fireQueue.isEmpty()) {
            int[] cur = fireQueue.pollFirst();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];

                if (nx < 0 || nx >= R || ny <0 || ny >= C) continue;
                if (maze[nx][ny] == '#') continue;
                if (fireDist[nx][ny] != Integer.MAX_VALUE) continue;

                fireDist[nx][ny] = fireDist[cur[0]][cur[1]] + 1;
                fireQueue.addLast(new int[]{nx, ny});
            }
        }

        Deque<int[]> jQueue = new ArrayDeque<>();
        jDist[jr][jc] = 0;
        jQueue.addLast(new int[]{jr, jc});

        while (!jQueue.isEmpty()) {
            int[] cur = jQueue.pollFirst();

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];

                if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
                    System.out.println(jDist[cur[0]][cur[1]] + 1);
                    return;
                }

                if (maze[nx][ny] == '#') continue;
                if (jDist[nx][ny] != -1) continue;

                int nextTime = jDist[cur[0]][cur[1]] + 1;
                if (nextTime >= fireDist[nx][ny]) continue;

                jDist[nx][ny] = nextTime;
                jQueue.addLast(new int[]{nx, ny});
            }
        }

        System.out.println("IMPOSSIBLE");
    }
}
