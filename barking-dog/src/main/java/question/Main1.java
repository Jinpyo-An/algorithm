/**
 * 첫번째 원소부터 마지막 원소 전까지 순회
 * 해당 원소의 다음 원소부터 끝까지 순회
 * 해당 원소와 다음 원소를 더해서 100이 되면 1을 반환
 */

package question;

public class Main1 {

    public int solution(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 100) return 1;
            }
        }

        return 0;
    }
}
