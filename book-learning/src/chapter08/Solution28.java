/*
문제 설명
- 루트 노드에서 출발해 각 노드를 돌아다니며 양을 모은다.
- 내가 모은 양의 수보다 늑대의 수가 같거나 더 많으면 모든 양을 잡아 먹어버린다.
- 양이 늑대에게 잡아먹히지 않도록 하면서 최대한 많은 양의 수를 모아 다시 루트 노드로 가져와야 한다.
- 루트 노드에는 항상 양이 있음

입력값
- 각 노드에 있는 양 또는 늑대에 대한 정보가 담긴 배열 info
- 이진 트리의 각 노드들의 연결 관계를 담은 2차원 배열 edges

반환값
- 각 노드를 방문하여 모을 수 있는 양의 최대 마리를 반환

제약 조건
- info[i]는 i번 노드에 있는 양 또는 늑대를 나타낸다.
- info의 0은 양, 1은 늑대
- info[0]의 값은 항상 0
 */

package chapter08;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class Solution28 {

    // 현재 위치, 양의 수, 늑대의 수, 방문한 노드의 저장을 위한 클래스
    private static class Info {
        int node, sheep, wolf;
        HashSet<Integer> visited;

        public Info(int node, int sheep, int wolf, HashSet<Integer> visited) {
            this.node = node;
            this.sheep = sheep;
            this.wolf = wolf;
            this.visited = visited;
        }
    }

    private static ArrayList<Integer>[] tree; // 트리 정보를 저장할 인접 리스트

    // 1. 트리 구축 메서드
    private static void buildTree(int[] info, int[][] edges) {
        tree = new ArrayList[info.length];
        for (int i = 0; i < tree.length; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
        }
    }

    public int solution01(int[] info, int[][] edges) {
        buildTree(info, edges); // 2. 트리 생성
        int answer = 0; // 3. 최대 양의 수를 저장할 변수

        // 4. BFS를 위한 큐 생성 및 초기 상태 설정
        ArrayDeque<Info> queue = new ArrayDeque<>();
        queue.add(new Info(0, 1, 0, new HashSet<>()));

        // BFS(너비 우선 탐색) 시작
        while (!queue.isEmpty()) {
            // 5. 큐에서 현재 상태를 꺼냄
            Info now = queue.poll();
            // 6. 최대 양의 수 업데이트
            answer = Math.max(answer, now.sheep);
            // 7. 방문한 노드 집합에 현재 노드의 이웃 노드 추가
            now.visited.addAll(tree[now.node]);

            // 8. 인접한 노드들에 대해 탐색
            for (int next : now.visited) {
                // 9. 기존 해시셋의 데이터를 복사하고 현재 방문한 정점을 해시셋에서 제거
                HashSet<Integer> set = new HashSet<>(now.visited);
                set.remove(next);

                if (info[next] == 1) { // 늑대일 경우
                    if (now.sheep != now.wolf + 1) {
                        queue.add(new Info(next, now.sheep, now.wolf + 1, set));
                    }
                }
                else { // 양일 경우
                    queue.add(new Info(next, now.sheep + 1, now.wolf, set));
                }
            }
        }

        return answer;
    }
}
