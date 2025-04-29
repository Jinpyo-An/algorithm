/*

 */

package programers.level01.day02;

public class Solution03 {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long b = 1L;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = x * b;
            b++;
        }

        return answer;
    }
}
