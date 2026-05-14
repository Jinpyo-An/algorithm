/**
 * 등장했던 배열을 저장하는 배열
 * 배열을 순서대로 확인
 * 해당 원소와 더해 100이 될 수 있는 원소가 등장 배열에 있는지 확인
 */
package question;

public class Main7 {

    public int solution(int[] arr, int N) {
        int[] appeared = new int[101];

        for (int i : arr) {
            if (appeared[100 - i] == 1) return 1;
            arr[i] = 1;
        }

        return 0;
    }
}
