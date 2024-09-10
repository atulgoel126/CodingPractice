package leetcode.dijkstras_algorithm.q743;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetworkDelayTimeTests {
    @Test
    public void testSimpleGraph() {
        NetworkDelayTime ob = new NetworkDelayTime();
        int[][] times = {{1,2,1}, {2,3,2}, {3,4,3}, {4,5,4}};
        int N = 5;
        int K = 1;
        int expected = 10;
        int actual = ob.networkDelayTime(times, N, K);
        assertEquals(expected, actual);
    }

    @Test
    public void testDisconnectedGraph() {
        NetworkDelayTime ob = new NetworkDelayTime();
        int[][] times = {{1,2,1}, {3,4,2}, {5,6,3}};
        int N = 6;
        int K = 1;
        int expected = -1;
        int actual = ob.networkDelayTime(times, N, K);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyGraph() {
        NetworkDelayTime ob = new NetworkDelayTime();
        int[][] times = {};
        int N = 5;
        int K = 1;
        int expected = -1;
        int actual = ob.networkDelayTime(times, N, K);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleNodeMultipleIncomingEdges() {
        NetworkDelayTime ob = new NetworkDelayTime();
        int[][] times = {{1,2,1}, {2,3,2}, {3,1,3}};
        int N = 3;
        int K = 1;
        int expected = 3;
        int actual = ob.networkDelayTime(times, N, K);
        assertEquals(expected, actual);
    }

    @Test
    public void testComplexGraph() {
        NetworkDelayTime ob = new NetworkDelayTime();
        int[][] times = {{1,2,1}, {2,3,7}, {1,3,4}, {2,4,2}, {3,5,3}, {4,5,5}, {5,6,1}, {4,6,6}, {6,7,2}, {7,8,3}};
        int N = 8;
        int K = 1;
        int expected = 13;
        int actual = ob.networkDelayTime(times, N, K);
        assertEquals(expected, actual);
    }

    @Test
    public void testGraphWithCycle() {
        NetworkDelayTime ob = new NetworkDelayTime();
        int[][] times = {{1,2,1}, {2,3,2}, {3,4,3}, {4,2,1}, {2,5,4}};
        int N = 5;
        int K = 1;
        int expected = 6;
        int actual = ob.networkDelayTime(times, N, K);
        assertEquals(expected, actual);
    }

    @Test
    public void testGraphWithMultipleShortestPaths() {
        NetworkDelayTime ob = new NetworkDelayTime();
        int[][] times = {{1,2,1}, {1,3,1}, {2,4,2}, {3,4,2}, {4,5,1}};
        int N = 5;
        int K = 1;
        int expected = 4;
        int actual = ob.networkDelayTime(times, N, K);
        assertEquals(expected, actual);
    }

    @Test
    public void testLargeGraph() {
        NetworkDelayTime ob = new NetworkDelayTime();
        int[][] times = new int[1000][3];
        for (int i = 0; i < 999; i++) {
            times[i] = new int[]{i+1, i+2, 1};
        }
        times[999] = new int[]{1000, 1, 1000};
        int N = 1000;
        int K = 1;
        int expected = 999;
        int actual = ob.networkDelayTime(times, N, K);
        assertEquals(expected, actual);
    }

    @Test
    public void testGraphWithIsolatedNodes() {
        NetworkDelayTime ob = new NetworkDelayTime();
        int[][] times = {{1,2,1}, {2,3,2}, {4,5,3}};
        int N = 6;
        int K = 1;
        int expected = -1;
        int actual = ob.networkDelayTime(times, N, K);
        assertEquals(expected, actual);
    }

    @Test
    public void testGraphWithSelfLoop() {
        NetworkDelayTime ob = new NetworkDelayTime();
        int[][] times = {{1,1,1}, {1,2,2}, {2,3,3}};
        int N = 3;
        int K = 1;
        int expected = 5;
        int actual = ob.networkDelayTime(times, N, K);
        assertEquals(expected, actual);
    }
}