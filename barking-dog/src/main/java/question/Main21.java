/**
 * A를 B번 곱하여 C로 나눈 나머지
 */

package question;

public class Main21 {

    public static long solution(long A, long B, long C) {
        if (B == 0) return 1;

        if (B % 2 == 0) {
            long half = solution(A, B / 2, C);
            return (half * half) % C;
        } else {
            return A * solution(A, B - 1, C);
        }
    }
}
