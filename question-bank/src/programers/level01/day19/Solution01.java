/*

- 뽑은 인형을 담을 스택 변수 선언, 사라진 인형의 개수를 저장할 변수 선언
  Stack stack; missingdoll = 0;
- moves의 길이만큼 원소마다 순회하여 다음 작업을 반복한다.
  for(int move: moves)
  - 인형을 뽑을 인덱스 선언
    index = move - 1;
  - board를 길이 만큼 순회하여 다음 작업을 반복
    for(int[] br: board)
    - 만약 br[index]가 0이 아니라면 stack에 담는다.
    - stack의 size가 2이상이면 다음 작업을 수행한다.
      - 뒤의 인형들이 같은 숫자인지 확인한다.
        stack.get(size -1) == stack.get(size -2)
        같으면 사라진 인형의 개수를 2개 더하고 원소를 지운다.
 */

package programers.level01.day19;

import java.util.Stack;

public class Solution01 {

    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int missingDoll = 0;

        for (int move : moves) {
            int index = move - 1;
            for (int[] block : board) {
                if (block[index] != 0) {
                    stack.add(block[index]);
                    block[index] = 0;
                    break;
                }
            }

            if (stack.size() >= 2) {
                if (stack.get(stack.size() - 1) == stack.get(stack.size() - 2)) {
                    missingDoll += 2;
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return missingDoll;
    }
}
