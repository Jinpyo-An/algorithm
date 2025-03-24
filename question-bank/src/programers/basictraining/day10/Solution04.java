/**
 * 문자열 my_string, 두 정수 m, c
 * my_string을 m 글자씩 가로로 적었을 때, c 번째 열에 적힌 글자들을 문자열로 반환
 * <p>
 * my_string을 m 글자씩 잘라 저장하기
 * - 이차원 배열로 저장
 * -
 */

package programers.basictraining.day10;

public class Solution04 {

    public String solution(String myString, int m, int c) {
        String[] str = new String[myString.length() / m];

        for (int i = 0; i < myString.length() / m; i++) {
            str[i] = (myString.substring(m * i, m * (i + 1)));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            char ch = str[i].charAt(c);

            sb.append(ch);
        }

        return sb.toString();
    }
}
