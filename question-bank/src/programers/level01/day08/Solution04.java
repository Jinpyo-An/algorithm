/*
해쉬 맵 쓰기
연산을 저장할 정수 배열 선언
해쉬 맵 변수 선언 (key: 원소 값, value: 원소의 최신 인덱스)
문자열 s를 순회 한다.

 */

package programers.level01.day08;

import java.util.HashMap;
import java.util.Map;

public class Solution04 {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> charInfo = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!charInfo.containsKey(s.charAt(i))) {
                answer[i] = -1;
                charInfo.put(s.charAt(i), i);
            } else {
                Integer exIndex = charInfo.get(s.charAt(i));
                answer[i] = i - exIndex;
                charInfo.put(s.charAt(i), i);
            }
        }

        return answer;
    }
}
