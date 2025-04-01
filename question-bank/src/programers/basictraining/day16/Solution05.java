/**
 * 영어 소문자로 이루어진 문자열 myString, 영소문자 1글자로 이루어진 문자열 alp
 *
 */

package programers.basictraining.day16;

public class Solution05 {

    public String solution(String myString, String alp) {
        return myString.replace(alp, alp.toUpperCase());
    }
}
