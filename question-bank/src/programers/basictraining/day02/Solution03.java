package programers.basictraining.day02;

import java.util.Scanner;

public class Solution03 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] strArr = str.toCharArray();

        for (char c : strArr) {
            System.out.println(c);
        }
    }
}
