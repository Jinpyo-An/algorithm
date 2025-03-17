/**
 * 문자열 my_string, is_prefix
 * <p>
 * is_prefix가 my_string의 접두사라면 1, 아니면 0을 반환
 */

package programers.basic_training.day10;

public class Solution02 {

    public int solution(String myString, String isPrefix) {
        int answer = 0;

        for (int i = 1; i < myString.length(); i++) {

            if (isPrefix.equals(myString.substring(0, i))) {
                answer = 1;
            }

        }

        return answer;
    }
}
