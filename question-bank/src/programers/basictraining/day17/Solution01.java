/**
 * 문자열 myString과 pat
 * myString의 부분 문자열 중 pat으로 끝나는 가장 긴 문자열 return
 *
 * myString을 pat의 길이 만큼 잘라서 하나씩 이동
 *
 * myString을 pat의 길이만큼
 */

package programers.basictraining.day17;

public class Solution01 {

    public String solution(String myString, String pat) {

        int index = 0;

        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (pat.equals(myString.substring(i, i + pat.length()))) {
                index = (i + pat.length());
            }
        }

        return myString.substring(0, index);
    }
}
