package chapter07;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3_1 {

    public static int BFS(Node root) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        int L = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node tmp = queue.poll();
                if (tmp.lt == null && tmp.rt == null) return L;
                if (tmp.lt != null) queue.offer(tmp.lt);
                if (tmp.rt != null) queue.offer(tmp.rt);
            }
            L++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        System.out.println(BFS(root));
    }
}
