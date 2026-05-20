package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main17 {

    static int n, m;
    static int[][] maze, dist;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        maze = new int[n][m];
        dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = input.charAt(j) - '0';
            }
        }

        Deque<int[]> queue = new ArrayDeque<>();
        dist[0][0] = 1;
        queue.addLast(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] cur = queue.pollFirst();

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (dist[nx][ny] != 0 || maze[nx][ny] != 1) continue;

                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
                queue.addLast(new int[]{nx, ny});
            }
        }

        System.out.println(dist[n - 1][m - 1]);
    }
}
