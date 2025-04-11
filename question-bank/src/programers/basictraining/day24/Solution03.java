/*
- 정수 배열 arr, 자연수 k
-
 */

package programers.basictraining.day24;

public class Solution03 {

    public int[] solution(int[] arr, int k) {
        if (k % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] *= k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] += k;
            }
        }

        return arr;
    }
}
