/*
지원 최대 횟수 count 변수 선언
amounts 배열을 오름차순으로 정렬
amounts 배열을 길이만큼 모든 원소를 순회
- 원소가 budget보다 같거나 작을 때 count 횟수 증가
- 지원을 해줬으므로 budget에서 원소 값을 뺀다.
- 만약 원소가 budget보다 크면 반복을 종료한다.
- count 지원 횟수를 return 한다.

 */

package programers.level01.day07;

import java.util.Arrays;

public class Solution01 {

    public int solution(int[] amounts, int budget) {
        int count = 0;

        Arrays.sort(amounts);

        for (int amount : amounts) {
            if (amount <= budget) {
                budget -= amount;
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}
