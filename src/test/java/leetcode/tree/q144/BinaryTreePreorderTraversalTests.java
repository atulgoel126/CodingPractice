package leetcode.tree.q144;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.commons.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BinaryTreePreorderTraversalTests {

    // Test null root
    @Test
    public void testNullRoot() {
        BinaryTreePreorderTraversal ob = new BinaryTreePreorderTraversal();
        assertEquals(ob.preorderTraversal(null), new ArrayList<>());
    }

    // Test single node tree
    @Test
    public void testSingleNode() {
        BinaryTreePreorderTraversal ob = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        assertEquals(ob.preorderTraversal(root), Arrays.asList(1));
    }

    // Test complete balanced tree
    @Test
    public void testCompleteBalancedTree() {
        BinaryTreePreorderTraversal ob = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        assertEquals(ob.preorderTraversal(root), Arrays.asList(1,2,4,5,3,6,7));
    }

    // Test unbalanced tree with only left children
    @Test
    public void testLeftUnbalancedTree() {
        BinaryTreePreorderTraversal ob = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        assertEquals(ob.preorderTraversal(root), Arrays.asList(1,2,3,4));
    }

    // Test unbalanced tree with only right children
    @Test
    public void testRightUnbalancedTree() {
        BinaryTreePreorderTraversal ob = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        assertEquals(ob.preorderTraversal(root), Arrays.asList(1,2,3,4));
    }

    // Test tree with negative values
    @Test
    public void testTreeWithNegatives() {
        BinaryTreePreorderTraversal ob = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(-4);
        root.left.right = new TreeNode(-5);
        root.right.left = new TreeNode(-6);
        root.right.right = new TreeNode(-7);
        assertEquals(ob.preorderTraversal(root), Arrays.asList(-1,-2,-4,-5,-3,-6,-7));
    }

    // Test tree with duplicate values
    @Test
    public void testTreeWithDuplicates() {
        BinaryTreePreorderTraversal ob = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        assertEquals(ob.preorderTraversal(root), Arrays.asList(1,2,3,4,2,4,3));
    }

    // Test tree with large number of nodes
//    @Test
//    public void testLargeTree() {
//        BinaryTreePreorderTraversal ob = new BinaryTreePreorderTraversal();
//        // 20 levels complete balanced tree with a total of 2097151 nodes
//        TreeNode root = generateLargeTree();
//        List<Integer> expected = new ArrayList<>();
//        // The expected preorder traversal of this large tree
//        for (int i = 1; i <= 2097151; i++) {
//            expected.add(i);
//        }
//        assertEquals(ob.preorderTraversal(root), expected);
//    }

    // Helper method to generate a large complete balanced tree
    private TreeNode generateLargeTree() {
        TreeNode root = new TreeNode(1);

        for (int i = 2; i <= 1048575; i *= 2) { // Double the number of levels each time
            expandTree(root, i);
        }

        return root;
    }

    // Helper method to recursively expand the tree to the desired level
    private void expandTree(TreeNode node, int level) {
        if (level == 1) {
            // Reached the desired level, no more expansion needed
            return;
        } else {
            // Double the number of nodes each time
            node.left = new TreeNode(2*node.val);
            node.right = new TreeNode(2*node.val + 1);
            // Expand the left and right subtrees
            expandTree(node.left, level-1);
            expandTree(node.right, level-1);
        }
    }
}