package chapter02;

import java.util.Scanner;

public class Solution9_1 {

    public static int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;

        // 행 합 구하기
        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            int maxSum = Math.max(sum1, sum2);
            answer = Math.max(answer, maxSum);
        }

        int sum1 = 0;
        int sum2 = 0;
        // 1번 대각선 합 구하기
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        int maxSum = Math.max(sum1, sum2);
        answer = Math.max(answer, maxSum);


        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
