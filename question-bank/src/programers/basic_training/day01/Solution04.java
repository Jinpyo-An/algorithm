package programers.basic_training.day01;

import java.util.Scanner;

public class Solution04 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);

            if (Character.isUpperCase(a)) {
                a = Character.toLowerCase(a);
            } else {
                a = Character.toUpperCase(a);
            }

            System.out.print(a);
        }
            
    }
}
