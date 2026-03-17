package chapter08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution9 {

    static int N, M;
    static int[] result;

    static void DFS(int L, int start) {
        if (L == M) {
            for (int x : result) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i <= N; i++) {
                result[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new int[M];

        DFS(0, 1);
    }
}
