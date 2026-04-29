package programers.level3;

import java.util.Arrays;

public class Solution9 {

    public int[] solution(int n, int s) {
        if (n > s) return new int[]{-1};

        int[] set = new int[n];
        int quotient = s / n;
        int remainder = s % n;

        Arrays.fill(set, quotient);

        for (int i = 0; i < remainder; i++) {
            set[n - 1 - i]++;
        }

        return set;
    }
}
