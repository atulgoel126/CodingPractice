package leetcode.q1135;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConnectingCitiesMinCostTests {

    @Test
    public void testExample1() {
        ConnectingCitiesMinCost ob = new ConnectingCitiesMinCost();
        int N = 3;
        int[][] connections = {{1, 2, 5}, {1, 3, 6}, {2, 3, 1}};
        int expected = 6;
        assertEquals(expected, ob.minimumCost(N, connections));
    }

    @Test
    public void testExample2() {
        ConnectingCitiesMinCost ob = new ConnectingCitiesMinCost();
        int N = 4;
        int[][] connections = {{1, 2, 3}, {3, 4, 4}};
        int expected = -1;
        assertEquals(expected, ob.minimumCost(N, connections));
    }

    @Test
    public void testSingleCity() {
        ConnectingCitiesMinCost ob = new ConnectingCitiesMinCost();
        int N = 1;
        int[][] connections = {};
        int expected = 0;
        assertEquals(expected, ob.minimumCost(N, connections));
    }

    @Test
    public void testTwoCitiesOneConnection() {
        ConnectingCitiesMinCost ob = new ConnectingCitiesMinCost();
        int N = 2;
        int[][] connections = {{1, 2, 10}};
        int expected = 10;
        assertEquals(expected, ob.minimumCost(N, connections));
    }

    @Test
    public void testMultipleCitiesDisconnected() {
        ConnectingCitiesMinCost ob = new ConnectingCitiesMinCost();
        int N = 4;
        int[][] connections = {{1, 2, 3}, {3, 4, 4}};
        int expected = -1;
        assertEquals(expected, ob.minimumCost(N, connections));
    }

    @Test
    public void testAllCitiesConnectedDirectly() {
        ConnectingCitiesMinCost ob = new ConnectingCitiesMinCost();
        int N = 4;
        int[][] connections = {{1, 2, 1}, {2, 3, 1}, {3, 4, 1}, {4, 1, 1}};
        int expected = 3;
        assertEquals(expected, ob.minimumCost(N, connections));
    }

    @Test
    public void testLargeNumberOfCitiesAndConnections() {
        ConnectingCitiesMinCost ob = new ConnectingCitiesMinCost();
        int N = 10000;
        int[][] connections = new int[9999][3];
        for (int i = 0; i < 9999; i++) {
            connections[i][0] = i + 1;
            connections[i][1] = i + 2;
            connections[i][2] = 1;
        }
        int expected = 9999;
        assertEquals(expected, ob.minimumCost(N, connections));
    }

    @Test
    public void testZeroCostConnections() {
        ConnectingCitiesMinCost ob = new ConnectingCitiesMinCost();
        int N = 4;
        int[][] connections = {{1, 2, 0}, {2, 3, 0}, {3, 4, 0}, {4, 1, 0}};
        int expected = 0;
        assertEquals(expected, ob.minimumCost(N, connections));
    }
}