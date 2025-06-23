/*
1. 문자열 dirs를 문자마다 확인하여 방향을 구한다.
2. 방향에 따라 다음 작업을 한다.
   2-1. 이동한 위치가 좌표를 벗어나면 이동하지 않는다.
   2-2. 이동한 위치가 좌표 내에 있으면 이동한다.
        2-2-1. 이동한 위치가 처음 걸어본 길이면 횟수를 증가한다.
        2-2-2. 이동한 위치가 처음 걸어본 길이 아니면 횟수를 증가시키지 않는다.
 */

package chapter04;

import java.util.HashMap;
import java.util.HashSet;

public class Solution07 {

    // 1
    private static boolean isValidMove(int nx, int ny) {
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }

    // 2
    private static final HashMap<Character, int[]> location = new HashMap<>();

    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }

    public int solution(String dirs) {
        initLocation();
        int x = 5;
        int y = 5;
        HashSet<String> answer = new HashSet<>(); // 3

        // 4
        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            if (!isValidMove(nx, ny)) { // 5
                continue;
            }
            // 6
            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);
            // 7
            x = nx;
            y = ny;
        }

        return answer.size() / 2;
    }
}
