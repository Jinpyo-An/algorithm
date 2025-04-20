/*
입력: 정수 배열 arr
arr 각 원소에 대해
- 50보다 크거나 같은 짝수: 2로 나누기
- 50보다 작은 홀수: 2를 곱하고 다시 1 더하기
위 작업을 x번 반복한 결과는 arr(x)
arr(x) = arr(x + 1)인 x가 항상 존재
이러한 x 중 가장 작은 x를 return

arr 배열의 원소를 순서대로 순회한다.
- 원소가 50보다 크거나 같은 짝수면, 2로 나눈다.
- 원소가 50보다 작은 홀수면, 2를 곱하고 다시 1 더한다.
x번 반복한 배열과 x+1번 반복한 배열을 비교한다.

 */

package programers.basictraining.bookmark;

import java.util.Arrays;

public class Solution06 {

    public int solution(int[] arr) {
        int x = 0;
        while (true) {
            int[] arr1 = Arrays.copyOf(arr, arr.length);

            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] % 2 == 0) && (arr[i] >= 50)) {
                    arr[i] /= 2;
                } else if ((arr[i] % 2 != 0) && (arr[i] < 50)) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(arr1, arr)) {
                return x;
            }
            x++;
        }
    }
}
