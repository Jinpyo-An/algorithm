/**
 * 정수 n, 정수 3개가 담긴 리스트 slicer, 정수 여러 개가 담긴 리스트 num_list
 * <p>
 * slicer 정수 a, b, c
 * <p>
 * n에 따라 num_list 슬라이스
 * <p>
 * 1. 슬라이스한 값을 담을 리스트 선언
 * 2. switch문으로
 * n = 1: 0~b까지 리스트에 담기
 * n = 2: a번 부터
 */

package programers.basictraining.day12;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {

    public int[] solution(int n, int[] slicer, int[] numList) {
        List<Integer> answer = new ArrayList<>();

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch (n) {
            case 1:
                for (int i = 0; i <= b; i++) {
                    answer.add(numList[i]);
                }
                break;
            case 2:
                for (int i = a; i < numList.length; i++) {
                    answer.add(numList[i]);
                }
                break;
            case 3:
                for (int i = a; i <= b; i++) {
                    answer.add(numList[i]);
                }
                break;
            case 4:
                for (int i = a; i <= b; i += c) {
                    answer.add(numList[i]);
                }
                break;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
