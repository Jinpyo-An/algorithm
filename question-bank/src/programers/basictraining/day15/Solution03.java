/**
 * 정수들이 담긴 리스트 numList
 * 모든 원소 1로 만들기 위해 필요한 연산 횟수를 리턴
 * <p>
 * 1. 횟수 체크할 정수 변수 선언
 * 2. numList 길이 만큼 순회
 * 3. 원소가 1이 아니면 -> 1이 될 때까지 연산 수행
 * - 수행 횟수 체크
 */

package programers.basictraining.day15;

public class Solution03 {

    public int solution(int[] numList) {
        int operation = 0;

        for (int num : numList) {
            if (num != 1) {
                while (num != 1) {
                    if (num % 2 == 0) {
                        num /= 2;
                    } else {
                        num = (num - 1) / 2;
                    }
                    operation++;
                }
            }
        }

        return operation;
    }
}
