/**
 * 정수 n과 k
 * 1 이상 n 이하의 정수 중, k의 배수를 오름차순으로 저장한 배열 리턴
 * <p>
 * k의 배수를 저장할 리스트 선언
 * 1부터 n까지 반복
 * n을 k로 나누었을 때, 나머지가 0이 되는지 판별
 * 맞으면 리스트에 값 대입
 * <p>
 * 결과 리스트를 정렬하여 배열로 바꾸고 반환
 */

package programers.basictraining.day11;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {

    public int[] solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
