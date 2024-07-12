package leetcode.dijkstras_algorithm.q787;

import java.util.List;

public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {

        List<Edge>[] graph = new List[n];


        return -1;
    }

    class Edge {
        int vertex;
        int cost;
        int cityCount;

//        public Edge(int vertex, int cost) {
//            this(vertex, cost, 0);
//        }

        public Edge(int vertex, int cost, int cityCount) {
            this.vertex = vertex;
            this.cost = cost;
            this.cityCount = cityCount;
        }
    }
}
