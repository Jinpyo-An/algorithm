package programers.basic_training.day03;

public class Solution03 {

    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }

        return sb.toString();
    }
}
