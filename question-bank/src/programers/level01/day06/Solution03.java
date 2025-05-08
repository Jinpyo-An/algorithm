/*
입력 값: 각 원소가 0부터 9까지로 이루어져 있는 정수 배열 arr
배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거, 단 남은 수들을 반환할 때 원소의 순서 유지

결과 배열을 담기 위한 리스트를 선언한다.
arr의 길이만큼 모든 원소를 순회한다.
초기값 -1을 가진 변수를 선언한다.
전 원소의 값과 현재 원소의 값이 일치하면 원소를 넣지 않는다.
일치하지 않으면 원소를 리스트에 넣는다.
리스트를 배열로 변환해 반환한다.
 */

package programers.level01.day06;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public int[] solution(int[] arr) {
        List<Integer> resultArr = new ArrayList<>();
        int check = -1;

        for (int i : arr) {
            if (check != i) {
                resultArr.add(i);
                check = i;
            }
        }

        return resultArr.stream().mapToInt(Integer::intValue).toArray();
    }
}
