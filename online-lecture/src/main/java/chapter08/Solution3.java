package chapter08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution3 {

    static int N, M;
    static int[][] arr;
    static int maxSum = 0;

    static void DFS(int L, int sum, int time) {
        if(time > M) return;

        if(L == arr.length) {
            maxSum = Math.max(sum, maxSum);
            return;
        }

        DFS(L + 1, sum + arr[L][0], time + arr[L][1]);
        DFS(L + 1, sum, time);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][2];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        DFS(0, 0, 0);
        System.out.println(maxSum);
    }
}
