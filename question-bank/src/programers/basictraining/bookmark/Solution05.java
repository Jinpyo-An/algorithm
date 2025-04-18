/*
- query를 순회하면서 다음 작업을 반복한다.
  - 짝수 인덱스: arr에서 arr[i] 제외하고 뒷 부분 자르기
  - 홀수 인덱스: arr에서 arr[i] 제외하고 앞 부분 자르기
- 결과 arr 배열을 return
 */

package programers.basictraining.bookmark;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution05 {

    public int[] solution(int[] arr, int[] query) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i : arr) {
            deque.add(i);
        }

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                if (deque.pollLast() != arr[query[i]]) {
                    deque.removeLast();
                }
            } else {
                if (deque.pollFirst() != arr[query[i]]) {
                    deque.removeFirst();
                }
            }
        }

        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}
