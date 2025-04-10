/**
 * 1. nStr을 문자 배열로 만들기
 * 2. 인덱스를 저장할 int 변수 index 선언
 * 3. nStr 문자 배열 순회
 * 4.
 */

package programers.basictraining.day22;

public class Solution01 {

    public String solution(String nStr) {
        int index = 0;

        for (int i = 0; i < nStr.length(); i++) {
            char ch = nStr.charAt(i);

            index = i;
            if (ch != '0') {
                break;
            }

        }

        return nStr.substring(index);
    }
}
