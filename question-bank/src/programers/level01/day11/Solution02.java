/*
입력값: 명예의 전당 목록의 점수 개수 k, 가수들의 점수가 담긴 정수 배열 scores
길이가 k인 명예의 전당 정수 배열 honor, 일자별로 최하위 점수를 저장할 minScore 생성
k를 기준으로 나눈다.
1. 1일부터 k일까지
   - honor에 점수를 넣고 정렬을 한다.
   - honor의 첫번째 원소를 minScore에 저장한다.

2. k일 이후
   - score가 최하위 점수보다 크다면  honor[0]을 score로 바꾼다.
   - honor를 정렬하고 honor[0]을 minScore에 저장한다.
   - 크지 않다면 honor[0]를 minScore에 저장한다.

 */

package programers.level01.day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution02 {

    public int[] solution(int k, int[] scores) {
        List<Integer> honors = new ArrayList<>();
        int[] minScores = new int[scores.length];

        for (int i = 0; i < k; i++) {
            honors.add(scores[i]);
            Collections.sort(honors);
            minScores[i] = honors.getFirst();
        }

        for (int i = k; i < scores.length ; i++) {
            if (scores[i] > honors.getFirst()) {
                honors.removeFirst();
                honors.addFirst(scores[i]);
                Collections.sort(honors);
            }

            minScores[i] = honors.getFirst();
        }

        return minScores;
    }
}
