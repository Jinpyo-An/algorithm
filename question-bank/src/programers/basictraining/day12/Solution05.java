/**
 * 정수 배열 arr, query
 * query를 순휘하며 다음 작업 반복
 * <p>
 * query 순회
 * - 짝수 인덱스일 떄: arr에서 query[i] 번 인덱스를 제외하고
 * <p>
 *     리스트에 배열 복사
 * query를 query 길이 만큼 for문으로 순회
 * - 짝수 일때
 *   - query[i] 뒷부분 지우기
 * - 홀수 일때
 *   - query[i] 앞부분 자르기
 */

package programers.basictraining.day12;

import java.util.ArrayList;
import java.util.List;

public class Solution05 {

    public int[] solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();

        for (int i : arr) {
            answer.add(i);
        }

        // query 순회
        for (int i = 0; i < query.length; i++) {
            int q = query[i];

            if (i % 2 == 0) {
                answer = answer.subList(0, q + 1);
            } else {
                answer = answer.subList(q, answer.size());
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
