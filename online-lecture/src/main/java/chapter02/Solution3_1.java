package chapter02;

import java.util.Scanner;

public class Solution3_1 {

    public static char[] solution(int N, int[] arrA, int[] arrB) {
        char[] answer = new char[N];

        for (int i = 0; i < N; i++) {
            int A = arrA[i];
            int B = arrB[i];

            if (A == B) answer[i] = 'D';
            else if (A == 1) {
                if (B == 3) answer[i] = 'A';
                else answer[i] = 'B';
            } else if (A == 2) {
                if (B == 1) answer[i] = 'A';
                else answer[i] = 'B';
            } else {
                if (B == 2) answer[i] = 'A';
                else answer[i] = 'B';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arrA = new int[N];
        int[] arrB = new int[N];
        for (int i = 0; i < N; i++) {
            arrA[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            arrB[i] = scanner.nextInt();
        }

        char[] answer = solution(N, arrA, arrB);
        for (char c : answer) {
            System.out.println(c);
        }
    }
}
