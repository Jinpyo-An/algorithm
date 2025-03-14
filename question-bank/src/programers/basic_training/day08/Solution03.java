/**
 * - 문자열 my_string, 정수 배열 index_list
 * -
 */

package programers.basic_training.day08;

public class Solution03 {

    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();

        for (int j : index_list) {
            char ch = my_string.charAt(j);
            sb.append(ch);
        }

        return sb.toString();
    }
}
