/*
1. 정수 배열 하나를 받는다.
2. 배열의 중복 값을 제거한다.
   2-1. 배열을 원소마다 순회힌다.
   2-2. Set에 원소를 담는다.
3. Set을 리스트에 담는다.
3. 리스트를 내림차순으로 정렬한다.
4. 리스트를 배열로 변환한 후 반환한다.
 */
package chapter04;

import java.util.*;

public class Solution02 {

    public static int[] solution(int[] arr) {
        Set<Integer> temp = new HashSet<>();

        // 배열의 중복 값 제거
        for (int i : arr) {
            temp.add(i);
        }

        List<Integer> result = new ArrayList<>(temp);

        Collections.reverse(result);

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    public static int[] solution02(int[] arr) {
        final Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);

        Arrays.sort(result, Collections.reverseOrder());

        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}
