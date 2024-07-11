package leetcode.dijkstras_algorithm.q743;

import java.util.*;

public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int N, int k) {
        List<Edge>[] graph = new List[N + 1];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : times) {
            int u = edge[0];
            int v = edge[1];
            int cost = edge[2];
            graph[u].add(new Edge(v, cost));
        }

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.cost));

        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        pq.add(new Edge(k, 0));
        dist[k] = 0;

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int u = current.vertex;
            int d = current.cost;

            if (dist[u] < d) {
                continue;
            }

            for (Edge neighbor : graph[u]) {
                int v = neighbor.vertex;
                int newDist = dist[u] + neighbor.cost;

                if (newDist < dist[v]) {
                    dist[v] = newDist;
                    pq.add(new Edge(v, newDist));
                }
            }
        }

        int maxDist = Arrays.stream(dist).skip(1).max().getAsInt();
        return maxDist == Integer.MAX_VALUE ? -1 : maxDist;
    }

    class Edge {
        int vertex;
        int cost;
        public Edge(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }
    }
}
