/*
1번 수포자 패턴: 1,2,3,4,5
2번 수포자 패턴: 2,1,2,3,2,4,2,5
3번 수포자 패턴: 3,3,1,1,2,2,4,4,5,5
문제의 정답이 순서대로 들은 배열 answers

answers를 순차적으로 순회한다.
for(i = 0 i < answer.length i++)
answers의 원소를 수포자들의 답과 비교한다.
answer[i] == pattern01[i % pattern.length]
두 값이 일치하면 각 수포자들의 정답 카운트를 증가시킨다.
count1 ++;
각 수포자들의 정답 카운트를 비교하여
 */
package programers.level01.day15;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public int[] solution(int[] answers) {
        int[] pattern1 = new int[]{1, 2, 3, 4, 5};
        int[] pattern2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) count1++;
            if (answers[i] == pattern2[i % pattern2.length]) count2++;
            if (answers[i] == pattern3[i % pattern3.length]) count3++;
        }

        int max = Math.max(count1, Math.max(count2, count3));

        List<Integer> answer = new ArrayList<>();
        if (count1 == max) answer.add(1);
        if (count2 == max) answer.add(2);
        if (count3 == max) answer.add(3);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
