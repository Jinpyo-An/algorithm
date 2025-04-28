/*
정수 n의 약수를 모두 더해 return 한다.
- n부터 1까지 n % k == 0이면 k는 약수 -> sum 변수에 대입한다.

대칭 이용 하기
i가 k/2보다 작거나 같을 때 까지 반복한다.
만약 k를 i로 나눴을 때 나머지가 0이면
-
 */

package programers.level01.day01;

public class Solution01 {

    public int solution(int n) {
        int sum = 0;

        for (int i = 1; i <= Math.pow(n, 0.5); i++) {
            if (n % i == 0) {
                int s = (n / i);
                if (s == i) {
                    sum += i;
                    break;
                } else {
                    sum += (i + s);
                }
            }
        }

        return sum;
    }
}
