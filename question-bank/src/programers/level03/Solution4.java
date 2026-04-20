package programers.level03;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution4 {

    static class Node {
        String word;
        int step;

        public Node(String word, int step) {
            this.word = word;
            this.step = step;
        }
    }

    public int solution(String begin, String target, String[] words) {
        boolean hasTarget = false;
        for (String word : words) {
            if (word.equals(target)) {
                hasTarget = true;
                break;
            }
        }
        if (!hasTarget) return 0;

        Deque<Node> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];

        queue.offer(new Node(begin, 0));

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.word.equals(target)) return current.step;

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && isConvertible(current.word, words[i])) {
                    visited[i] = true;
                    queue.offer(new Node(words[i], current.step + 1));
                }
            }
        }

        return 0;
    }

    private boolean isConvertible(String word1, String word2) {
        int diffCount = 0;

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) diffCount++;

            if (diffCount > 1) return false;
        }

        return diffCount == 1;
    }
}
