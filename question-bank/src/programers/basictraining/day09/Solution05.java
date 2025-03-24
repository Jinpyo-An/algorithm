/**
 * 문자열 my_string, is_suffix
 *
 */

package programers.basictraining.day09;

public class Solution05 {

    public int solution(String myString, String isSuffix) {

        int answer = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (isSuffix.equals(myString.substring(i))) {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}
