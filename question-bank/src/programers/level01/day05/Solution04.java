/*
문자열 s가 숫자로만 구성되어 있으면 true, 아니면 false 반환


 */

package programers.level01.day05;

public class Solution04 {

    public boolean solution(String s) {

        String[] sToArr = s.split("");

        for (String str : sToArr) {
            if (Integer.parseInt(str) >= 10) {
                return false;
            }
        }

        return true;
    }
}
