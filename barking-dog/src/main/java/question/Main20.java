package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main20 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 수빈이 위치
        int K = Integer.parseInt(st.nextToken()); // 동생 위치

        if (N == K) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[100001];
        Deque<Integer> queue = new ArrayDeque<>();
        Arrays.fill(arr, -1);

        arr[N] = 0;
        queue.addLast(N);

        while (!queue.isEmpty()) {
            int cur = queue.pollFirst();

            if (cur == K) {
                System.out.println(arr[K]);
                return;
            }

            for (int dir = 0; dir < 3; dir++) {
                int[] nexts = {cur - 1, cur + 1, cur * 2};

                for (int nx : nexts) {
                    if (nx < 0 || nx >= arr.length) continue;
                    if (arr[nx] != -1) continue;

                    arr[nx] = arr[cur] + 1;
                    queue.addLast(nx);
                }
            }
        }
    }
}
