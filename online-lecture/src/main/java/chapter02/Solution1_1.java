package chapter02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1_1 {

    public static List<Integer> solution(int[] arr) {
        int xNum = arr[0];
        List<Integer> answer = new ArrayList<>();
        answer.add(xNum);

        for (int i = 1; i < arr.length ; i++) {
            int target = arr[i];
            if (target > xNum) {
                answer.add(target);
            }
            xNum = target;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> answer = solution(arr);

        for (Integer i : answer) {
            System.out.print(i + " ");
        }
    }
}
