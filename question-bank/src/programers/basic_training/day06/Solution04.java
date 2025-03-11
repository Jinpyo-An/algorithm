package programers.basic_training.day06;

public class Solution04 {

    public int[] solution(int[] arr, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[i].length; j++) {
                int idx1 = queries[i][j];


                int a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
            }
        }

        return arr;
    }
}
