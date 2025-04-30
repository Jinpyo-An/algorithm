/*
absolutes를 길이만큼 순회 한다.
같은 인덱스의 signs boolean 값을 체크해 sum에 집어 넣는다.
 */
package programers.level01.day03;

public class Solution04 {

    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                sum += absolutes[i];
            } else {
                sum -= absolutes[i];
            }
        }

        return sum;
    }
}
