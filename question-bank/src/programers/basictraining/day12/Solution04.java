/**
 * 정수 배열 arr
 * <p>
 * - 부분 배열을 저장할 리스트 선언
 * - 부분 범위 구하기
 * - 시작 인덱스 a, 끝 인덱스 b 선언 초기 값 -1
 * - 둘 다 -1 -> return -1
 * - b -1 -> a 인덱스의 값만 반환
 */

package programers.basictraining.day12;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {

    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int a = -1;
        int b = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                a = i;
                break;
            }
        }

        if (a == -1) {
            return new int[]{-1};
        }

        if (a == arr.length - 1) {
            return new int[]{arr[arr.length - 1]};
        }

        for (int i = a + 1; i < arr.length ; i++) {
            if (arr[i] == 2) {
                b = i;
            }
        }

        if (b == -1) {
            return new int[]{arr[a]};
        }

        for (int i = a; i <= b; i++) {
            answer.add(arr[i]);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}
