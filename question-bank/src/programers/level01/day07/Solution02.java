/*
3진수 구하기
3진수 원소들을 담을 리스트 선언
num이 3보다 크거나 같을 때까지 반복
num을 3으로 나눴을 때 나머지 리스트에 add
num의 나머지를 버리고 3으로 나누기

10진수로 표현하기
10진법으로 변환한 값을 담을 number 선언
뒤에서부터 0이 나올때까지 "3^n(n은 0부터) * 원소"의 값을 구하고 number에 대입
number값을 반환
 */

package programers.level01.day07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution02 {

    public int solution(int num) {
        List<Integer> threeFormat = new ArrayList<>();

        while (num >= 3) {
            threeFormat.add(num % 3);
            num /= 3;
        }

        threeFormat.add(num);

        Collections.reverse(threeFormat);

        int tenFormat = 0;

        for (int i = 0; i < threeFormat.size(); i++) {
            tenFormat += (int) Math.pow(3, i) * threeFormat.get(i);
        }

        return tenFormat;
    }
}
