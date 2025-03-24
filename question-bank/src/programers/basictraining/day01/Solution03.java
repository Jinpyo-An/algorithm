package programers.basictraining.day01;

import java.util.Scanner;

public class Solution03 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}
