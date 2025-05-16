/*
받은 콜라 개수를 저장할 변수 cola를 선언한다.
cola = 0;
n(빈병)을 a(콜라 한병 당 빈병 갯수)를 나눈다.
share = (n / a);
remain = (n % a);
몫을 cola에 더한다.
cola += share
나머지와 몫을 더한 값을 n에 대입힌다.
n = share + remain
위 작업을 n이 a보다 크거나 같을 때까지 반복한다.
 */

package programers.level01.day10;

public class Solution03 {
    public int solution(int a, int b, int n) {
        int colaCount = 0;

        while (n >= a) {
            int exchanged = (n / a) *b;
            int remain = (n % a);

            colaCount += exchanged;
            n = exchanged + remain;
        }

        return colaCount;
    }
}
