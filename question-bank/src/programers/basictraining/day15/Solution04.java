/**
 * 정수가 담긴 리스트 numList
 * 리스트 길이가 11 이상이면, 모든 원소의 합
 * 10 이하이면, 모든 원소의 곱을 return
 */

package programers.basictraining.day15;

public class Solution04 {

    public int solution(int[] numList) {
        int answer = 1;

        if (numList.length >= 11) {
            for (int num : numList) {
                answer += num;
            }

            answer -= 1;
        }

        if (numList.length <= 10) {
            for (int num : numList) {
                answer *= num;
            }
        }

        return answer;
    }
}
