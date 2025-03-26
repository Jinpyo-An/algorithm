/**
 * 정수 리스트 numList
 * 가장 첫번째 원소가 1번 원소
 * 홀수 번째 원소들의 합 / 짝수 번째 원소들의 합
 * 둘 중 큰 값 return
 *
 * 1. 홀수 합, 짝수 합 변수 선언
 * 2. numList 순회
 * 3. i가 홀수 -> 짝수로 생각
 * 4. i가 짝수 -> 홀수로 생각
 */

package programers.basictraining.day14;

public class Solution01 {

    public int solution(int[] numList) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numList.length; i++) {
            if ((i % 2 == 0)) {
                oddSum += numList[i];
            } else {
                evenSum += numList[i];
            }
        }

        return Math.max(oddSum, evenSum);
    }
}
