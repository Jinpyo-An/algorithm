/**
 * 정수 배열 arr, 정수 n
 * arr 길이가 홀수 -> arr 짝수 인덱스 원소에 n을 더한 배열 return
 * arr 길이가 짝수 -> arr 홀수 인덱스 원소에 n을 더한 배열 return
 */

package programers.basictraining.day20;

public class Solution04 {

    public int[] solution(int[] arr, int n) {
        int startIndex = arr.length % 2 == 0 ? 1 : 0;

        for (int i = startIndex; i < arr.length; i += 2) {
            arr[i] += n;
        }

        return arr;
    }
}
