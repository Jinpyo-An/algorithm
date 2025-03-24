/**
 * - 입력값: 문자열 my_string, 이차원 정수 배열 queries
 * - queries 원소 [s, e] 형태
 * - my_string 인덱스 s부터 e까지 뒤집기
 * <p>
 * 원소 개수만큼 반복
 * - 범위의 반만큼 반복
 */

package programers.basictraining.day08;

public class Solution05 {

    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray(); // 문자열을 문자 배열로 변환

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            while (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        return new String(arr); // 문자 배열을 문자열로 변환하여 반환
    }
}
