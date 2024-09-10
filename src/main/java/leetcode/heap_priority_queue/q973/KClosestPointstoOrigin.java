package leetcode.heap_priority_queue.q973;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointstoOrigin {
    public int[][] kClosest(int[][] points, int k) {

        if (k > points.length) {
            throw new IllegalArgumentException("value of k cannot be greater than the size of input.");
        }

        PriorityQueue<Point> heap = new PriorityQueue<Point>(
                new Comparator<Point>() {
                    @Override
                    public int compare(Point a, Point b) {
                        long d1 = a.sqDist;
                        long d2 = b.sqDist;
                        if (d1 == d2) {
                            return 0;
                        }
                        return d1 > d2 ? 1 : -1;
                    }
                }
        );
        int count = 0;
        for (int[] point: points) {
            int x = point[0];
            int y = point[1];
            heap.add(new Point(x, y, ((long)x * x) + ((long)y * y)));
            count++;
        }

        int[][] result = new int[k][2];
        for (int[] p: result) {
            Point curr = heap.poll();
            p[0] = curr.x;
            p[1] = curr.y;
        }
        return result;
    }

    private class Point {
        int x;
        int y;
        long sqDist;
        public Point(int x, int y, long d) {
            this.x = x;
            this.y = y;
            this.sqDist = d;
        }

    }}
