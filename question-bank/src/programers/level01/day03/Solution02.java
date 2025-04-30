/*
n이 양의 정수 x의 제곱인지 아닌지 판단한다.
- x의 제곱이 n보다 작거나 같을 때까지 반복한다.
  -
 */

package programers.level01.day03;

public class Solution02 {

    public long solution(long n) {
        long i = 1;

        while (i * i < n) {
            i++;
        }

        return i * i == n ? (i + 1) * (i + 1) : -1;
    }
}
