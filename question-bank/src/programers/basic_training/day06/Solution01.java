package programers.basic_training.day06;

import java.util.Arrays;

public class Solution01 {

    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);

        int lsIndx = num_list.length -1;
        int exIndx = num_list.length -2;
        int forIndx = num_list.length;

        if (num_list[lsIndx] > num_list[exIndx]) {
            answer[forIndx] = (num_list[lsIndx] - num_list[exIndx]);
        } else {
            answer[forIndx] = num_list[lsIndx] * 2;
        }

        return answer;
    }
}
