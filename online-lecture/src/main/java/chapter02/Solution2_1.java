package chapter02;

import java.util.Scanner;

public class Solution2_1 {

    public static int solution(int[] arr) {
        int count = 1;
        int std = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > std) {
                count++;
                std = arr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution(arr));
    }
}
