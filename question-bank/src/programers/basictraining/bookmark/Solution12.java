/*
arr의 길이가 2의 거듭 제곱인지 확인합니다.
- 2의 거듭 제곱이면, arr를 그대로 return합니다.
- 2의 거듭 제곱이 아니면, 최소한의 개수로 0을 추가한 배열을 return합니다.
 */

package programers.basictraining.bookmark;

import java.util.Arrays;

public class Solution12 {

    public int[] solution(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}
