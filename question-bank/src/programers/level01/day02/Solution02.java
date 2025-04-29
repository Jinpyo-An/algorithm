/*

 */
package programers.level01.day02;

public class Solution02 {

    public double solution(int[] arr) {
        double sum = 0;

        for (int score : arr) {
            sum += score;
        }

        return sum / arr.length;
    }
}
