package leetcode.tree.q662;

import static org.junit.jupiter.api.Assertions.*;

import leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;
import leetcode.tree.q662.MaximumWidthofBinaryTree;

public class MaximumWidthofBinaryTreeTests {
    
    @Test
    public void testWidthEmptyTree() {
        MaximumWidthofBinaryTree ob = new MaximumWidthofBinaryTree();
        assertEquals(0, ob.widthOfBinaryTree(null));
    }
    
    @Test
    public void testWidthSingleNodeTree() {
        MaximumWidthofBinaryTree ob = new MaximumWidthofBinaryTree();
        TreeNode root = new TreeNode(1);
        assertEquals(1, ob.widthOfBinaryTree(root));
    }
    
    @Test
    public void testWidthBalancedTree() {
        MaximumWidthofBinaryTree ob = new MaximumWidthofBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(2, ob.widthOfBinaryTree(root));
    }
    
    @Test
    public void testWidthUnbalancedTree() {
        MaximumWidthofBinaryTree ob = new MaximumWidthofBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        assertEquals(4, ob.widthOfBinaryTree(root));
    }
    
    @Test
    public void testWidthTreeWithNegativeValues() {
        MaximumWidthofBinaryTree ob = new MaximumWidthofBinaryTree();
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(-2);
        root.right = new TreeNode(-3);
        assertEquals(2, ob.widthOfBinaryTree(root));
    }
    
    @Test
    public void testWidthTreeWithIntegerMaxValue() {
        MaximumWidthofBinaryTree ob = new MaximumWidthofBinaryTree();
        TreeNode root = new TreeNode(Integer.MAX_VALUE);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(3, ob.widthOfBinaryTree(root));
    }
    
    @Test
    public void testWidthTreeWithDuplicateValues() {
        MaximumWidthofBinaryTree ob = new MaximumWidthofBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        assertEquals(2, ob.widthOfBinaryTree(root));
    }
    
    @Test
    public void testWidthNullNode() {
        MaximumWidthofBinaryTree ob = new MaximumWidthofBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        assertEquals(2, ob.widthOfBinaryTree(root));
    }
    
    @Test
    public void testWidthTreeWithOnlyRightChild() {
        MaximumWidthofBinaryTree ob = new MaximumWidthofBinaryTree();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        assertEquals(1, ob.widthOfBinaryTree(root));
    }
    
    @Test
    public void testWidthTreeWithOnlyLeftChild() {
        MaximumWidthofBinaryTree ob = new MaximumWidthofBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertEquals(1, ob.widthOfBinaryTree(root));
    }

}