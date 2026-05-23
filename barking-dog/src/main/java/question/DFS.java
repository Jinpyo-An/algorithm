package question;

import java.util.ArrayDeque;
import java.util.Deque;

public class DFS {

    static int[][] board = new int[502][502];
    static boolean[][] visited = new boolean[502][502];
    static int n = 7, m = 10;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Deque<int[]> stack = new ArrayDeque<>();

        visited[0][0] = true;
        stack.push(new int[]{0, 0});

        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            int curX = cur[0];
            int curY = cur[1];

            System.out.print("(" + curX + ", " + curY + ") -> ");

            for (int dir = 0; dir < 4; dir++) {
                int nx = curX + dx[dir];
                int ny = curY + dy[dir];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (visited[nx][ny] || board[nx][ny] != 1) continue;

                visited[nx][ny] = true;
                stack.push(new int[]{nx, ny});
            }
        }
    }
}
