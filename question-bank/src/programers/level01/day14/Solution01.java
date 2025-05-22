/*
입력값: N마리 포켓몬의 종류 번호가 담긴 배열 nums

nums 리스트를 Set으로 만든다.
만약 set의 길이가 N/2보다 크다면 N/2를 반환한다.
만약 set의 길이가 N/2보다 작으면 set의 길이를 반환한다.
 */

package programers.level01.day14;

import java.util.HashSet;
import java.util.Set;

public class Solution01 {

    public int solution(int[] nums) {
        int avg = nums.length / 2;
        Set<Integer> pocketMon = new HashSet<>();

        for (int num : nums) {
            pocketMon.add(num);
        }

        return Math.min(pocketMon.size(), avg);
    }
}
