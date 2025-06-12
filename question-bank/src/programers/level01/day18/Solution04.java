/*

 */

package programers.level01.day18;

import java.util.Stack;

public class Solution04 {

    public int solution01(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i : ingredient) {
            stack.push(i);

            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 &&
                        stack.get(size - 3) == 2 &&
                        stack.get(size - 2) == 3 &&
                        stack.get(size - 1) == 1) {

                    for (int j = 0; j < 4; j++) {
                        stack.pop();
                    }
                    count++;
                }
            }
        }

        return count;
    }
}
