/**
 * 입력값: 자연수 n
 * <p>
 * 1. 콜라츠 수열을 기록할 리스트 선언
 * 2. n이 1이 될 때까지 다음 작업을 반복
 * - n이 짝수일 때, 2로 나눈다.
 * - n이 홀수일 때, 3 * n + 1
 * 3. 결과 값을 리스트로 변환 후 반환
 */

package programers.basictraining.day07;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {

    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                answer.add(n);
            } else {
                n = (3 * n) + 1;
                answer.add(n);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
