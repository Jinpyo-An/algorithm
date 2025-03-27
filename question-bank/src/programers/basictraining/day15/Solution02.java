/**
 * 정수 배열 arr
 * 각 원소값이 50보다 크거나 같은 짝수라면 2로 나눈다.
 * 각 원소값이 50보다 작은 홀수라면 2를 곱하고 1을 더한다
 * 위 작업을 x번 반복한 배열이 arr(x)
 * arr(x) = arr(x + 1)인 x가 항상 존재
 * 이러한 x 중 가장 작은 값 리턴
 */

package programers.basictraining.day15;

import java.util.Arrays;

public class Solution02 {

    public int solution(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int[] arr2 = new int[arr.length];

            util(arr2, i + 1);

            if (Arrays.equals(arr, arr2)) {
                return i;
            }

            arr = arr2;
        }

        return -1;
    }

    public void util(int[] arr2, int x) {
        for (int i = 0; i < x; i++) {
            if (arr2[i] >= 50 && (arr2[i] % 2 == 0)) {
                arr2[i] /= 2;
            } else if (arr2[i] < 50 && (arr2[i] % 2 != 0)) {
                arr2[i] = (arr2[i] * 2) + 1;
            }
        }
    }
}
