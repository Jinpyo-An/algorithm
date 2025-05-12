/*

 */

package programers.level01.day08;

public class Solution01 {

    public int solution(int[] stNumber) {
        int count = 0;

        for (int i = 0; i < stNumber.length; i++) {
            for (int j = i + 1; j < stNumber.length; j++) {
                for (int k = j + 1; k < stNumber.length; k++) {
                    if (stNumber[i] + stNumber[j] + stNumber[k] == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
