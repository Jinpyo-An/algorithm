/**
 * 정수 배열 arr / 2차원 정수 배열 queries(원소는 query [s, e]로 구성)
 * s <= i <= e인 모든 i에 대해 arr[i]에 1을 더함
 * <p>
 * queries 순회
 */

package programers.basictraining.day14;

public class Solution05 {

    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int i = s;

            while (s <= i && i <= e) {
                arr[i] += 1;
                i++;
            }
        }

        return arr;
    }
}
