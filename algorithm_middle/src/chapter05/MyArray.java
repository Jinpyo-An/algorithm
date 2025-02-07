package chapter05;

public class MyArray {

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0};
        int[] arr1 = new int[6];

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr2[1][2]);

        arr2[1][2] = 7;
        System.out.println(arr2[1][2]);
    }
}
