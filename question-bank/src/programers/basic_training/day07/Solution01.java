/**
 * i가 k의 배수이면 -> arr[i]에 1을 더한다.
 */

package programers.basic_training.day07;

public class Solution01 {

    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }

        return arr;
    }
}
