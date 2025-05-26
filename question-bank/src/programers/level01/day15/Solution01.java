/*
입력값: 사과 최대 점수 k, 한 상자에 들어가는 사과 수 m, 사과들의 점수 score

이익이 발생하지 않는 경우 -> score.length < m
- 0을 반환한다.

이익이 발생하는 경우 -> score.length >= m
- score를 내림차순을 정렬한다.
  - Integer[] scores = Arrays.stream(score).boxed().toArray(Integer[]::new);
  - Arrays.sort(scores, Collections.reverseOrder());
- scores의 원소들을 m씩 잘라 배열을 만든다.
  for(i = 0; i < scores.length  - scores.length % m ; i += m)
- 자른 배열의 원소들 중 최솟값 min을 구해 이익을 구한다. -> min * m
- 각각의 이익을 구해 sum 변수에 더한다.
 */

package programers.level01.day15;

import java.util.Arrays;
import java.util.Collections;

public class Solution01 {

    public int solution(int k, int m, int[] score) {
        if (score.length < m) {
            return 0;
        } else {
            int sum = 0;
            Integer[] scores = Arrays.stream(score).boxed().toArray(Integer[]::new);

            Arrays.sort(scores, Collections.reverseOrder());
            for (int i = 0; i < scores.length - scores.length % m; i += m) {
                int endIndex = (i + m);
                Integer[] temp = Arrays.copyOfRange(scores, i, endIndex);
                int min = Collections.min(Arrays.asList(temp));
                sum += min * m;
            }

            return sum;
        }
    }

    public int solution02(int k, int m, int[] score) {
        int sum = 0;

        Arrays.sort(score);

        for (int i = score.length; i >= m; i -= m) {
            sum +=
        }
    }
}
