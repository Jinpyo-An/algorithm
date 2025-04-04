/**
 * 1. myString 문자마다 순회
 * 2. a, b, c가 아니면 sb에 담기
 * 2. a, b, c를 만나면 리스트에 저장하고 sb 초기화
 */

package programers.basictraining.day19;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    public String[] solution(String myString) {
        List<String> splitList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : myString.toCharArray()) {
            if (ch != 'a' || ch != 'b' || ch != 'c') {
                sb.append(ch);
            } else {
                if (sb.toString().length() > 0) {
                    splitList.add(sb.toString());
                }
                sb.setLength(0);
            }
        }

        return splitList.size() > 0 ? splitList.toArray(String[]::new) : new String[]{"EMPTY"};
    }
}
