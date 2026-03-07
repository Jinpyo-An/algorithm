package chapter08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2 {

    static int maxSum = 0;
    static int N, C;
    static int[] arr;

    public static void DFS(int L, int sum) {
        if (sum > C) return;

        if (L == N) {
            maxSum = Math.max(maxSum, sum);
            return;
        }

        DFS(L + 1, sum + arr[L]);
        DFS(L + 1, sum);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        DFS(0, 0);
        System.out.println(maxSum);
    }
}
