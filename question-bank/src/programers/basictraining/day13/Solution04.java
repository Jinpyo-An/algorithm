/**
 * 정수 리스트 numList, 정수 n
 *
 */

package programers.basictraining.day13;

import java.util.Arrays;

public class Solution04 {

    public int[] solution(int[] numList, int n) {
        return Arrays.copyOfRange(numList, 0, n);
    }
}
