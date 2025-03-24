/**
 * 문자열 my_string, 정수 s, e
 */

package programers.basictraining.day10;

public class Solution03 {

    public String solution(String myString, int s, int e) {
        char[] answer = myString.toCharArray();

        while (s <= e) {
            char temp = answer[s];
            answer[s] = answer[e];
            answer[e] = temp;

            s++;
            e--;
        }

        return String.valueOf(answer);
    }
}
