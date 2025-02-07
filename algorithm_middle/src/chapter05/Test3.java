package chapter05;

import java.util.Collections;
import java.util.TreeSet;

public class Test3 {
    private static int[] solution(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (Integer num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = set.pollFirst();
        }

        return result;
    }
}
