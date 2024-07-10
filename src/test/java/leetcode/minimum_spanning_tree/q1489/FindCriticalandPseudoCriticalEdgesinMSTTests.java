import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import leetcode.minimum_spanning_tree.q1489.FindCriticalandPseudoCriticalEdgesinMST;

public class FindCriticalandPseudoCriticalEdgesinMSTTests {
    
    static int[][] testGraph; // graph for testing
    static int[][] expectedCriticalEdges; // expected critical edges for testGraph
    static int[][] expectedPseudoCriticalEdges; // expected pseudo-critical edges for testGraph
    
    @BeforeAll
    public static void init() {
        // initialize testGraph
        testGraph = new int[][] {{0, 1, 1}, {0, 2, 5}, {1, 2, 1}, {1, 3, 3}, {2, 3, 4}};
        // initialize expected critical edges for testGraph
        expectedCriticalEdges = new int[][] {{0, 1, 1}, {1, 2, 1}, {1, 3, 3}, {2, 3, 4}};
        // initialize expected pseudo-critical edges for testGraph
        expectedPseudoCriticalEdges = new int[][] {{0, 1, 1}, {1, 2, 1}, {1, 3, 3}};
    }
    
    @Test
    public void testFindCriticalEdges() {
        FindCriticalandPseudoCriticalEdgesinMST ob = new FindCriticalandPseudoCriticalEdgesinMST();
        int[][] actualCriticalEdges = ob.findCriticalEdges(testGraph);
        
        assertEquals(expectedCriticalEdges.length, actualCriticalEdges.length);
        
        // loop through each edge in expectedCriticalEdges and make sure it is present in actualCriticalEdges
        for (int[] edge : expectedCriticalEdges) {
            boolean edgeFound = false;
            
            for (int[] actualEdge : actualCriticalEdges) {
                // if edge is found in actualCriticalEdges, mark edgeFound as true
                if (edge[0] == actualEdge[0] && edge[1] == actualEdge[1] && edge[2] == actualEdge[2]) {
                    edgeFound = true;
                    break;
                }
            }
            
            // if edge is not found in actualCriticalEdges, fail the test
            if (!edgeFound) {
                fail("Critical edge not found: " + edge[0] + "->" + edge[1] + " with weight " + edge[2]);
            }
        }
    }
    
    @Test
    public void testFindPseudoCriticalEdges() {
        FindCriticalandPseudoCriticalEdgesinMST ob = new FindCriticalandPseudoCriticalEdgesinMST();
        int[][] actualPseudoCriticalEdges = ob.findPseudoCriticalEdges(testGraph);
        
        assertEquals(expectedPseudoCriticalEdges.length, actualPseudoCriticalEdges.length);
        
        // loop through each edge in expectedPseudoCriticalEdges and make sure it is present in actualPseudoCriticalEdges
        for (int[] edge : expectedPseudoCriticalEdges) {
            boolean edgeFound = false;
            
            for (int[] actualEdge : actualPseudoCriticalEdges) {
                // if edge is found in actualPseudoCriticalEdges, mark edgeFound as true
                if (edge[0] == actualEdge[0] && edge[1] == actualEdge[1] && edge[2] == actualEdge[2]) {
                    edgeFound = true;
                    break;
                }
            }
            
            // if edge is not found in actualPseudoCriticalEdges, fail the test
            if (!edgeFound) {
                fail("Pseudo-critical edge not found: " + edge[0] + "->" + edge[1] + " with weight " + edge[2]);
            }
        }
    }
    
    @Test
    public void testNullInput() {
        FindCriticalandPseudoCriticalEdgesinMST ob = new FindCriticalandPseudoCriticalEdgesinMST();
        
        assertThrows(NullPointerException.class, () -> ob.findCriticalEdges(null)); // null input for findCriticalEdges
        assertThrows(NullPointerException.class, () -> ob.findPseudoCriticalEdges(null)); // null input for findPseudoCriticalEdges
    }
    
    @Test
    public void testEmptyGraph() {
        FindCriticalandPseudoCriticalEdgesinMST ob = new FindCriticalandPseudoCriticalEdgesinMST();
        
        assertArrayEquals(new int[][] {}, ob.findCriticalEdges(new int[][] {})); // empty graph for findCriticalEdges
        assertArrayEquals(new int[][] {}, ob.findPseudoCriticalEdges(new int[][] {})); // empty graph for findPseudoCriticalEdges
    }
    
    @Test
    public void testDisconnectedGraph() {
        FindCriticalandPseudoCriticalEdgesinMST ob = new FindCriticalandPseudoCriticalEdgesinMST();
        int[][] disconnectedGraph = new int[][] {{0, 1, 1}, {2, 3, 2}}; // disconnected graph for testing
        
        assertArrayEquals(new int[][] {}, ob.findCriticalEdges(disconnectedGraph)); // disconnected graph for findCriticalEdges
        assertArrayEquals(new int[][] {}, ob.findPseudoCriticalEdges(disconnectedGraph)); // disconnected graph for findPseudoCriticalEdges
    }
    
    @Test
    public void testDuplicateEdges() {
        FindCriticalandPseudoCriticalEdgesinMST ob = new FindCriticalandPseudoCriticalEdgesinMST();
        int[][] graphWithDuplicates = new int[][] {{0, 1, 1}, {0, 1, 1}, {1, 2, 1}, {1, 2, 1}, {1, 3, 3}, {1, 3, 3}}; // graph with duplicate edges for testing
        
        int[][] actualCriticalEdges = ob.findCriticalEdges(graphWithDuplicates);
        int[][] actualPseudoCriticalEdges = ob.findPseudoCriticalEdges(graphWithDuplicates);
        
        // make sure there are no duplicate edges in the results
        for (int[] edge : actualCriticalEdges) {
            int count = 0;
            for (int[] actualEdge : actualCriticalEdges) {
                if (edge[0] == actualEdge[0] && edge[1] == actualEdge[1] && edge[2] == actualEdge[2]) {
                    count++;
                }
            }
            
            assertEquals(1, count); // there should only be one instance of each edge in actualCriticalEdges
        }
        
        for (int[] edge : actualPseudoCriticalEdges) {
            int count = 0;
            for (int[] actualEdge : actualPseudoCriticalEdges) {
                if (edge[0] == actualEdge[0] && edge[1] == actualEdge[1] && edge[2] == actualEdge[2]) {
                    count++;
                }
            }
            
            assertEquals(1, count); // there should only be one instance of each edge in actualPseudoCriticalEdges
        } 
    }
}