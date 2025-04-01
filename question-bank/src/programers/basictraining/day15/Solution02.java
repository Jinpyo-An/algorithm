/**
 * 정수 배열 arr
 * 각 원소에 대해
 * 50보다 크거나 같은 짝수 -> 2로 나눈다.
 * 50보다 작은 홀수 -> 2를 곱하고 다시 1을 더한다.
 * 위 작업을 x번 반복한 결과 배열이 arr(x)
 * arr(x) = arr(x + 1)이 항상 존재
 * 이러한 x 중 가장 작은 값 return
 * <p>
 * 비교할 두 배열 파라미터 배열 복사
 * 작업을 반복하는 util 함수를 만든다.
 * util 함수
 * 매개변수로 배열과 반복 횟수를 입력받는다. (arr, x)
 * x번 반복한다.
 */

package programers.basictraining.day15;

import java.util.Arrays;

public class Solution02 {

    public int solution(int[] arr) {
        int x = 0;

        while (true) {
            int[] prev = Arrays.copyOf(arr, arr.length);
            transform(arr);

            if (Arrays.equals(prev, arr)) {
                break;
            }
            x++;
        }

        return x;
    }

    public void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && (arr[i] % 2 == 0)) {
                arr[i] /= 2;
            } else if (arr[i] < 50 && (arr[i] % 2 != 0)) {
                arr[i] = (arr[i] * 2) + 1;
            }
        }
    }
}
