/*
짝수라면 2로 나눈다.
홀수라면 3을 곱하고 1을 더한다.
주어진 수가 1이 될 때까지 반복한다.
위 작업의 횟수를 센다.

num이 1이면 0을 반환한다.
num이 1이 될때까지 반복한다.
짝수라면 num을 2로 나눈다.
홀수라면 num에 3을 곱하고 1을 더한다.
작업 횟수가 500을 넘어가면 -1을 반환한다.
500을 넘지 않았다면 count를 반환한다.

 */

package programers.level01.day03;

public class Solution08 {

    public int solution(int num) {
        if (num == 1) return 0;

        long n = num;
        int count = 0;

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }

            count++;

            if (count > 500) return -1;
        }

        return count;
    }
}
