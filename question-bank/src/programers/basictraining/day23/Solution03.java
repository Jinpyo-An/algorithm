package programers.basictraining.day23;

public class Solution03 {

    public int solution(int[] numList, int n) {
        for (int i : numList) {
            if (i == n) {
                return 1;
            }
        }

        return 0;
    }
}
