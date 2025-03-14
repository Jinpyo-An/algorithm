/**
 * - 입력값: 문자열 my_string, 이차원 정수 배열 queries
 * - queries 원소 [s, e] 형태
 * - my_string 인덱스 s부터 e까지 뒤집기
 * <p>
 * 원소 개수만큼 반복
 * - 범위의 반만큼 반복
 */

package programers.basic_training.day08;

public class Solution05 {

    public String solution(String my_string, int[][] queries) {
        char[] myStringChar = my_string.toCharArray();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            for (int i = 0; i < e - (s - 1); i++) {
                myStringChar[s] = myStringChar[e];
            }
        }

        return String.valueOf(myStringChar);
    }
}
