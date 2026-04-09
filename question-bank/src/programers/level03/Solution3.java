package programers.level03;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution3 {

    public int[] solution(String[] operations) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (String op: operations) {
            String[] split = op.split(" ");
            String command = split[0];
            int value = Integer.parseInt(split[1]);

            if (command.equals("I")) {
                maxHeap.add(value);
                minHeap.add(value);
                map.put(value, map.getOrDefault(value, 0) + 1);
            } else {
                PriorityQueue<Integer> targetHeap = (value == 1) ? maxHeap : minHeap;
                removeInvalidValue(targetHeap, map);

                if (!targetHeap.isEmpty()) {
                    int removed = targetHeap.poll();
                    map.put(removed, map.get(removed) - 1);
                    if (map.get(removed) == 0) {
                        map.remove(removed);
                    }
                }
            }
        }

        removeInvalidValue(maxHeap, map);
        removeInvalidValue(minHeap, map);

        if (maxHeap.isEmpty() && minHeap.isEmpty()) {
            return new int[] {0, 0};
        }

        return new int[]{maxHeap.peek(), minHeap.peek()};
    }

    private void removeInvalidValue(PriorityQueue<Integer> heap, Map<Integer, Integer> map) {
        while (!heap.isEmpty() && !map.containsKey(heap.peek())) {
            heap.poll();
        }
    }
}
