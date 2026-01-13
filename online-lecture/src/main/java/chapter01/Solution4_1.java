package chapter01;

import java.util.Scanner;

public class Solution4_1 {

    public String[] reverseStrings(String[] input) {
        String[] output = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = input[i].length() - 1; j >= 0; j--) {
                sb.append(input[i].charAt(j));
            }
            output[i] = sb.toString();
        }

        return output;
    }

    public static void main(String[] args) {
        Solution4_1 T = new Solution4_1();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] input = new String[N];
        for (int i = 0; i < N; i++) {
            input[i] = scanner.nextLine();
        }

        String[] answer = T.reverseStrings(input);

        for (String string : answer) {
            System.out.println(string);
        }
    }
}
