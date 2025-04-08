/**
 * numList에서 가장 작은 5개의 수를 오름차순으로 담은 리스트 return
 */

package programers.basictraining.day20;

import java.util.Arrays;

public class Solution05 {

    public int[] solution(int[] numList) {
        int[] answer;

        Arrays.sort(numList);
        answer = Arrays.copyOfRange(numList, 0, 5);

        return answer;
    }
}
