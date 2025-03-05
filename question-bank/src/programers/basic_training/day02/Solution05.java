package programers.basic_training.day02;

public class Solution05 {

    public static String solution(String my_string, String overwrite_string, int s) {
        char[] myArr = my_string.toCharArray();
        char[] owArr = overwrite_string.toCharArray();

        for (int i = 0; i < owArr.length; i++) {
            myArr[s + i] = owArr[i];
        }

        return String.valueOf(myArr);
    }
}
