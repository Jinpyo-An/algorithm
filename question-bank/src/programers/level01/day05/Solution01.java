/*
입력 값: 두 정수 left, right
left부터 right까지 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return

left부터 right까지 수마다 약수의 갯수를 구한다.
- for (i = start i<=end i++)
    num = 1
    count = 0
    for ( j = num j<= start / 2 j+=)
      if start % num ==  0
         count++;
    count % 2 == 0
짝수이면 그 수를 더하고 홀수이면 그 수를 뺀다.
 */

package programers.level01.day05;

public class Solution01 {

    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            answer += (count % 2 == 0) ? i : -i;
        }

        return answer;
    }
}
