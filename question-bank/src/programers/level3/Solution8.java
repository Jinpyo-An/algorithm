package programers.level3;

import java.util.Arrays;

public class Solution8 {

    public int solution(int[][] routes) {
        Arrays.sort(routes, (o1, o2) -> o1[1] - o2[1]);

        int cameraCount = 1;
        int lastCameraPos = routes[0][1];

        for (int i = 1; i < routes.length ; i++) {
            if (routes[i][0] > lastCameraPos) {
                lastCameraPos = routes[i][1];
                cameraCount++;
            }
        }

        return cameraCount;
    }
}
