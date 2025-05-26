/*
수포자들의 찍는 패턴을 저장한 정수 배열 no1, no2, no3 선언
answers를 순회하여 패턴과 비교하여 정답인지 체크한다.

 */

package programers.level01.day14;

public class Solution03 {

    public int[] solution(int[] answers) {
        int[] pattern01 = {1, 2, 3, 4, 5};
        int[] pattern02 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern03 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};

        int count01 = 0, idx01 = 0;
        int count02 = 0, idx02 = 0;
        int count03 = 0, idx03 = 0;

        for (int answer : answers) {
            if (pattern01[idx01] == answer) {
                count01++;
                idx01++;
            }
            if (pattern02[idx02] == answer) {
                count02++;
                idx02++;
            }
            if (pattern03[idx03] == answer) {
                count03++;
                idx03++;
            }

            if (idx01 == pattern01.length - 1) {
                idx01 = 0;
            }
            if (idx02 == pattern02.length - 1) {
                idx02 = 0;
            }
            if (idx03 == pattern03.length - 1) {
                idx03 = 0;
            }
        }
        return new int[]{0};
    }
}
