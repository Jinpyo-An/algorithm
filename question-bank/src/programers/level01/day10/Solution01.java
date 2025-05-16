package programers.level01.day10;

public class Solution01 {

    public int solution01(String s) {
        String[] words = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        for (int i = 0; i < words.length; i++) {
            s = s.replaceAll(words[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
