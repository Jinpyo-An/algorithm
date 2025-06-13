/*
- 필터되거나 정렬되는 리스트 선언
  List<Integer[]> result;
- datas의 길이만큼 모든 원소를 순회하며 다음 작업을 반복
  for(Integer[] data: datas)
  - ext 값에 따라 다음 작업을 반복한다.
    - 만약 ext == "code"이면
      - data[1] 값과 valExt를 비교하여 작으면 data를 result에 넣는다.

- 이제 정렬을 해야한다.
  -
 */

package programers.level01.day19;

import java.util.*;

public class Solution02 {

    public int[][] solution(int[][] datas, String ext, int valExt, String sortBy) {
        List<int[]> result = new ArrayList<>();

        int extIndex = getIndex(ext); // 필터 기준 인덱스
        int sortIndex = getIndex(sortBy); // 정렬 기준 인덱스

        for (int[] data : datas) {
            if (data[extIndex] < valExt) {
                result.add(data);
            }
        }

        result.sort(Comparator.comparingInt(a -> a[sortIndex]));

        // 리스트 -> 배열 변환
        int[][] answer = new int[result.size()][4];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    private int getIndex(String key) {
        return switch (key) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            default -> 3;
        };
    }
}

