/*
자연수 n을 문자열로 만든다.
각각의 문자를 숫자로 바꾸고 더한다.
 */

package programers.level01.day01;

public class Solution02 {

    public int solution(int n) {
        int sum = 0;
        String nToStr = String.valueOf(n);

        for (int i = 0; i < nToStr.length(); i++) {
            sum += Integer.parseInt(String.valueOf(nToStr.charAt(i)));
        }

        return sum;
    }

    public int solution02(int n) {
        int sum = 0;

        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }

        return sum;
    }
}
