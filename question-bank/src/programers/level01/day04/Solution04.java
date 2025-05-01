/*

 */

package programers.level01.day04;

public class Solution04 {

    public int solution(int[] a, int[] b) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }

        return sum;
    }
}
