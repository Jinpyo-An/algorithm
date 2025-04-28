package programers.level01.day01;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public int[] solution(long n) {
        List<Integer> answer = new ArrayList<>();

        while (n > 0) {
            answer.add((int) (n % 10));
            n /= 10;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
