/*
지갑 크기를 구할 가로 길이 width, 세로 길이 height를 선언한다.
sizes 2차원 배열을 원소마다 순회 한다.
원소(배열)을 오름차순으로 정렬한다.
정렬한 후, 첫번째 원소가 크면 width에 대입한다.
두번쨰 원소가 크면 height에 대입한다.
 */

package programers.level01.day08;

import java.util.Arrays;

public class Solution03 {

    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        for (int[] size : sizes) {
            Arrays.sort(size);
            width = Math.max(width, size[0]);
            height = Math.max(height, size[1]);
        }

        return width * height;
    }
}
