package question;

import java.util.ArrayDeque;
import java.util.Deque;

public class BFS {

    // 1이 파란 칸, 0이 빨간 칸
    static int[][] board = {
            {1, 1, 1, 0, 1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 1, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    static boolean[][] visited = new boolean[502][502];
    static int n = 7, m = 10;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {

        Deque<int[]> queue = new ArrayDeque<>();

        visited[0][0] = true;
        queue.addLast(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] cur = queue.pollFirst();
            System.out.print("(" + cur[0] + ", " + cur[1] + ") -> ");

            for (int dir = 0; dir < 4; dir++) {
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (visited[nx][ny] || board[nx][ny] != 1) continue;

                visited[nx][ny] = true;
                queue.addLast(new int[]{nx, ny});
            }
        }
    }
}
