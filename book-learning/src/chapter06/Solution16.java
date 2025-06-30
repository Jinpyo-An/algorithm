/*
- 각 기능은 진도 100일때만 서비스에 반영할 수 있음
- 뒤 기능이 앞 기능보다 먼저 개발 될 수 있음
- 뒤 기능은 앞 기능이 배포될 때 함께 배포되어야 함

- 입력값: 배포순서대로 작업 진도가 적힌 정수 배열 progress, 각 작업의 개발 속도가 적힌 정수 배열 speeds
- 반환값: 각 배포마다 몇 개의 기능이 배포되는지

1. progresses의 모든 원소를 방문하여 각 기능의 배포일을 구한다.
   1-1. 100에서 progresses[i] 뺀다. remain
   1-2. remain을 speeds[i]를 나누어 몫을 구한다. 만약 나머지가 있으면 몫에 1을 더한다. temp
   1-3. temp을 queue에 넣는다.
2. queue가 비지 않을때까지 다음 작업을 반복한다.
   2-1. queue의 맨 앞 원소를 poll하여 temp에 저장한다.
   2-2. count를 1 증가시킨다.
   2-3. queue가 비지 않고 peekFirst한 게 temp보다 작거나 같으면 다음 작업을 반복한다.
        2-3-1. pollFirst를 하고 count를 증가시킨다.
   2-4. count를 answer에 넣는다.

 */

package chapter06;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution16 {

    public static int[] solution01(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int temp = remain / speeds[i];
            if (remain % speeds[i] > 0) temp++;
            queue.addLast(temp);
        }

        while (!queue.isEmpty()) {
            int current = queue.pollFirst();
            int count = 1;

            while (!queue.isEmpty() && queue.peekFirst() <= current) {
                queue.pollFirst();
                count++;
            }

            answer.add(count);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution02(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> answer = new ArrayDeque<>();

        int n = progresses.length;
        int[] dayLeft = new int[n];
        for (int i = 0; i < n; i++) {
            dayLeft[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        int count = 0;
        int maxDay = dayLeft[0];

        for (int i = 0; i < n; i++) {
            if (dayLeft[i] <= maxDay) {
                count++;
            } else {
                answer.add(count);
                count = 1;
                maxDay = dayLeft[i];
            }
        }

        answer.add(count);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
