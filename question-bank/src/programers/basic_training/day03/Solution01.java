package programers.basic_training.day03;

public class Solution01 {

    public String solution(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr1.length; i++) {
            String str3 = String.valueOf(arr1[i]);
            String str4 = String.valueOf(arr2[i]);
            sb.append(str3);
            sb.append(str4);
        }

        return sb.toString();
    }
}
