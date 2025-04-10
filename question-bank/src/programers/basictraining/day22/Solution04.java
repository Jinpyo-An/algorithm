/**
 *
 */

package programers.basictraining.day22;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {

    public int[] solution(int[] arr, int[] deleteList) {
        List<Integer> arrList = new ArrayList<>();

        for (int i : arr) {
            arrList.add(i);
        }

        for (int i = 0; i < deleteList.length; i++) {
            if (arrList.contains(deleteList[i])) {
                for (int j = 0; j < arrList.size(); j++) {
                    if (arrList.get(j) == deleteList[i]) {
                        arrList.remove(j);
                    }
                }
            }
        }

        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}
