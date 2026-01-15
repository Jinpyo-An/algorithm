package chapter01;

import java.util.Scanner;

/**
 *
 */

public class Solution7_1 {

    public static String solution(String str) {
        int lt = 0;
        int rt = str.length() - 1;
        str = str.toUpperCase();

        while (lt < rt) {
            if (str.charAt(lt) != str.charAt(rt)) return "NO";
            lt++;
            rt--;
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}
