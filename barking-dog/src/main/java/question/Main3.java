/**
 * n을 2로 나눈 몫을 구한다.
 * 2를 몫의 횟수만큼 곱한다.
 * 곱한 값을 반환한다.
 */

package question;

public class Main3 {

    public int solution(int n) {
        int temp = n / 2;
        int answer = 1;

        for (int i = 0; i < temp; i++) {
            answer *= 2;
        }

        return answer;
    }
}
