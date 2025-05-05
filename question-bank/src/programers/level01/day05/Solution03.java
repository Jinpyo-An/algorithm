/*
놀이 기구 이용료 price
놀이 기구를 N번째 이용하면, 원래 이용료의 N배를 받는다.
놀이기구를 count번 타게 되면 자신이 가지고 있는 금액에서 얼마가 모자라는지 return
 */

package programers.level01.day05;

public class Solution03 {

    public long solution(int price, int money, int count) {
        long sumPrice = 0;

        while (count >= 1) {
            sumPrice += (long) count * price;
            count--;
        }

        return money > sumPrice ? 0 : sumPrice - money;
    }
}
