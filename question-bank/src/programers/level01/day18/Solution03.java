/*
- 0부터 9까지 각 숫자에 대해 X와 Y에 각각 몇 번 나오는지 센다.
- 각 숫자마다 min(x 개수, y 개수)만큼 결과 포함

- X의 숫자 횟수를 저장할 XMap, Y의 숫자 횟수를 저장할 YMap 선언
- X와 Y를 각 문자마다 순회하여 0 ~ 9숫자가 몇번 나왔는지 체크
- 0 ~ 9까지 반복하여 두 Map이 공통된 키가 있으면 그 키 값들 중 최소 값을 저장한다.
- 9부터 0까지 Map을 확인하여 있으면
 */

package programers.level01.day18;

import java.util.HashMap;
import java.util.Map;

public class Solution03 {

    public String solution(String X, String Y) {
        Map<String, Integer> XMap = new HashMap<>();
        Map<String, Integer> YMap = new HashMap<>();
        Map<String, Integer> minMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (char c : X.toCharArray()) {
            String num = String.valueOf(c);
            XMap.put(num, XMap.getOrDefault(num, 0) + 1);
        }

        for (char c : Y.toCharArray()) {
            String num = String.valueOf(c);
            YMap.put(num, YMap.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i <= 9; i++) {
            String num = String.valueOf(i);
            if (XMap.containsKey(num) && YMap.containsKey(num)) {
                minMap.put(num, Math.min(XMap.get(num), YMap.get(num)));
            }
        }

        for (int i = 9; i >= 0; i--) {
            String num = String.valueOf(i);
            if (minMap.containsKey(num)) {
                int count = minMap.get(num);
                sb.append(num.repeat(count));
            }
        }

        String answer = sb.toString();

        if (minMap.isEmpty()) return "-1";
        if (answer.charAt(0) == '0') return "0";
        return answer;
    }
}
