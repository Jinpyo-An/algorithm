/**
 * 입력 값: 정수 배열 arr, 2차원 정수 배열 queries
 * 1. queries 각 원소 query -> [s, e, k]
 * 2. s <= i <= e인 모든 i에 대해 k보다 크면서 가장 작은 값 arr[i] 찾기
 * 3. 쿼리가 존재하지 않으면 -1 저장
 * 4. 각 쿼리 순서에 맞게 저장한 배열 반환

 * 1. 쿼리를 저장할 리스트 answer
 * 2. queries 순회
 * 3. s, e, k 선언 및 초기화
 * 4. for 문으로 가장 작은 값 i 찾기
 * 5.
 */

package programers.basictraining.day06;

import java.util.Arrays;

public class Solution05 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        Arrays.fill(answer, -1);

        for (int idx = 0; idx < queries.length; idx++) {
            int[] query = queries[idx];
            int s = query[0], e = query[1], k = query[2];

            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    answer[idx] = (answer[idx] == -1 ? arr[i] : Math.min(answer[idx], arr[i]));
                }
            }

        }

        return answer;
    }
}
