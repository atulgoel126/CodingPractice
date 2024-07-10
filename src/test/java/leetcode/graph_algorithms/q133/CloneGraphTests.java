//package leetcode.graph_algorithms.q133;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.graph_algorithms.q133.CloneGraph;
//
//public class CloneGraphTests {
//    @Test
//    public void testCloneSingleNodeGraph() {
//        // Setup
//        CloneGraph ob = new CloneGraph();
//        Node node = new Node(1);
//
//        // Execute
//        Node clonedGraph = ob.cloneGraph(node);
//
//        // Assert
//        assertEquals(node.val, clonedGraph.val);
//        assertTrue(clonedGraph.neighbors.isEmpty());
//    }
//
//    @Test
//    public void testCloneGraphWithMultipleNodes() {
//        // Setup
//        CloneGraph ob = new CloneGraph();
//
//        // Create nodes
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//
//        // Connect nodes
//        node1.neighbors.add(node2);
//        node2.neighbors.add(node1);
//        node2.neighbors.add(node3);
//        node3.neighbors.add(node2);
//
//        // Execute
//        Node clonedGraph = ob.cloneGraph(node1);
//
//        // Assert
//        assertEquals(node1.val, clonedGraph.val);
//        assertEquals(node2.val, clonedGraph.neighbors.get(0).val);
//        assertEquals(node3.val, clonedGraph.neighbors.get(1).val);
//        assertEquals(2, clonedGraph.neighbors.size());
//
//        // Check neighbor nodes
//        assertEquals(1, clonedGraph.neighbors.get(0).neighbors.size()); // should only have node1 as neighbor
//        assertEquals(node1.val, clonedGraph.neighbors.get(0).neighbors.get(0).val);
//        assertEquals(1, clonedGraph.neighbors.get(1).neighbors.size()); // should only have node2 as neighbor
//        assertEquals(node2.val, clonedGraph.neighbors.get(1).neighbors.get(0).val);
//    }
//
//    @Test
//    public void testCloneGraphWithDisconnectedNodes() {
//        // Setup
//        CloneGraph ob = new CloneGraph();
//
//        // Create nodes
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//
//        //Execute
//        Node clonedGraph = ob.cloneGraph(node1);
//
//        // Assert
//        assertEquals(2, clonedGraph.val);
//        assertTrue(clonedGraph.neighbors.isEmpty());
//
//        // Check original nodes are not affected
//        assertEquals(1, node1.val);
//        assertTrue(node1.neighbors.isEmpty());
//        assertEquals(2, node2.val);
//        assertTrue(node2.neighbors.isEmpty());
//    }
//
//    @Test
//    public void testCloneGraphWithDuplicateNodes() {
//        // Setup
//        CloneGraph ob = new CloneGraph();
//
//        // Create nodes
//        Node node1 = new Node(1);
//        Node node2 = node1;
//
//        // Execute
//        Node clonedGraph = ob.cloneGraph(node1);
//
//        // Assert
//        assertEquals(1, clonedGraph.val);
//        assertTrue(clonedGraph.neighbors.contains(clonedGraph)); // should have self-loop
//    }
//
//    @Test
//    public void testCloneGraphWithNullNode() {
//        // Setup
//        CloneGraph ob = new CloneGraph();
//
//        // Execute and Assert
//        assertThrows(NullPointerException.class, () -> ob.cloneGraph(null));
//    }
//}