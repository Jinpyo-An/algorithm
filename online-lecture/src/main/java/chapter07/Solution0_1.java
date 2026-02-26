package chapter07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution0_1 {

    public static void solution(int N, int current) {
        if(current > N) return;

        System.out.print(current + " ");
        solution(N, current + 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        solution(N, 1);
    }
}
