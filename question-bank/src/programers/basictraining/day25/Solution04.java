package programers.basictraining.day25;

public class Solution04 {

    public int solution(int[][] board, int k) {
        int sum = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    sum += board[i][j];
                }
            }
        }

        return sum;
    }
}
