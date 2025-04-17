/*
정수를 9로 나눈 나머지 == 정수의 각 자리 수의 합을 9로 나눈 나머지
정수를 나타내는 문자열 number
number를 9로 나눈 나머지를 반환

number의 각 문자를 뽑아내 숫자로 만든 후 계속 더한다
이 더한 합을 9로 나눈 나머지를 반환한다.
 */

package programers.basictraining.bookmark;

public class Solution03 {

    public int solution(String number) {
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            int num = Integer.parseInt(String.valueOf(number.charAt(i)));
            sum += num;
        }

        return sum % 9;
    }
}
