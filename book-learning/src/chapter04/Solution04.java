/*
1. answers의 길이만큼 모든 원소(answer)를 순차적으로 순회힌다.
   1-1. answer와 수포자들의 찍은 번호와 비교한다.
        1-1-1. 번호가 일치하면 해당 수포자의 정답을 카운트한다.
        1-1-2. 수포자의 패턴의 갯수를 넘어가면 처음부터 비교한다.
2. 카운트 값을 비교하여 가장 높은 점수를 받은 사람의 값을 반환한다.
   가장 높은 점수를 받은 사람이 여럿이면, 반환하는 값을 오름차순으로 정렬하여 반환한다.
 */

package chapter04;

import java.util.*;

public class Solution04 {

    public int[] solution(int[] answers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(1, 0);
        countMap.put(2, 0);
        countMap.put(3, 0);

        int[] pattern1 = new int[]{1, 2, 3, 4, 5};
        int[] pattern2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];

            if (pattern1[i % pattern1.length] == answer) countMap.put(1, countMap.get(1) + 1);
            if (pattern1[i % pattern2.length] == answer) countMap.put(2, countMap.get(2) + 1);
            if (pattern1[i % pattern3.length] == answer) countMap.put(3, countMap.get(3) + 1);
        }
        return new int[]{0};
    }

    public static int[] solution01(int[] answers) {
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }
            }
        }

        final int maxScore = Arrays.stream(scores).max().getAsInt();

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
