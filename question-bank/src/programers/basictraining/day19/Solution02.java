/**
 * arr의 원소가 a라면 X의 맨뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 x return
 *
 * 1. arr의 원소를 순회
 * 2. a번 만큼 리스트에 a를 추가
 */

package programers.basictraining.day19;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public int[] solution(int[] arr) {
        List<Integer> X = new ArrayList<>();

        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                X.add(i);
            }
        }

        return X.stream().mapToInt(Integer::intValue).toArray();
    }
}
