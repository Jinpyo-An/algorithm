/**
 * 문자열 my_string
 *
 * 문자열의 길이 만큼 반복
 * 접미사를 문자열 배열에 저장
 * 해당 문자열 배열을 사전 순으로 정렬
 */

package programers.basic_training.day09;

import java.util.Arrays;

public class Solution04 {

    public String[] solution(String myString) {

        String[] answer = new String[myString.length()];

        for (int i = 0; i < myString.length(); i++) {
            answer[i] = myString.substring(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
