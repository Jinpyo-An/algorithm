package chapter05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2);

        System.out.println(list.get(1));

        list.remove(list.size() - 1);
        System.out.println(list);

        int[] arr = {1, 2, 4, 5, 3};
        System.out.println(arr.length);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        Collections.sort(list);
        System.out.println(list);
    }
}
