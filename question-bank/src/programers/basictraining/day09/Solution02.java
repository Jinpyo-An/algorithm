/**
 * 길이가 같은 문자열 배열 my_strings, 이차원 정수 배열 parts
 * parts[i]는 [s, e] 형태 -> my_strings[i]의 s부터 e까지의 부분 문자열
 * 위 문자열을 순서대로 이어붙인 문자열을 return
 *
 * - parts의 길이만큼 반복
 * - my_strings[i]의 s부터 e까지의 부분 문자열 꺼내기
 * - 위 문자열을 이어 붙이기
 *
 */

package programers.basictraining.day09;

public class Solution02 {

    public String solution(String[] myStrings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];

            String str = myStrings[i].substring(s, e + 1);
            answer.append(str);
        }

        return answer.toString();
    }

}
