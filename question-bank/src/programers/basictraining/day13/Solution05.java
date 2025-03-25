/**
 * 정수 리스트 numList, 정수 n
 */

package programers.basictraining.day13;

import java.util.ArrayList;
import java.util.List;

public class Solution05 {

    public int[] solution(int[] numList, int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < numList.length; i += n) {
            answer.add(numList[i]);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
