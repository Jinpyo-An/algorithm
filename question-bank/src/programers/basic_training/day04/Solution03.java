package programers.basic_training.day04;

public class Solution03 {

    public int solution(int n) {
        int sum = 0;

        if (n % 2 == 1) {
            for (int i = n; i > 0; i -= 2) {
                sum += i;
            }
        } else {
            for (int i = n; i > 0; i -= 2) {
                sum += i * i;
            }
        }
        return sum;
    }
}
