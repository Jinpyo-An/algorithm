package chapter07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution0_2 {

    public static void solution(int N) {
        if (N == 0) return;

        solution(N / 2);
        System.out.print(N % 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        solution(N);
    }
}
