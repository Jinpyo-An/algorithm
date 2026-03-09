package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution4 {

    static int N, M;
    static int[] arr;

    static void DFS(int L) {
        if (L == M) {
            for (int i : arr) System.out.print(i + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                arr[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        DFS(0);
    }
}
