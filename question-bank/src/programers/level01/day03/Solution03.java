/*
x가 하샤드의 수인지 판별

x의 자릿수의 합을 구한다.
자릿수의 합으로 x가 나누어지는지 판별한다.

 */
package programers.level01.day03;

public class Solution03 {

    public boolean solution(int x) {
        String[] strX = String.valueOf(x).split("");
        int sum = 0;

        for (String s : strX) {
            sum += Integer.parseInt(s);
        }

        return x % sum == 0;
    }
}
