package chapter09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Edge implements Comparable<Edge> {

    int vertax;
    int cost;

    public Edge(int vex, int cost) {
        this.vertax = vex;
        this.cost = cost;
    }


    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Solution5 {

    static int N, M;
    static List<ArrayList<Edge>> graph = new ArrayList<>();
    static int[] dist;

    static void dijkstra(int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int now = current.vertax;
            int nowCost = current.cost;
            if (nowCost > dist[now]) continue;
            for (Edge ob : graph.get(now)) {
                if (dist[ob.vertax] > nowCost + ob.cost) {
                    dist[ob.vertax] = nowCost + ob.cost;
                    pq.offer(new Edge(ob.vertax, nowCost + ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Edge(b, c));
        }

        dijkstra(1);

        for (int i = 2; i <= N; i++) {
            if (dist[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dist[i]);
            else System.out.println(i + " : impossible");
        }
    }
}
