package programers.basictraining.day23;

public class Solution02 {

    public String solution(String[] strList, String ex) {
        StringBuilder sb = new StringBuilder();

        for (String str : strList) {
            if (!str.contains(ex)) {
                sb.append(str);
            }
        }

        return sb.toString();
    }
}
