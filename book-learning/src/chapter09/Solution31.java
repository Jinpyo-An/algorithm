/*
1. 번호가 같은 포켓몬의 중복을 없앤다.
2. 중복을 없앤 결과 배열이 n/2보다 작으면, 그 배열의 길이를 반환한다.
3. 그렇지 않으면, n/2를 반환한다.
 */

package chapter09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Solution31 {

    public int solution01(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }

        if (numsSet.size() < nums.length / 2) {
            return numsSet.size();
        } else {
            return nums.length / 2;
        }
    }

    public int solution02(int[] nums) {
        HashSet<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));

        int k = nums.length / 2;

        return Math.min(k, set.size());
    }
}
