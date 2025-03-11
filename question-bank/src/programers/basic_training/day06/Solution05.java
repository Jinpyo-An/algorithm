package programers.basic_training.day06;

import java.util.ArrayList;
import java.util.List;

public class Solution05 {

//    다시 풀기
//    public int[] solution(int[] arr, int[][] queries) {
//        List<Integer> answer = new ArrayList<>();
//
//        for (int[] query : queries) {
//            int s = query[0];
//            int e = query[1];
//            int k = query[2];
//            int i = s;
//            boolean check = false;
//
//            while (i <= e) {
//                if (arr[i] > k) {
//                    check = true;
//                    break;
//                }
//                i++;
//            }
//
//            if (check) {
//                answer.add(arr[i]);
//            } else answer.add(-1);
//        }
//
//        return answer.stream().mapToInt(Integer::intValue).toArray();
//    }
}
