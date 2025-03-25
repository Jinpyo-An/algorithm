/**
 * 정수 리스트 numList, 정수 n
 * n번째 원소부터 마지막 원소까지 모든 원소를 담는 리스트
 */

package programers.basictraining.day13;

import java.util.Arrays;

public class Solution01 {

    public int[] solution(int[] numList, int n) {
        return Arrays.copyOfRange(numList, n - 1, numList.length);
    }
}
