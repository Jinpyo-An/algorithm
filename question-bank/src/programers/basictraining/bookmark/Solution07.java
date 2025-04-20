/*
입력: 알파벳으로 이루어진 문자열 myString, pat

 */

package programers.basictraining.bookmark;

public class Solution07 {

    public int solution(String myString, String pat) {
        String myStringToLower = myString.toLowerCase();
        String patToLower = pat.toLowerCase();

        return myStringToLower.contains(patToLower) ? 1 : 0;
    }
}
