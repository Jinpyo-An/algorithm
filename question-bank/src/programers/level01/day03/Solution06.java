/*
array를 길이 만큼 반복한다.
array의 원소가 divisor로 나누어 떨어지면 이 원소를 새로운 배열에 집에 넣는다.
새로운 배열을 정렬하여 반환한다.
 */

package programers.level01.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution06 {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) return new int[]{-1};

        Collections.sort(answer);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
