/**
 * 문자열 리스트 strList -> u, d, l, r 네 개의 문자열이 여러개 저장
 *
 * 먼저 나오는 문자가 l일 때
 * - 이 문자열 기준으로 왼쪽에 있는 문자열 순서대로 담기
 * r일 때
 * - 오른쪽에 있는 문자열 순서대로 담기
 *
 * 1. 문자열 배열 answer 선언
 * 2. strList 순회
 * 3. l일 때 -> 왼쪽에 있는 문자열 복사하여 answer에 담기
 * 4. r일 때 -> 오른쪽에 있는 문자열 복사하여 answer에 담기
 *
 */

package programers.basictraining.day13;

import java.util.Arrays;

public class Solution03 {

    public String[] solution(String[] strList) {

        for (int i = 0; i < strList.length; i++) {
            if (strList[i].equals("l")) {
                return Arrays.copyOfRange(strList, 0, i);
            }

            if (strList[i].equals("r")) {
                return Arrays.copyOfRange(strList, i + 1, strList.length);
            }
        }

        return new String[0];
    }
}
