/**
 *
 */

package programers.basictraining.day17;

import java.util.ArrayList;

public class Solution05 {

    public String[] solution(String myString) {
        ArrayList<String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);

            if (ch != ' ') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                answer.add(sb.toString());
                sb.setLength(0); // StringBuilder 초기화
            }
        }

        // 마지막 단어 추가
        if (sb.length() > 0) {
            answer.add(sb.toString());
        }

        return answer.toArray(new String[0]);
    }
}
