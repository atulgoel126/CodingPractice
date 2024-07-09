package leetcode.heap_priority_queue.q973;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.heap_priority_queue.q973.KClosestPointstoOrigin;

public class KClosestPointstoOriginTests {
    @Test
    public void testBasic() {
        KClosestPointstoOrigin ob = new KClosestPointstoOrigin();
        int[][] points = {{1, 2}, {3, 4}, {-1, 1}};
        int[][] expected = {{-1, 1}, {1, 2}};
        int k = 2;
        int[][] actual = ob.kClosest(points, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEmptyPoints() {
        KClosestPointstoOrigin ob = new KClosestPointstoOrigin();
        int[][] points = {};
        int[][] expected = {};
        int k = 2;
        int[][] actual = ob.kClosest(points, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testKGreaterThanPoints() {
        KClosestPointstoOrigin ob = new KClosestPointstoOrigin();
        int[][] points = {{1, 2}, {3, 4}, {-1, 1}};
        int[][] expected = {{1, 2}, {-1, 1}, {3, 4}};
        int k = 4;
        int[][] actual = ob.kClosest(points, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testEqualPoints() {
        KClosestPointstoOrigin ob = new KClosestPointstoOrigin();
        int[][] points = {{1, 1}, {2, 2}, {3, 3}};
        int[][] expected = {{1, 1}, {2, 2}, {3, 3}};
        int k = 3;
        int[][] actual = ob.kClosest(points, k);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNegativePoints() {
        KClosestPointstoOrigin ob = new KClosestPointstoOrigin();
        int[][] points = {{-5, -5}, {-3, -3}, {-1, -1}};
        int[][] expected = {{-1, -1}, {-3, -3}};
        int k = 2;
        int[][] actual = ob.kClosest(points, k);
        assertArrayEquals(expected, actual);
    }
}