/*
t의 원소의 길이만큼 순회한다.
for(i = 0 ; i < t.length - p.length i++)

 */

package programers.level01.day07;

public class Solution03 {

    public int solution(String t, String p) {
        int count = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            long num1 = Long.parseLong(t.substring(i, i + p.length()));
            long num2 = Long.parseLong(p);
            if (num1 <= num2) count++;
        }

        return count;
    }
}
