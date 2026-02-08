package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution2_1 {

    public static String solution(String str1, String str2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char ch : str1.toCharArray()) map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        for (char ch : str2.toCharArray()) map2.put(ch, map2.getOrDefault(ch, 0) + 1);

        if (map1.size() != map2.size()) return "NO";

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!map2.containsKey(entry.getKey())) return "NO";
            if (entry.getValue().equals(map2.get(entry.getKey()))) return "NO";
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
