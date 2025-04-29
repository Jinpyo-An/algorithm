package programers.level01.day02;

public class Solution07 {

    public boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        String sToLower = s.toLowerCase();

        for (int i = 0; i < sToLower.length(); i++) {
            char alphabet = sToLower.charAt(i);

            if (alphabet == 'p') {
                pCount++;
            }

            if (alphabet == 'y') {
                yCount++;
            }
        }

        return pCount == yCount;
    }
}
