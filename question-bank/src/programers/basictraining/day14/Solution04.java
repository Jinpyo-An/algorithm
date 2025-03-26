/**
 * 정수 배열 numbers, 정수 n
 * numbers의 원소들을 하나씩 더하다가 합이 n보다 커지는 순간의 합을 반환
 *
 *
 */

package programers.basictraining.day14;

public class Solution04 {

    public int solution(int[] numbers, int n) {
        int sum = 0;
        int i = 0;

        while (sum <= n) {
            sum += numbers[i++];
        }

        return sum;
    }
}
