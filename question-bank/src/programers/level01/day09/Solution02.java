package programers.level01.day09;

import java.util.*;

public class Solution02 {

    public int[] solution(int[] numbers) {
        Set<Integer> result = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                result.add(sum);
            }
        }

        List<Integer> answer = new ArrayList<>(result);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
