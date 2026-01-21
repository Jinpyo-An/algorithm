package chapter02;

import java.util.Scanner;

public class Solution5_1 {

    public static int solution(int N) {
        int count = 0;

        for (int i = 2; i <= N; i++) {
            int K = (int) Math.sqrt(i);
            boolean check = true;

            for (int j = 2; j <= K; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }

            if (check) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(solution(N));
    }
}
