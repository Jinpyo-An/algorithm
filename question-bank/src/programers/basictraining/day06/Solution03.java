package programers.basictraining.day06;

public class Solution03 {

    public static String solution(int [] numLog) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numLog.length -1; i++) {
            int num = (numLog[i + 1] - numLog[i]);

            switch (num) {
                case 1:
                    sb.append('w');
                    break;
                case -1:
                    sb.append('s');
                    break;
                case 10:
                    sb.append('d');
                    break;
                case -10:
                    sb.append('a');
                    break;
            }
        }

        return sb.toString();
    }
}
