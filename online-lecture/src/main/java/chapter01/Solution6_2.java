package chapter01;

import java.util.Scanner;

/**
 * 1. 입력 문자열을 순회한다.
 * 2. 등장한 문자를 저장한다.
 * 3. 만약 등장한 문자가 중복 등장한 경우, 저장하지 않는다.
 */

public class Solution6_2 {

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                answer.append(str.charAt(i));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}
