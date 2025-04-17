/*
입력: 정수 배열 arr, 2차원 정수 배열 queries
- queries의 원소는 query로 [s, e, k] 꼴
- 각 query마다 순서대로 s <= i <= e인 모든 i에 대해, k보다 크면서 가장 작은 arr[i] 찾기
- 위 답을 저장한 정수 배열을 반환

1. queries를 길이 만큼 순회한다.
2. query마다 s <= i <= e인 모든 i를 리스트에 넣는다.
   - while(s <= i <= e)
     list.add(i)
3. 이 리스트에서 k보다 크면서 가장 작은 arr[i]을 찾는다.
   if(arr[i] > k)
4. 찾은 arr[i]를 answer 배열에 넣는다.
5. answer를 반환한다.
 */

package programers.basictraining.bookmark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution01 {

    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> answers = new ArrayList<>();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            List<Integer> listI = new ArrayList<>();
            List<Integer> listArrMin = new ArrayList<>();

            for (int i = s; i <= e; i++) {
                listI.add(i);
            }

            for (Integer i : listI) {
                if (arr[i] > k) {
                    listArrMin.add(arr[i]);
                }
            }

            if (listArrMin.isEmpty()) {
                answers.add(-1);
            } else {
                int answer = Collections.min(listArrMin);
                answers.add(answer);
            }
        }

        return answers.stream().mapToInt(Integer::intValue).toArray();
    }
}