/**
 * 정수 배열 arr, 원소는 1 또는 0
 * 정수 idx
 * idx보다 크면서 배열의 값이 1인 가장 작은 인덱스 찾아서 반환
 * 없으면 -1 반환
 * <p>
 * (idx + 1)부터의 길이까지 반복
 * arr[idx + 1] 값이 1이면 answer에 idx + 1 대입
 */

package programers.basic_training.day11;

public class Solution05 {

    public int solution(int[] arr, int idx) {
        int answer = -1;

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
