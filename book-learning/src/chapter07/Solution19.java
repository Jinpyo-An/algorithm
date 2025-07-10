/*
- 단 한명의 선수를 제외하고 모든 선수가 마라톤을 완주함
- 완주하지 못한 선수의 이름을 반환

- 입력값: 선수들의 이름이 담긴 배열 participant, 완주한 선수들의 이름이 담긴 배열 completion

1. participant의 등장 횟수를 저장할 participantMap을 선언한다.
2. participant을 순회하여 해당 이름의 값을 1씩 증가시킨다.
3. completion을 순회하여 이름이 등장하면 값을 1씩 감소시킨다.
4. participantMap에서 값이 0이 아닌 이름의 key값을 반환한다.
 */

package chapter07;

import java.util.HashMap;

public class Solution19 {

    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : completion) {
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        for (String s : participant) {
            if (hashMap.getOrDefault(s, 0) == 0) {
                return s;
            }
            hashMap.put(s, hashMap.get(s) - 1);
        }
        return null;
    }
}
