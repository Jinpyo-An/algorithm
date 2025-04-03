package programers.basictraining.day18;

import java.util.Arrays;

public class Solution04 {

    public int solution(String myString, String pat) {
        char[] myStringToCharArr = myString.toCharArray();

        for (int i = 0; i < myStringToCharArr.length; i++) {
            if (myStringToCharArr[i] == 'A') {
                myStringToCharArr[i] = 'B';
            } else {
                myStringToCharArr[i] = 'A';
            }
        }

        String str = new String(myStringToCharArr);

        return str.contains(pat) ? 1 : 0;
    }
}
