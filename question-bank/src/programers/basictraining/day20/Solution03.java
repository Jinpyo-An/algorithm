/**
 *
 */

package programers.basictraining.day20;

public class Solution03 {

    public int solution(String[] strArr) {
        int[] count = new int[31];
        int max = 0;

        for (String str : strArr) {
            count[str.length()]++;
        }

        for (int i : count) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}
