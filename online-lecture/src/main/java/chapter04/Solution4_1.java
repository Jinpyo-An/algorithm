package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution4_1 {

    public static int solution(String S, String T) {
        int count = 0;
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        char[] arrS = S.toCharArray();
        int lt = 0;
        for(int i = 0; i < T.length() - 1; i++) {
            mapS.put(arrS[i], mapS.getOrDefault(arrS[i], 0) + 1);
        }
        for(char ch: T.toCharArray()) {
            mapT.put(ch, mapT.getOrDefault(ch, 0) + 1);
        }

        for(int rt = T.length() - 1; rt < arrS.length; rt++) {
            mapS.put(arrS[rt], mapS.getOrDefault(arrS[rt], 0) + 1);

            if(mapS.equals(mapT)) count++;

            mapS.put(arrS[lt], mapS.get(arrS[lt]) - 1);
            if(mapS.get(arrS[lt]) == 0) mapS.remove(arrS[lt]);
            lt++;
        }

        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();

        System.out.println(solution(S, T));
    }
}
