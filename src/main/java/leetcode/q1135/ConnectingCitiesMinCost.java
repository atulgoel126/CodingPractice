package leetcode.q1135;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ConnectingCitiesMinCost {
    public int minimumCost(int n, int[][] connections) {

        List<Edge>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] connection: connections) {
            // connection = {1, 2, 1}
            //              {u, v, cost}
            int u = connection[0] - 1;
            int v = connection[1] - 1;
            int cost = connection[2];
            graph[u].add(new Edge(v, cost));
            graph[v].add(new Edge(u, cost));
        }

        PriorityQueue<Edge> minHeap = new PriorityQueue<>(
                new Comparator<Edge>() {
                    @Override
                    public int compare(Edge e1, Edge e2) {
                        return e1.cost - e2.cost;
                    }
                }
        );

        boolean[] visited = new boolean[n];

        int edgesUsed = 0;
        int totalCost = 0;

        // Add the first edge. The cost to go to self is 0
        minHeap.add(new Edge(0, 0));

        while (!minHeap.isEmpty() && edgesUsed < n) {

            Edge edge = minHeap.poll();
            int u = edge.vertex;
            int cost = edge.cost;

            if (visited[u]) {
                continue;
            }

            visited[u] = true;
            totalCost +=cost;
            edgesUsed++;

            for (Edge neighbor: graph[u]) {
                int v = neighbor.vertex;
                int vCost = neighbor.cost;
                minHeap.add(new Edge(v, vCost));
            }
        }

        if (edgesUsed == n) {
            return totalCost;
        }
        return -1;
    }

    public static class Edge {
        int vertex;
        int cost;
        public Edge(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }
    }
}
