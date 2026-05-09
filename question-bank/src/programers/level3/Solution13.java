package programers.level3;

import java.util.*;

public class Solution13 {

    public int[] solution(String[] gems) {
        Set<String> gemSpecies = new HashSet<>(Arrays.asList(gems));
        int targetCount = gemSpecies.size();

        Map<String, Integer> gemMap = new HashMap<>();
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int[] answer = new int[2];

        for (int end = 0; end < gems.length; end++) {
            gemMap.put(gems[end], gemMap.getOrDefault(gems[end], 0) + 1);

            while (gemMap.size() == targetCount) {
                if (end - start < minLen) {
                    minLen = end - start;
                    answer[0] = start + 1;
                    answer[1] = end + 1;
                }

                String startGem = gems[start];
                gemMap.put(startGem, gemMap.get(startGem) - 1);

                if (gemMap.get(startGem) == 0) {
                    gemMap.remove(startGem);
                }
                start++;
            }
        }

        return answer;
    }
}
