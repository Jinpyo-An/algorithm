package chapter01;

import java.util.Scanner;

/**
 * 1. 암호 문자열의 문자가 "#"이면 1로, "*"이면 0으로 변환한다.
 * <p>
 * 2. 일곱자리를 이진수에서 십진수로 바꾼 아키스 번호에 해당하는 문자로 바꿉니다.
 * <p>
 * 3. 최종 문자열을 반환
 */
public class Solution12_1 {

    public static String solution(int n, String str) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char) num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(solution(n, str));
    }
}
