package chapter01;

import java.util.Scanner;

/**
 *
 */

public class Solution7_2 {

    public static String solution(String str) {
        int len = str.length();
        str = str.toUpperCase();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len -i -1)) return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}
