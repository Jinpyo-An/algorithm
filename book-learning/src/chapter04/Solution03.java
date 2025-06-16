/*
1. 오름차순 정렬의 Tree Set인 result를 선언한다.
2. numbers의 모든 원소를 순차적으로 순회한다.
   2-1. 해당 원소의 앞 원소부터 순차적으로 순회한다.
        2-1-1. 두 원소를 합하여 result 집합에 추가한다.
3. result를 int 배열로 변환하여 반환한다.
 */

package chapter04;

import java.util.Set;
import java.util.TreeSet;

public class Solution03 {

    public static int[] solution(int[] numbers) {
        Set<Integer> result = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length ; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}
