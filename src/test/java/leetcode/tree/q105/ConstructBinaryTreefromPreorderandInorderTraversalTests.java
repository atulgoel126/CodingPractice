package leetcode.tree.q105;

import static org.junit.jupiter.api.Assertions.*;

import leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;
import leetcode.tree.q105.ConstructBinaryTreefromPreorderandInorderTraversal;

public class ConstructBinaryTreefromPreorderandInorderTraversalTests {

    // Test case to check if an empty array is passed for both preorder and inorder
    @Test
    public void testEmptyArrays() {
        ConstructBinaryTreefromPreorderandInorderTraversal ob = new ConstructBinaryTreefromPreorderandInorderTraversal();
        int[] preorder = {};
        int[] inorder = {};
        assertNull(ob.buildTree(preorder, inorder));
    }

    // Test case to check if the preorder and inorder arrays have different lengths
    @Test
    public void testDifferentLengths() {
        ConstructBinaryTreefromPreorderandInorderTraversal ob = new ConstructBinaryTreefromPreorderandInorderTraversal();
        int[] preorder = { 1, 2, 3 };
        int[] inorder = { 2, 3, 1, 4 };
        assertNull(ob.buildTree(preorder, inorder));
    }

    // Test case to check if both preorder and inorder arrays have duplicate values
    @Test
    public void testDuplicateValues() {
        ConstructBinaryTreefromPreorderandInorderTraversal ob = new ConstructBinaryTreefromPreorderandInorderTraversal();
        int[] preorder = { 1, 2, 1 };
        int[] inorder = { 2, 1, 1 };
        TreeNode root = ob.buildTree(preorder, inorder);
        assertEquals(1, root.val); // check if root is assigned correctly
        assertEquals(1, root.left.val); // check if left subtree is constructed correctly
        assertEquals(2, root.right.val); // check if right subtree is constructed correctly
    }

    // Test case to check if preorder or inorder arrays contain negative values
    @Test
    public void testNegativeValues() {
        ConstructBinaryTreefromPreorderandInorderTraversal ob = new ConstructBinaryTreefromPreorderandInorderTraversal();
        int[] preorder = { -1, 2, 3 };
        int[] inorder = { 2, -3, -1 };
        TreeNode root = ob.buildTree(preorder, inorder);
        assertEquals(-1, root.val); // check if root is assigned correctly
        assertEquals(-1, root.left.val); // check if left subtree is constructed correctly
        assertEquals(2, root.right.val); // check if right subtree is constructed correctly
    }

    // Test case to check if both preorder and inorder arrays contain only one value
    @Test
    public void testSingleNode() {
        ConstructBinaryTreefromPreorderandInorderTraversal ob = new ConstructBinaryTreefromPreorderandInorderTraversal();
        int[] preorder = { 1 };
        int[] inorder = { 1 };
        TreeNode root = ob.buildTree(preorder, inorder);
        assertNotNull(root); // check if root is present
        assertEquals(1, root.val); // check if root is assigned correctly
        assertNull(root.left); // check if left subtree is null
        assertNull(root.right); // check if right subtree is null
    }

    // Test case to check if the preorder and inorder arrays result in a skewed tree
    @Test
    public void testSkewedTree() {
        ConstructBinaryTreefromPreorderandInorderTraversal ob = new ConstructBinaryTreefromPreorderandInorderTraversal();
        int[] preorder = { 1, 2, 3, 4, 5, 6 };
        int[] inorder = { 3, 2, 4, 1, 6, 5 };
        TreeNode root = ob.buildTree(preorder, inorder);
        assertEquals(1, root.val); // check if root is assigned correctly
        assertEquals(2, root.left.val); // check if left subtree is constructed correctly
        assertEquals(3, root.left.left.val); // check if left subtree of left subtree is constructed correctly
        assertEquals(4, root.left.right.val); // check if right subtree of left subtree is constructed correctly
        assertEquals(5, root.right.val); // check if right subtree is constructed correctly
        assertEquals(6, root.right.left.val); // check if left subtree of right subtree is constructed correctly
    }

    // Test case to check if the preorder and inorder arrays result in a complete binary tree
    @Test
    public void testCompleteBinaryTree() {
        ConstructBinaryTreefromPreorderandInorderTraversal ob = new ConstructBinaryTreefromPreorderandInorderTraversal();
        int[] preorder = { 1, 2, 4, 5, 3, 6, 7 };
        int[] inorder = { 4, 2, 5, 1, 6, 3, 7 };
        TreeNode root = ob.buildTree(preorder, inorder);
        assertEquals(1, root.val); // check if root is assigned correctly
        assertEquals(2, root.left.val); // check if left subtree is constructed correctly
        assertEquals(4, root.left.left.val); // check if left subtree of left subtree is constructed correctly
        assertEquals(5, root.left.right.val); // check if right subtree of left subtree is constructed correctly
        assertEquals(3, root.right.val); // check if right subtree is constructed correctly
        assertEquals(6, root.right.left.val); // check if left subtree of right subtree is constructed correctly
        assertEquals(7, root.right.right.val); // check if right subtree of right subtree is constructed correctly
    }

    // Test case to check if the preorder and inorder arrays result in a tree with only left nodes
    @Test
    public void testLeftSkewedTree() {
        ConstructBinaryTreefromPreorderandInorderTraversal ob = new ConstructBinaryTreefromPreorderandInorderTraversal();
        int[] preorder = { 1, 2, 3, 4, 5 };
        int[] inorder = { 5, 4, 3, 2, 1 };
        TreeNode root = ob.buildTree(preorder, inorder);
        assertEquals(1, root.val); // check if root is assigned correctly
        assertEquals(2, root.left.val); // check if left subtree is constructed correctly
        assertEquals(3, root.left.left.val); // check if left subtree of left subtree is constructed correctly
        assertEquals(4, root.left.left.left.val); // check if left subtree of left subtree of left subtree is constructed correctly
        assertEquals(5, root.left.left.left.left.val); // check if left subtree of left subtree of left subtree of left subtree is constructed correctly
        assertNull(root.right); // check if right subtree is null
    }

    // Test case to check if the preorder and inorder arrays result in a tree with only right nodes
    @Test
    public void testRightSkewedTree() {
        ConstructBinaryTreefromPreorderandInorderTraversal ob = new ConstructBinaryTreefromPreorderandInorderTraversal();
        int[] preorder = { 1, 2, 3, 4, 5 };
        int[] inorder = { 1, 2, 3, 4, 5 };
        TreeNode root = ob.buildTree(preorder, inorder);
        assertEquals(5, root.val); // check if root is assigned correctly
        assertEquals(4, root.right.val); // check if right subtree is constructed correctly
        assertEquals(3, root.right.right.val); // check if right subtree of right subtree is constructed correctly
        assertEquals(2, root.right.right.right.val); // check if right subtree of right subtree of right subtree is constructed correctly
        assertEquals(1, root.right.right.right.right.val); // check if right subtree of right subtree of right subtree of right subtree is constructed correctly
        assertNull(root.left); // check if left subtree is null
    }
}