//package leetcode.dijkstras_algorithm.q743;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.dijkstras_algorithm.q743.NetworkDelayTime;
//
//public class NetworkDelayTimeTests {
//    @Test
//    public void testSimpleGraph() {
//        NetworkDelayTime ob = new NetworkDelayTime();
//        int[][] times = {{1,2,1}, {2,3,2}, {3,4,3}, {4,5,4}};
//        int N = 5;
//        int K = 1;
//        int expected = 10;
//        int actual = ob.networkDelayTime(times, N, K);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testSingleNode() {
//        NetworkDelayTime ob = new NetworkDelayTime();
//        int[][] times = {{1,1,1}};
//        int N = 1;
//        int K = 1;
//        int expected = 1;
//        int actual = ob.networkDelayTime(times, N, K);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testDisconnectedGraph() {
//        NetworkDelayTime ob = new NetworkDelayTime();
//        int[][] times = {{1,2,1}, {3,4,2}, {5,6,3}};
//        int N = 6;
//        int K = 1;
//        int expected = -1;
//        int actual = ob.networkDelayTime(times, N, K);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testNegativeWeightEdge() {
//        NetworkDelayTime ob = new NetworkDelayTime();
//        int[][] times = {{1,2,-1}, {2,3,-2}, {3,4,-3}, {4,5,-4}};
//        int N = 5;
//        int K = 1;
//        int expected = -1;
//        int actual = ob.networkDelayTime(times, N, K);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testEmptyGraph() {
//        NetworkDelayTime ob = new NetworkDelayTime();
//        int[][] times = {};
//        int N = 5;
//        int K = 1;
//        int expected = -1;
//        int actual = ob.networkDelayTime(times, N, K);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testSingleNodeMultipleIncomingEdges() {
//        NetworkDelayTime ob = new NetworkDelayTime();
//        int[][] times = {{1,2,1}, {2,3,2}, {3,1,3}};
//        int N = 3;
//        int K = 1;
//        int expected = 3;
//        int actual = ob.networkDelayTime(times, N, K);
//        assertEquals(expected, actual);
//    }
//
//}