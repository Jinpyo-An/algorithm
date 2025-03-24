/**
 * 정수 배열 arr, 2차원 배열 intervals
 * <p>
 * intervals는 [[a1, b1], [a2, b2]] 꼴로 각 구간은 닫힌 구간
 * <p>
 * arr의 첫 번째 구간에 해당한는 배열 + 두 번째 구간에 해당하는 배열 return
 */

package programers.basictraining.day12;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();

        for (int[] interval : intervals) {
            int a = interval[0];
            int b = interval[1];

            for (int i = a; i <= b; i++) {
                answer.add(arr[i]);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
