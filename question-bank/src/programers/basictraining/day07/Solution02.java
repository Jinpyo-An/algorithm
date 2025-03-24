/**
 * l 이상 r 이하의 정수 중, 숫자 0, 5로만 이루어진 정수 구하기
 */

package programers.basictraining.day07;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        for (int i = l; i <= r ; i++) {
            char[] charArr = String.valueOf(i).toCharArray();
            boolean check = true;

            for (char c : charArr) {
                if (!(c == '0' || c == '5')) {
                    check = false;
                    break;
                }
            }

            if (check) answer.add(i);
        }

        if (answer.isEmpty()) answer.add(-1);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
