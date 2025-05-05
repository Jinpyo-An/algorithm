package programers.level01.day05;

import java.util.Arrays;

public class Solution02 {

    public String solution(String myStr) {
        char[] myCharArr = myStr.toCharArray();
        Arrays.sort(myCharArr);

        char[] reverseMyCharArr = new char[myCharArr.length];

        int i = myCharArr.length - 1;
        int j = 0;

        while (i >= 0) {
            reverseMyCharArr[j] = myCharArr[i];
            i--;
            j++;
        }

        return String.valueOf(reverseMyCharArr);
    }
}
