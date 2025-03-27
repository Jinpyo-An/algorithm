/**
 * 정수 배열 arr
 * 각 원소에 대해 값이 50보다 크거나 같은 짝수이면 2로 나누고
 * 50보다 작은 홀수이면 2를 곱한다.
 * <p>
 * 배열 arr과 길이가 같은 배열 선언
 * <p>
 * arr 배열의 길이만큼 순회
 */

package programers.basictraining.day15;

public class Solution01 {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && (arr[i] % 2 == 0)) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && (arr[i] % 2 != 0)) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}
