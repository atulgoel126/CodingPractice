package leetcode.prims_algorithm.q1584;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.prims_algorithm.q1584.MinCosttoConnectAllPoints;

public class MinCosttoConnectAllPointsTests {
    @Test
    public void testBasic() {
        MinCosttoConnectAllPoints ob = new MinCosttoConnectAllPoints();
        int[][] points = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        int expected = 20;
        int actual = ob.minCostConnectPoints(points);
        assertEquals(expected, actual, "Expected minimum cost should be 20 for the given points.");
    }

    @Test
    public void testOnePoint() {
        MinCosttoConnectAllPoints ob = new MinCosttoConnectAllPoints();
        int[][] points = {{0,0}};
        int expected = 0;
        int actual = ob.minCostConnectPoints(points);
        assertEquals(expected, actual, "Expected minimum cost to be 0 for a single point.");
    }

    @Test
    public void testNegativeCoordinates() {
        MinCosttoConnectAllPoints ob = new MinCosttoConnectAllPoints();
        int[][] points = {{-5,-10},{0,0},{10,-5},{-3,10}};
        int expected = 43;
        int actual = ob.minCostConnectPoints(points);
        assertEquals(expected, actual, "Expected minimum cost should be 43 for negative coordinates.");
    }

    @Test
    public void testEmptyArray() {
        MinCosttoConnectAllPoints ob = new MinCosttoConnectAllPoints();
        int[][] points = {};
        int expected = 0;
        int actual = ob.minCostConnectPoints(points);
        assertEquals(expected, actual, "Expected minimum cost should be 0 for an empty array.");
    }

    @Test
    public void testDuplicatePoints() {
        MinCosttoConnectAllPoints ob = new MinCosttoConnectAllPoints();
        int[][] points = {{0,0},{0,0},{0,0}};
        int expected = 0;
        int actual = ob.minCostConnectPoints(points);
        assertEquals(expected, actual, "Expected minimum cost should be 0 for duplicate points.");
    }
}