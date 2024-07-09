//package leetcode.tree.q114;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import leetcode.commons.TreeNode;
//import org.junit.jupiter.api.Test;
//import leetcode.tree.q114.FlattenBinaryTreetoLinkedList;
//
//public class FlattenBinaryTreetoLinkedListTests {
//    @Test
//    public void testEmptyTree() {
//        FlattenBinaryTreetoLinkedList ob = new FlattenBinaryTreetoLinkedList();
//        TreeNode root = null;
//        TreeNode expected = null;
//
//        ob.flatten(root);
//        assertArrayEquals(expected, root);
//    }
//
//    @Test
//    public void testSingleNodeTree() {
//        FlattenBinaryTreetoLinkedList ob = new FlattenBinaryTreetoLinkedList();
//        TreeNode root = new TreeNode(1);
//        int[] expected = {1};
//
//        ob.flatten(root);
//        assertArrayEquals(expected, root);
//    }
//
//    @Test
//    public void testLeftSubtree() {
//        FlattenBinaryTreetoLinkedList ob = new FlattenBinaryTreetoLinkedList();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        int[] expected = {1, null, 2};
//
//        ob.flatten(root);
//        assertArrayEquals(expected, root);
//    }
//
//    @Test
//    public void testRightSubtree() {
//        FlattenBinaryTreetoLinkedList ob = new FlattenBinaryTreetoLinkedList();
//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        int[] expected = {1, null, 2};
//
//        ob.flatten(root);
//        assertArrayEquals(expected, root);
//    }
//
//    @Test
//    public void testBothSubtrees() {
//        FlattenBinaryTreetoLinkedList ob = new FlattenBinaryTreetoLinkedList();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        int[] expected = {1, null, 2, null, 3};
//
//        ob.flatten(root);
//        assertArrayEquals(expected, root);
//    }
//
//    @Test
//    public void testUnbalancedTree() {
//        FlattenBinaryTreetoLinkedList ob = new FlattenBinaryTreetoLinkedList();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.left.left = new TreeNode(4);
//        int[] expected = {1, null, 2, null, 3, null, 4};
//
//        ob.flatten(root);
//        assertArrayEquals(expected, root);
//    }
//
//    @Test
//    public void testDuplicateValues() {
//        FlattenBinaryTreetoLinkedList ob = new FlattenBinaryTreetoLinkedList();
//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(1);
//        root.right.right = new TreeNode(2);
//        int[] expected = {1, null, 1, null, 2};
//
//        ob.flatten(root);
//        assertArrayEquals(expected, root);
//    }
//
//    @Test
//    public void testNullValuesInTree() {
//        FlattenBinaryTreetoLinkedList ob = new FlattenBinaryTreetoLinkedList();
//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        root.right.left = new TreeNode(3);
//        int[] expected = {1, null, 2, 3};
//
//        ob.flatten(root);
//        assertArrayEquals(expected, root);
//    }
//}