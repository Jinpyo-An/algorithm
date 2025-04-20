/*

 */
package programers.basictraining.bookmark;

public class Solution08 {

    public String solution(String myString, String pat) {
        int index = myString.lastIndexOf(pat);

        return myString.substring(0, index + pat.length());
    }
}
