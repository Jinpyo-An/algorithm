package chapter01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. 입력 문자열을 순회한다.
 * 2. 등장한 문자를 저장한다.
 * 3. 만약 등장한 문자가 중복 등장한 경우, 저장하지 않는다.
 */

public class Solution6_1 {

    public static String solution(String str) {
        List<Character> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            boolean isNotInclude = true;
            for (Character character : answer) {
                if (c == character) {
                    isNotInclude = false;
                    break;
                }
            }

            if (isNotInclude) answer.add(c);
        }

        for (Character c : answer) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(solution(input));
    }
}
