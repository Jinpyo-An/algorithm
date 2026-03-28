package chapter09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution6 {

    // 각 학생의 부모 노드를 저장할 배열
    static int[] unf;

    // 특정 학생이 속한 무리의 '최상위 대표'를 찾는 함수
    public static int Find(int v) {
        // 자기 자신이 대표인 경우 (루트 노드)
        if (v == unf[v]) {
            return v;
        } else {
            // 루트 노드를 찾음과 동시에 자신의 부모를 루트 노드로 바로 연결
            return unf[v] = Find(unf[v]);
        }
    }

    // 두 학생이 속한 무리를 하나로 합치는 함수
    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);

        if (fa != fb) {
            unf[fa] = fb;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        unf = new int[n + 1];

        // 처음에는 모든 학생이 자기 자신을 대표로 설정
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        // M개의 친구 관계를 입력받으며 무리를 합친다.
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            Union(a, b);
        }

        // 친구 여부를 확인할 두 학생 입력
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        if (Find(x) == Find(y)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
