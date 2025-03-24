/**
 * 정수 startNum, endNum
 *
 */

package programers.basictraining.day11;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {

   public int[] solution(int startNum, int endNum) {
       List<Integer> answer = new ArrayList<>();

       while (startNum >= endNum) {
           answer.add(startNum--);
       }

       return answer.stream().mapToInt(Integer::intValue).toArray();
   }
}
