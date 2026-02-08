package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution2_2 {

    public static String solution(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str1.toCharArray()) map.put(ch, map.getOrDefault(ch, 0) + 1);
        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) return "NO";
            map.put(ch, map.get(ch) - 1);
        }

        return "YES";
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(solution(str1, str2));
    }
}
