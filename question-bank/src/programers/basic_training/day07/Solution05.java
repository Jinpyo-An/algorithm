/**
 * 입력값: 정수 배열 arr
 * 변수 i(초기값 0) i가 arr의 길이보다 작으면 다음 작업 반복
 * - stk가 빈배열 -> arr[i]를 stk에 추가하고 i에 1 더하기
 * - stk에 원소가 있을 때
 * - 마지막 원소가 arr[i]보다 작으면 -> arr[i]를 추가하고 i에 1더하기
 * - 마지막 원소가 arr[i]보다 크거나 같으면 -> stk의 마지막 원소 제거
 */

package programers.basic_training.day07;

import java.util.ArrayList;
import java.util.List;

public class Solution05 {

    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i += 1;
            } else if (stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i += 1;
            } else {
                stk.remove(stk.size() - 1);
            }
        }

        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
