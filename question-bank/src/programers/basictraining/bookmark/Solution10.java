/*

 */

package programers.basictraining.bookmark;

public class Solution10 {

    public int[] solution(String myString) {
        String[] splitMyString = myString.split("x", -1);
        int[] answer = new int[splitMyString.length];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = splitMyString[i].length();
        }

        return answer;
    }
}
