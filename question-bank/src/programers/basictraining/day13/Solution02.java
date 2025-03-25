/**
 * 정수 리스트 numList, 정수 n
 * n번째 이후 원소들 / n번째까지의 원소들
 * 앞 뒤 바꿔서 붙인 배열을 반환
 *
 * 1. numList와 길이가 같은 배열 선언
 * 2. numList의 n번째 이후 원소들을 하나의 배열로 담기
 * 3. numList의 n번째 까지의 원소들을 하나의 배열로 담기
 * 4. 1번 배열에 담기
 *    - 2번 배열의 길이만큼 복사
 *    - 다음 인덱스부터 3번 배열 복사
 */

package programers.basictraining.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution02 {

    public int[] solution(int[] numList, int n) {
        List<Integer> answer = new ArrayList<>();
        int[] front = Arrays.copyOfRange(numList, n, numList.length);
        int[] back = Arrays.copyOfRange(numList, 0, n);

        for (int j : front) {
            answer.add(j);
        }

        for (int j : back) {
            answer.add(j);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
