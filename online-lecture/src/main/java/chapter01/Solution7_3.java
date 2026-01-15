package chapter01;

import java.util.Scanner;

/**
 *
 */

public class Solution7_3 {

    public static String solution(String str) {
        String temp = new StringBuilder(str).reverse().toString();
        return temp.equalsIgnoreCase(str) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}
