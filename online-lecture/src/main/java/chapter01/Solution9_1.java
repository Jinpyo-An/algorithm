package chapter01;

import java.util.Scanner;

/**
 * 1. 문자열을 순회한다.
 * 2. 문자가 숫자인지 아닌지 판별한다.
 *    2-1. 문자면 패스한다.
 *    2-2. 숫자면 저장한다.
 */

public class Solution9_1 {

    public static Integer solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return Integer.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}
