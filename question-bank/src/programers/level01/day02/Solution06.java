package programers.level01.day02;

public class Solution06 {

    public long solution(int a, int b) {
        long sum = 0;

        if (a == b) return a;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }

        if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }

        return sum;
    }
}
