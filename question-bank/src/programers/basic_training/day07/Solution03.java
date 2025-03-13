/**
 * 입력값: 정수 start_num, end_num
 * start_num부터 end_sum까지 숫자를 차례로 담은 리스트 return
 * <p>
 * 1. 숫자를 담을 리스트 선언
 * 2. start_num부터 end_sum까지 반복해서 리스트에 저장
 * 3. 리스트를 배열로 변환하여 반환
 */

package programers.basic_training.day07;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public int[] solution(int start_num, int end_num) {
        List<Integer> answer = new ArrayList<>();

        for (int i = start_num; i <= end_num; i++) {
            answer.add(i);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
