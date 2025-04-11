package programers.basictraining.day24;

public class Solution04 {

    public String solution(String myString) {
        char[] myStrToChArr = myString.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myStrToChArr.length; i++) {
            if (myStrToChArr[i] < 'l') {
                myStrToChArr[i] = 'l';
            }
        }

        for (char c : myStrToChArr) {
            sb.append(c);
        }

        return sb.toString();
    }
}
