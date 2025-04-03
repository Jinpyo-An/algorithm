package programers.basictraining.day18;

public class Solution03 {

    public int solution(String binomial) {
        String[] strArr = binomial.split(" ");
        int a = Integer.parseInt(strArr[0]);
        String op = strArr[1];
        int b = Integer.parseInt(strArr[2]);
        int result = 0;

        switch (op) {
            case "+":
                result = (a + b);
                break;
            case "-":
                result = (a - b);
            break;
            case "*":
                result = (a * b);
            break;
        }

        return result;
    }
}
