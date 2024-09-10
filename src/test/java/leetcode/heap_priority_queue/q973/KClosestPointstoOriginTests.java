package leetcode.heap_priority_queue.q973;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void testKGreaterThanPoints() {
        KClosestPointstoOrigin ob = new KClosestPointstoOrigin();
        int[][] points = {{1, 2}, {3, 4}, {-1, 1}};
        int k = 4;
        assertThrows(IllegalArgumentException.class, () -> {
            ob.kClosest(points, k);
        });
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