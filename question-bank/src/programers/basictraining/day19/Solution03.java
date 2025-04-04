/**
 *  flag를 순회
 *  flag[i]가 true -> arr[i]를 arr[i] x 2번 추가
 *  flag[i]가 false -> arr[i]개의 원소를 제거
 *
 *  1. flag를 순회 (일반 for문으로)
 *  2. if(flag[i]) -> deq에 추가
 *
 */

package programers.basictraining.day19;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution03 {

    public int[] solution(int[] arr, boolean[] flag) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < flag.length; i++) {
            int value = arr[i];

            if (flag[i]) {
                for (int j = 0; j < value * 2; j++) {
                    deque.add(value);
                }
            } else {
                for (int j = 0; j < value; j++) {
                    deque.removeLast();
                }
            }
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
