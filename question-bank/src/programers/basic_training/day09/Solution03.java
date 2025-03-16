/**
 * 문자열 my_string, 정수 n
 * my_string의 뒤 n 글자로 이루어진 문자열 리턴
 *
 * - (my_string.length - n , my_string.length)
 */

package programers.basic_training.day09;

public class Solution03 {

    public String solution(String myString, int n) {
        return myString.substring(myString.length() - n);
    }
}
