package programers.basic_training.day05;

public class Solution04 {

    public int solution(int[] num_list) {
        int multi = 1;
        int sum = 0;

        for (int i : num_list) {
            multi *= i;
        }

        for (int i : num_list) {
            sum += i;
        }

        return (multi < sum * sum) ? 1 : 0;
    }
}
