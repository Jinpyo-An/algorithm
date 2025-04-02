/**
 * 문자열 배열 strArr
 *
 */

package programers.basictraining.day17;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();

        for (String str : strArr) {
            if (str.contains("ad")) {
                continue;
            }
            answer.add(str);
        }

        return answer.toArray(String[]::new);
    }
}
