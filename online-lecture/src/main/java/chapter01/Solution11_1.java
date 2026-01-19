package chapter01;

import java.util.Scanner;

/**
 * 1. 입력 문자열 순회
 * 2. 다음 작업을 끝까지 반복
      1. 현재문자와 전문자와 같은지 비교한다.
         1. 같으면, 등장 횟수를 1 증가 시킨다.
         2. 다르면, 전문자와 등장횟수를 저장하고 등장횟수를 1로 초기화시킨다.
   3. 마지막 문자도 등장횟수에 따라 문자를 저장한다.
 * 3. 압축된 문자열 반환
 *
 */

public class Solution11_1 {

    public static String solution(String str) {
        int count = 1;
        char xch = str.toCharArray()[0];
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < str.length() ; i++) {
            if (str.charAt(i) == xch) {
                count++;
            } else {
                answer.append(xch);
                if (count > 1) {
                    answer.append(count);
                }
                count = 1;
                xch = str.charAt(i);
            }
        }

        answer.append(str.charAt(str.length() - 1));
        if (count > 1) {
            answer.append(count);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}
