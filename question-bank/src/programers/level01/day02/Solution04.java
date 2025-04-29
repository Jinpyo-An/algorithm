package programers.level01.day02;

public class Solution04 {

    public int solution(int n) {
        int divideNum = 2;

        while (n % divideNum != 1) {
            divideNum++;
        }

        return divideNum;
    }
}
