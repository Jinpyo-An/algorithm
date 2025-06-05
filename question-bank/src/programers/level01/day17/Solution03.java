/*
- 최소 횟수를 저장할 배열 result 선언, 문자를 치기 위한 최소 횟수를 저장할 minKey 선언
  result = int[targets.length]
  minKey = HashSet<Character, Integer>
- keymap의 길이 만큼 순회
  for(key: keymap)
  - key를 char 배열로 만든다.
    keyChar = key.tocharArr
  - keyChar를 순회 한다.
    - 문자가 없으면 인덱스에 1을 더해 minkey에 저장한다.
    - 해당 문자가 있는데 인덱스의 1을 더한 값이 기존 값보다 작으면 값을 변경한다.
- 최소 횟수 구하기
  targets을 길이 만큼 순회
  for(target: targets)
  - target을 문자 배열로 만든다.
    targetChar = target.toCharArr
  - 최소 횟수를 저장할 count 배열을 선언
    count = 0
  - targetChar을 순회 한다.
    for(targetChar)
    - 문자가 있으면
      count에 값을 더한다.
    - 문자가 없으면 -1dmf result에 넣는다.
 */

package programers.level01.day17;

import java.util.HashMap;
import java.util.Map;

public class Solution03 {

    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];
        Map<Character, Integer> charToMinPressCount = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char ch = key.charAt(i);

                if (!charToMinPressCount.containsKey(ch) || (charToMinPressCount.get(ch) > i + 1)) {
                    charToMinPressCount.put(ch, i + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            char[] target = targets[i].toCharArray();
            int pressCount = 0;

            for (char c : target) {
                if (!charToMinPressCount.containsKey(c)) {
                    pressCount = -1;
                    break;
                }

                pressCount += charToMinPressCount.get(c);

            }

            result[i] = pressCount;
        }

        return result;
    }
}
