//package leetcode.tree.q222;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//
//public class CountCompleteTreeNodesTests {
//
//    private CountCompleteTreeNodes countCompleteTreeNodes;
//
//    @BeforeEach
//    public void setup() {
//        countCompleteTreeNodes = new CountCompleteTreeNodes();
//    }
//
//    @Test
//    public void testCountNodes_fullCompleteTree() {
//        // create a full complete tree with depth 3
//        // expected total number of nodes: 15
//        Node root = TreeUtils.createTree(new int[] {1, 2, 3, 4, 5, 6, 7});
//        assertEquals(15, countCompleteTreeNodes.countNodes(root));
//    }
//
//    @Test
//    public void testCountNodes_partialCompleteTree() {
//        // create a partial complete tree with depth 3
//        // expected total number of nodes: 6
//        Node root = TreeUtils.createTree(new int[] {1, 2, 3, 4, 5, 6});
//        assertEquals(6, countCompleteTreeNodes.countNodes(root));
//    }
//
//    @Test
//    public void testCountNodes_fullCompleteTree_depth1() {
//        // create a full complete tree with depth 1
//        // expected total number of nodes: 1
//        Node root = TreeUtils.createTree(new int[] {1});
//        assertEquals(1, countCompleteTreeNodes.countNodes(root));
//    }
//
//    @Test
//    public void testCountNodes_emptyTree() {
//        // create an empty tree
//        // expected total number of nodes: 0
//        Node root = null;
//        assertEquals(0, countCompleteTreeNodes.countNodes(root));
//    }
//
//    @Test
//    public void testCountNodes_nullRoot() {
//        // root is null
//        // expected total number of nodes: 0
//        Node root = null;
//        assertEquals(0, countCompleteTreeNodes.countNodes(root));
//    }
//
//    @Test
//    public void testCountNodes_singleLeftChild() {
//        // create tree with only a left child
//        // expected total number of nodes: 2
//        Node root = TreeUtils.createTree(new int[] {1, 2});
//        assertEquals(2, countCompleteTreeNodes.countNodes(root));
//    }
//
//    @Test
//    public void testCountNodes_singleRightChild() {
//        // create tree with only a right child
//        // expected total number of nodes: 2
//        Node root = TreeUtils.createTree(new int[] {1, -1, 2});
//        assertEquals(2, countCompleteTreeNodes.countNodes(root));
//    }
//
//    @Test
//    public void testCountNodes_fullCompleteTree_depth2() {
//        // create a full complete tree with depth 2
//        // expected total number of nodes: 7
//        Node root = TreeUtils.createTree(new int[] {1, 2, 3});
//        assertEquals(7, countCompleteTreeNodes.countNodes(root));
//    }
//
//    @Test
//    public void testCountNodes_perfectBinaryTree() {
//        // create a perfect binary tree with depth 3
//        // expected total number of nodes: 7
//        Node root = TreeUtils.createTree(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
//        assertEquals(10, countCompleteTreeNodes.countNodes(root));
//    }
//
//    @Test
//    public void testCountNodes_unbalancedTree() {
//        // create an unbalanced tree with depth 3
//        // expected total number of nodes: 6
//        Node root = TreeUtils.createTree(new int[] {1, 2, 3, 4});
//        assertEquals(6, countCompleteTreeNodes.countNodes(root));
//    }
//}