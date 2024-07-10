package leetcode.prims_algorithm.q1584;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinCosttoConnectAllPoints {
    public int minCostConnectPoints(int[][] points) {

        int n = points.length;
        if (n == 0) {
            return 0;
        }

        // Create an array of Point objects
        Point[] pointArray = new Point[n];
        for (int i = 0; i < n; i++) {
            pointArray[i] = new Point(points[i][0], points[i][1]);
        }

        // Min heap to store (cost, pointIndex)
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(o -> o[0])
        );

        boolean[] visited = new boolean[n];

        // cost to self is zero, index 0 because self
        minHeap.add(new int[]{0, 0});

        int totalCost = 0;
        int pointsConnected = 0;

        while (!minHeap.isEmpty() && pointsConnected < n) {
            // cost, index of Point
            int[] currentPoint = minHeap.poll();
            int cost = currentPoint[0];
            int pointIndex = currentPoint[1];

            if (visited[pointIndex]) {
                continue;
            }

            visited[pointIndex] = true;
            totalCost += cost;
            pointsConnected++;

            for (int i = 0; i < points.length; i++) {
                if (visited[i]) {
                    continue;
                }
                int distance = pointArray[pointIndex].getDistance(pointArray[i]);
                minHeap.add(new int[]{distance, i});
            }
        }
        return totalCost;
    }

    private static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int getDistance(Point other) {
            return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
        }
    }

}
