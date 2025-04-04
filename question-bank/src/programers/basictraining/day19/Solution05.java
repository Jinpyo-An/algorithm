/**
 * 랜덤으로 서로 다른 k개의 수를 저장한 배열을 만든다.
 * 정수 배열 arr
 * 완성될 배열의 길이가 k보다 작으면 -> 나머지 값을 -1로 채워서 return
 *
 * 1. result를 저장할 List 선언
 * 2. arr를 원소마다 순회
 * 3. 원소가 result에 포함되어 있지 않으면 추가(size가 k보다 작거나 같아야 함)
 * 4. 작업을 마친 result의 사이즈가 k보다 작으면 나머지 -1 채우기
 */

package programers.basictraining.day19;

import java.util.ArrayList;
import java.util.List;

public class Solution05 {

    public int[] solution(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();

        for (int i : arr) {
            if (result.size() < k) {
                if (!result.contains(i)) {
                    result.add(i);
                }
            } else break;
        }

        while (result.size() < k) {
            result.add(-1);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
