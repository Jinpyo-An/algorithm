/*
입력값: 지갑의 가로, 세로를 담은 wallet, 지폐의 가로, 세로를 담은 bill

1. 지폐를 접은 횟수를 저장할 변수 answer를 만들고 0을 저장합니다.
2. 반복문을 이용해 bill의 작은 값이 wallet의 작은 값보다 크거나 bill의 큰 값이 wallet의 큰 값보다 크다면 다음 작업을 합니다.
   2-1. bill[0]이 bill[1]보다 크다면 bill[0]을 2로 나누고 나머지는 버립니다.
   2-2. 그렇지 않으면 bill[1]을 2로 나누고 나머지를 버린다.
   2-3. answer를 1 증가시킨다.
3. answer를 return한다.
 */

package programers.level01.day16;

import static java.lang.Math.*;

public class Solution01 {

    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        while (min(bill[0], bill[1]) > min(wallet[0], wallet[1]) ||
                max(bill[0], bill[1]) > max(wallet[0], wallet[1])) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }

            answer++;
        }

        return answer;
    }
}
