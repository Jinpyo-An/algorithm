package chapter02;

import java.util.Scanner;

public class Solution4_1 {

    public static int[] solution(int N) {
        int[] answer = new int[N];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < N; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] answer = solution(N);
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
