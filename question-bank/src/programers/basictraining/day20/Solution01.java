/**
 * 정수 배열 arr
 * arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가
 * arr에 최소한의 개수로 0을 추가한 배열 return
 * <p>
 * arr 배열의 길이를 확인하고 2의 거듭제곱인지 체크
 */

package programers.basictraining.day20;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    public int[] solution(int[] arr) {
        int targetSize = 1;

        while (targetSize < arr.length) {
            targetSize *= 2;
        }

        List<Integer> answer = new ArrayList<>();

        for (int i : arr) {
            answer.add(i);
        }

        for (int i = arr.length; i < targetSize; i++) {
            answer.add(0);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
