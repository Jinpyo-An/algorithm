/*
- 배열 arr에서 두 수의 합이 target이 있으면 true 없으면 false를 반환

- 입력값: 길이가 n인 정수 배열 arr, 정수 target

1. arr의 원소가 key인 HashMap을 만든다. arrHashMap
2. i(i = 1)부터 target -1 까지 다음 작업을 반복한다.
   2-1. arrHashMap에 i key가 있는지 확인한다.
        없으면 다음 작업으로 넘긴다.
        있으면 target - i도 key가 있는지 확인한다.
          없으면 다음 작업으로 넘어간다.
          있으면 true를 반환한다.
3. false를 반환한다.


 */

package chapter07;

import java.util.HashMap;
import java.util.HashSet;

public class Solution18 {

    public boolean solution01(int[] arr, int target) {
        HashMap<Integer, Integer> arrHashMap = new HashMap<>();

        for (int i : arr) {
            arrHashMap.put(i, 0);
        }

        for (int i = 1; i < target; i++) {
            if (arrHashMap.containsKey(i)) {
                if (arrHashMap.containsKey(target - i)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean solution02(int[] arr, int target) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : arr) {
            if (hashSet.contains(target - i)) {
                return true;
            }

            hashSet.add(i);
        }

        return false;
    }
}
