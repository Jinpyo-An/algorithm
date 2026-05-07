package programers.level3;

import java.util.HashSet;
import java.util.Set;

public class Solution12 {

    Set<Integer> resultSet = new HashSet<>();

    public int solution(String[] user_id, String[] banned_id) {
        boolean[] visited = new boolean[user_id.length];
        dfs(0, 0, user_id, banned_id, visited);
        return resultSet.size();
    }

    private void dfs(int index, int bitmask, String[] user_id, String[] banned_id, boolean[] visited) {
        if (index == banned_id.length) {
            resultSet.add(bitmask);
            return;
        }

        for (int i = 0; i < user_id.length; i++) {
            if (visited[i] || !isMatch(user_id[i], banned_id[index])) {
                continue;
            }

            visited[i] = true;
            dfs(index + 1, bitmask | (1 << i), user_id, banned_id, visited);
            visited[i] = false;
        }
    }

    private boolean isMatch(String user, String banned) {
        if (user.length() != banned.length()) return false;

        for (int i = 0; i < user.length(); i++) {
            if (banned.charAt(i) == '*') continue;
            if (user.charAt(i) != banned.charAt(i)) return false;
        }

        return true;
    }
}
