/*
- 입력값
  - 원하는 제품을 나타내는 문자열 배열 want
  - 원하는 제품의 수량을 나타내는 정수 배열 number
  - 할인하는 제품을 나타내는 문자열 배열 discount

원하는 제품을 모두 할인받을 수 있는 날짜의 총 일수를 반환

1. want의 원소를 key로 number의 원소를 value로 하는 원하는 제품의 수량을 나타내는 hashMap을 만든다.
2. discount를 제품들의 10일 범위로 순회하여 모든 제품을 할인받을 수 있는 일수를 찾아다닌다.
   2-1. 10일
 */

package chapter07;

import java.util.HashMap;

public class Solution20 {

    public static int solution(String[] want, int[] number, String[] discount) {

        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        int answer = 0;

        for (int i = 0; i < discount.length - 9; i++) {
            HashMap<String, Integer> discount10d = new HashMap<>();

            for (int j = i; j < i + 10 ; j++) {
                if (!wantMap.containsKey(discount[j])) {
                    break;
                } else {
                    discount10d.put(discount[j], discount10d.getOrDefault(discount[j], 0) + 1);
                }
            }

            if (discount10d.equals(wantMap)) {
                answer++;
            }
        }

        return answer;
    }
}
