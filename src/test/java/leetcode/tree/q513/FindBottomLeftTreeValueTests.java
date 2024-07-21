//package leetcode.tree.q513;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import leetcode.commons.TreeNode;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class FindBottomLeftTreeValueTests {
//
//    private FindBottomLeftTreeValue testClass;
//
//    @BeforeEach
//    void init() {
//        testClass = new FindBottomLeftTreeValue();
//    }
//
//    @Test
//    public void testSingleNodeTree() {
//        // initialize tree with only one node
//        TreeNode root = new TreeNode(1);
//
//        // expected result
//        int expected = 1;
//
//        // actual result
//        int actual = testClass.findBottomLeftValue(root);
//
//        // verify
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFullBinaryTree() {
//        // initialize tree with height of 3 (full binary tree)
//        //           1
//        //         /   \
//        //        2     3
//        //       / \   / \
//        //      4   5 6   7
//
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
//
//        // expected result
//        int expected = 4;
//
//        // actual result
//        int actual = testClass.findBottomLeftValue(root);
//
//        // verify
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testUnbalancedTree() {
//        // initialize tree with height of 4 (unbalanced)
//        //           1
//        //         /   \
//        //        2     3
//        //       / \     \
//        //      4   5     6
//        //     /   /
//        //    7   8
//
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.right = new TreeNode(6);
//        root.left.left.left = new TreeNode(7);
//        root.left.right.left = new TreeNode(8);
//
//        // expected result
//        int expected = 7;
//
//        // actual result
//        int actual = testClass.findBottomLeftValue(root);
//
//        // verify
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTreeWithNegativeValues() {
//        // initialize tree with negative values
//        //           -1
//        //         /   \
//        //        -2    -3
//        //       /     / \
//        //     -4     -5   -6
//
//        TreeNode root = new TreeNode(-1);
//        root.left = new TreeNode(-2);
//        root.right = new TreeNode(-3);
//        root.left.left = new TreeNode(-4);
//        root.right.left = new TreeNode(-5);
//        root.right.right = new TreeNode(-6);
//
//        // expected result
//        int expected = -4;
//
//        // actual result
//        int actual = testClass.findBottomLeftValue(root);
//
//        // verify
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTreeWithNullRoot() {
//        // initialize tree with null root
//        TreeNode root = null;
//
//        // expected result
//        int expected = 0;
//
//        // actual result
//        int actual = testClass.findBottomLeftValue(root);
//
//        // verify
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTreeWithOnlyRightChild() {
//        // initialize tree with only right child
//        //           1
//        //            \
//        //             2
//        //              \
//        //               3
//        //                \
//        //                 4
//        //                  \
//        //                   5
//
//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        root.right.right = new TreeNode(3);
//        root.right.right.right = new TreeNode(4);
//        root.right.right.right.right = new TreeNode(5);
//
//        // expected result
//        int expected = 5;
//
//        // actual result
//        int actual = testClass.findBottomLeftValue(root);
//
//        // verify
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTreeWithOnlyLeftChild() {
//        // initialize tree with only left child
//        //           1
//        //          /
//        //         2
//        //        /
//        //       3
//        //      /
//        //     4
//        //    /
//        //   5
//
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.left.left = new TreeNode(4);
//        root.left.left.left.left = new TreeNode(5);
//
//        // expected result
//        int expected = 5;
//
//        // actual result
//        int actual = testClass.findBottomLeftValue(root);
//
//        // verify
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTreeWithNegativeAndPositiveValues() {
//        // initialize tree with mix of negative and positive values
//        //           1
//        //         /   \
//        //        2    -3
//        //       / \     \
//        //     -4  -5     6
//        //           \    /
//        //            7  81
//
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(-3);
//        root.left.left = new TreeNode(-4);
//        root.left.right = new TreeNode(-5);
//        root.left.left.right = new TreeNode(7);
//        root.right.right = new TreeNode(6);
//        root.right.right.left = new TreeNode(81);
//
//        // expected result
//        int expected = 7;
//
//        // actual result
//        int actual = testClass.findBottomLeftValue(root);
//
//        // verify
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTreeWithOnlyOneRightChildBranch() {
//        // initialize tree with one branch of only right children
//        //           1
//        //         /   \
//        //        2     3
//        //         \     \
//        //          10    4
//        //               / \
//        //              7   8
//        //             /
//        //            9
//
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.right = new TreeNode(10);
//        root.right = new TreeNode(3);
//        root.right.right = new TreeNode(4);
//        root.right.right.left = new TreeNode(7);
//        root.right.right.right = new TreeNode(8);
//        root.right.right.left.left = new TreeNode(9);
//
//        // expected result
//        int expected = 9;
//
//        // actual result
//        int actual = testClass.findBottomLeftValue(root);
//
//        // verify
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testTreeWithOnlyOneLeftChildBranch() {
//        // initialize tree with one branch of only left children
//        //           1
//        //         /   \
//        //        2     3
//        //       /       \
//        //      4         5
//        //     /           \
//        //    6             7
//        //   /               \
//        //  8                 9
//
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(4);
//        root.left.left.left = new TreeNode(6);
//        root.left.left.left.left = new TreeNode(8);
//        root.right = new TreeNode(3);
//        root.right.right = new TreeNode(5);
//        root.right.right.right = new TreeNode(7);
//        root.right.right.right.right = new TreeNode(9);
//
//        // expected result
//        int expected = 8;
//
//        // actual result
//        int actual = testClass.findBottomLeftValue(root);
//
//        // verify
//        assertEquals(expected, actual);
//    }
//}