package programers.basictraining.day23;

public class Solution05 {
    public int solution1(int[] date1, int[] date2) {
        if (date1[0] != date2[0]) {
            return date1[0] < date2[0] ? 1 : 0;
        } else if (date1[1] != date2[1]) {
            return date1[1] < date2[1] ? 1 : 0;
        } else if (date1[2] != date2[2]) {
            return date1[2] < date2[2] ? 1 : 0;
        } else return 0;
    }

    public int solution2(int[] date1, int[] date2) {
        for (int i = 0; i < date1.length; i++) {
            if (date1[i] != date2[i]) {
                return date1[i] < date2[i] ? 1 : 0;
            }
        }

        return 0;
    }
}
