/**
 *
 */

package programers.basictraining.day14;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public String[] solution(String[] names) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < names.length; i += 5) {
            answer.add(names[i]);
        }

        return answer.toArray(String[]::new);
    }
}
