package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main16_1 {

    static int n, m;
    static int[][] board;      // main()에서 초기화
    static boolean[][] visited;
    static int maxWidth, count;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void bfs(int si, int sj) {
        Deque<int[]> queue = new ArrayDeque<>();
        visited[si][sj] = true;
        queue.addLast(new int[]{si, sj});
        int width = 1;

        while (!queue.isEmpty()) {
            int[] cur = queue.pollFirst();
            for (int dir = 0; dir < 4; dir++) {
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (visited[nx][ny] || board[nx][ny] != 1) continue;
                visited[nx][ny] = true;
                queue.addLast(new int[]{nx, ny});
                width++;
            }
        }
        maxWidth = Math.max(width, maxWidth);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];        // ✅ n, m 확정 후 초기화
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1 && !visited[i][j]) {  // ✅ AND 조건
                    count++;
                    bfs(i, j);
                }
            }
        }

        System.out.println(count);
        System.out.println(maxWidth);
    }
}
