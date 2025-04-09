/**
 *
 */

package programers.basictraining.day21;

public class Solution04 {

    public int solution(String numStr) {
        char[] numStrToArr = numStr.toCharArray();
        int sum = 0;

        for (char c : numStrToArr) {
            sum += Integer.parseInt(String.valueOf(c));
        }

        return sum;
    }
}
