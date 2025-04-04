/**
 * 0과 1로만 이루어진 정수 배열 arr
 * arr을 이용해 stk 배열 만들기
 * 
 * i(초기값 0)가 arr의 길이보다 작으면 다음을 반복
 * stk 빈배열 -> arr[i]를 stk에 추가하고 i += 1
 * stk 빈배열 아니고 stk의 마지막원소가 arr[i]와 같으면 -> stk 마지막 원소 제거 i += 1
 * stk의 마지막 원소가 arr[i]와 다르다면 -> stk 마지막에 arr[i]를 추가하고 i += 1
 */

package programers.basictraining.day19;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution04 {

    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
            } else if (stk.getLast() == arr[i]) {
                stk.removeLast();
            } else {
                stk.addLast(arr[i]);
            }
        }

        return !stk.isEmpty() ? stk.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
    }
}
