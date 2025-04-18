/**
 * 입력: 문자열 myString, 이차원 정수 배열 queries
 * queries의 원소는 [s, e] 형태 -> myString 인덱스 s부터 e까지 뒤집으라는 의미
 * 위 작업을 모두 마친 후 최종 문자열 return
 * <p>
 * 1. queries의 길이만큼 반복한다.
 * 2. queries의 원소에서 s와 e를 추출한다.
 * 3. myString 인덱스 s부터 e까지 문자를 뒤집는다.
 * - 뒤집기 위해 myString을 문자 배열로 변환한다.
 * -
 * 4. 위 작업을 모두 마치고 myString을 반환한다.
 */

package programers.basictraining.bookmark;

public class Solution04 {

    public String solution(String myString, int[][] queries) {
        char[] myStringToChArr = myString.toCharArray();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];

            for (int i = s; i < e; i++) {
                char temp = myStringToChArr[i];
                myStringToChArr[i] = myStringToChArr[e];
                myStringToChArr[e] = temp;
                e--;
            }
        }

        return new String(myStringToChArr);
    }
}
