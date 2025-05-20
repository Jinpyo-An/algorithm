/*
명예의 전당 자릿수 정수 k, 출연한 가수들의 점수 scores
매일 발표된 명예의 전당 최하위 점수 구하기

명예의 전당 리스트 winners
최하위 점수 배열 winnersMinScore

자릿수가 채워지기 전(winners size <= k)
- score를 winners 리스트에 넣고 오름차순 정렬한다.
- winners의 첫번째 원소를 winnersMinScore에 넣는다.


자릿수가 채워진 후(winners size > k)
- winners 첫번째 원소와 score를 비교한다.
  - score가 더 크면 첫번쨰 원소를 없애고 score를 winners에 넣고 정렬한다.
    - 첫번째 원소를 winnersMinScore에 저장한다.
  - score가 작으면 winners의 첫번째 원소를 winnersMinScore에 넣는다.
 */

package programers.level01.day12;

import java.util.PriorityQueue;

public class Solution01 {

    public int[] solution(int k, int[] scores) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            pq.add(scores[i]);
            if (pq.size() > k) {
                pq.poll();
            }
            answer[i] = pq.peek();
        }

        return answer;
    }
}
