package chapter07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution0_3 {

    public static int solution(int N) {
        if (N == 1) return 1;

        return N * solution(N - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(solution(N));
    }
}
