/*
입력값
기사단원의 수 number
제한수치 limit
제한수치 초과 됐을 떄 사용할 무기 공경력 power

기사 단원의 약수의 개수로 이루어진 배열을 만든다.
counts = int[number.length]
for (i=0 i<count.length)
 int count = 0;
 int number = i + 1;
 for(j = 1;  i <= number;
   if (number % i == 0)
     count++;
 counts[i] = count


위 배열을 순회하여 철의 무게를 더한다.
만약 제한 수치를 초과할 시, 원소 값 대신에 power를 더한다.

 */

package programers.level01.day13;

public class Solution02 {

    public int solution(int number, int limit, int power) {
        int[] counts = new int[number];
        int sumKg = 0;

        for (int i = 0; i < counts.length; i++) {
            int count = 0;
            int num = i + 1;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }
            counts[i] = count;
        }

        for (int count : counts) {
            if (count > limit) {
                sumKg += power;
            } else {
                sumKg += count;
            }
        }

        return sumKg;
    }
}
