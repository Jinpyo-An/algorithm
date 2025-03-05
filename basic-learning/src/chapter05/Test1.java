package chapter05;

import java.util.Arrays;

public class Test1 {

    public static int[] solution(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] solution2(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }

    public static void main(String[] args) {
        int[] org = {4, 2, 3, 1, 5};
        int[] sorted = solution2(org);
        System.out.println(Arrays.toString(org));
        System.out.println(Arrays.toString(sorted));
    }
}
