/*
배열의 최대 길이: 100,000
 */
package chapter04;

import java.util.Arrays;

public class Solution01 {

    public int[] solution01(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public int[] solution02(int[] arr) {
        final int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }
}
