/*
arr 배열에서 가장 작은 수를 제거한 배열을 리턴

배열의 길이가 1이면 -1을 가진 배열을 리턴한다.
배열의 길이가 1이상이면 배열에서 가장 작은 수를 제거한 배열을 리턴한다.
- 배열을 순회하여 가장 작은 값을 가진 인덱스를 구한다.
  minIndex = 0;
  for(i=0 arr.length-1)
  minIndex = arr[i] > arr[i+1} ? i: i+ 1
- 위 인덱스를 기준으로 앞, 뒤 값을 리스트에 넣는다.
- 리스트를 배열로 변환하여 리턴한다.
 */

package programers.level01.day04;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {

    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int minIndex = 0;
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        for (int i = 0; i < minIndex; i++) {
            answer.add(arr[i]);
        }

        for (int i = minIndex + 1; i < arr.length; i++) {
            answer.add(arr[i]);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
