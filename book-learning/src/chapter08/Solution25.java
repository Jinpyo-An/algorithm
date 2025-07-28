/*
현재 노드를 부모 노드로 생각했을 때
전위 순회: 부모 노드 -> 왼쪽 자식 노드 -> 오른쪽 자식 노드
중위 순회: 왼쪽 자식 노드 -> 부모 노드 -> 오른쪽 자식 노드
후위 순회: 왼쪽 자식 노드 -> 오른쪽 자식 노드 -> 부모 노드
 */

package chapter08;

public class Solution25 {

    public String[] solution(int[] nodes) {
        String[] result = new String[3];
        result[0] = preorder(nodes, 0).trim();
        result[1] = inorder(nodes, 0).trim();
        result[2] = postorder(nodes, 0).trim();

        return result;
    }

    private static String preorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }

        return nodes[idx] + " " +
                preorder(nodes, 2 * idx + 1) +
                preorder(nodes, 2 * idx + 2);
    }

    private static String inorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }

        return inorder(nodes, 2 * idx + 1) +
                nodes[idx] + " " +
                inorder(nodes, 2 * idx + 2);
    }

    private static String postorder(int[] nodes, int idx) {
        if (idx >= nodes.length) {
            return "";
        }

        return postorder(nodes, 2 * idx + 1) +
                postorder(nodes, 2 * idx + 2) +
                nodes[idx] + " ";
    }
}
