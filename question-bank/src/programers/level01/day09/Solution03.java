/*
길이가 commands의 행 길이와 같은 결과 배열 선언
iter 반복문을 사용하여 commands를 순회
i-1, j-1, k-1의 값을 구한다.
범위 내 배열을 복사하여 배열을 만든 후 정렬한다.
k-1 번째 숫자를 찾아 result 배열에 저장한다.
 */

package programers.level01.day09;

import java.util.Arrays;

public class Solution03 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answerIndex = 0;

        for (int[] command : commands) {
            int i = command[0] - 1;
            int j = command[1] - 1;
            int k = command[2] - 1;

            int[] copyArr = Arrays.copyOfRange(array, i, j + 1);
            Arrays.sort(copyArr);

            answer[answerIndex++] = copyArr[k];
        }

        return answer;
    }
}
