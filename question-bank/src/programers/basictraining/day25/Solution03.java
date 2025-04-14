package programers.basictraining.day25;

public class Solution03 {

    public int[][] solution(int[][] arr) {
        int arrRow = arr.length;
        int arrCol = arr[0].length;
        int[][] answer;

        if (arrRow > arrCol) {
            answer = new int[arrRow][arrRow];
        } else if (arrRow < arrCol) {
            answer = new int[arrCol][arrCol];
        } else return arr;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
