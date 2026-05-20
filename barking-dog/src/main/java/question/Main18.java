package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main18 {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] box = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Deque<int[]> queue = new ArrayDeque<>();
        int[][] days = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 1) queue.addLast(new int[]{i, j});
            }
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.pollFirst();

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (box[nx][ny] != 0) continue;

                box[nx][ny] = 1;
                days[nx][ny] = days[cur[0]][cur[1]] + 1;
                queue.addLast(new int[]{nx, ny});
            }
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                if (box[i][j] == -1) continue;
                answer = Math.max(answer, days[i][j]);
            }
        }

        System.out.println(answer);
    }
}
