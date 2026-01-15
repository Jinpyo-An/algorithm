package chapter01;

import java.util.Scanner;

/**
 * 1. 문자열을 입력 받는다.
 * 2. 문자열을 알파벳 뺴고 다 제거한다.
 * 3. 문자열의 길이가 홀수이면, NO를 반환한다.
 * 4. 문자열을 순회한다.
 * 5. 두 문자를 대문자로 만든다.
 * 6. 두 문자를 비교한다.
 * 7. 다르면 바로 NO를 반환한다.
 */

public class Solution8_1 {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }

        str = sb.toString().toUpperCase();
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len -i -1)) return "NO";
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }
}
