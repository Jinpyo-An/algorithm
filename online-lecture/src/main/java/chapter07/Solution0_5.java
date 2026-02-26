package chapter07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution0_5 {

    public static int[] fibo;

    public static int solution(int N) {
        if (fibo[N] > 0) return fibo[N];
        if (N == 1 || N == 2) return fibo[N] = 1;
        else return fibo[N] = solution(N - 2) + solution(N - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        fibo = new int[N + 1];

        solution(N);

        for (int i = 1; i <= N; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
