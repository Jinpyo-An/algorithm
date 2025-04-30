/*

 */

package programers.level01.day03;

import java.util.HashSet;
import java.util.Set;

public class Solution05 {

    public int solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();
        int i = 0;
        int sum = 0;

        while (i < 10) {
            answer.add(i++);
        }

        for (int number : numbers) {
            answer.remove(number);
        }

        for (Integer integer : answer) {
            sum += integer;
        }

        return sum;
    }
}
