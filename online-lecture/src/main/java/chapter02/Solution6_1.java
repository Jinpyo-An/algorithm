package chapter02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution6_1 {

    public static List<Integer> solution(int N, String[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (String str : arr) {
            int target = Integer.parseInt(new StringBuilder(str).reverse().toString());
            int k = (int) Math.sqrt(target);
            boolean check = true;

            if (target < 2) continue;

            for (int i = 2; i <= k ; i++) {
                if (target % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) answer.add(target);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.next();
        }
        for (Integer i : solution(N, arr)) {
            System.out.print(i + " ");
        }
    }
}
