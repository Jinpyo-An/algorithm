package chapter02;

import java.util.Scanner;

public class Solution7_1 {

    public static int solution(int n, int[] arr) {
        int sum = 0;
        int score = 0;

        for (int i : arr) {
            if (i == 1) {
                score++;
                sum += score;
            } else score = 0;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution(n, arr));
    }
}
