package chapter07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Solution1_1 {
    int[] dis = {1, -1, 5};
    int[] visited = new int[10001];

    public int BFS(int S, int E) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(S);
        visited[S] = 1;

        int L = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int x = queue.poll();

                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];

                    if (nx == E) {
                        return L + 1;
                    }

                    if (nx >= 1 && nx <= 10000 && visited[nx] == 0) {
                        visited[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        Solution1_1 T = new Solution1_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        System.out.println(T.BFS(S, E));
    }
}
