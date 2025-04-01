/**
 * 문자열 배열 strArr
 *
 */

package programers.basictraining.day16;

public class Solution03 {

    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].toUpperCase();
            } else {
                strArr[i] = strArr[i].toLowerCase();
            }
        }

        return strArr;
    }
}
