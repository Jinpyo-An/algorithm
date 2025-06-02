/*
최고 순위 번호를 구하기 위해 zeroCount 변수를 선언하여 0을 초기화한다.
1. winNums와 lottos 번호의 일치 여부를 확인한다.
   for(i = 0; i <= lottos.length)
      for(j = 0; j <= winNums.length)
2.lottos에서 0이 있으면 zeroCount를 1 증가 시킨다.

 */

package programers.level01.day16;

public class Solution04 {

    public int[] solution(int[] lottos, int[] winNums) {
        int zeroCount = 0;
        int equalCount = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }
            for (int j = 0; j < winNums.length; j++) {
                if (winNums[j] == lottos[i]) {
                    equalCount++;
                }
            }
        }

        int highLevel = returnLevel(equalCount + zeroCount);
        int lowLevel = returnLevel(equalCount);

        return new int[]{highLevel, lowLevel};
    }

    public int returnLevel(int num) {
        if (num == 6) {
            return 1;
        } else if (num == 5) {
            return 2;
        } else if (num == 4) {
            return 3;
        } else if (num == 3) {
            return 4;
        } else if (num == 2) {
            return 5;
        } else {
            return 6;
        }
    }
}
