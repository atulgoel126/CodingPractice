//package leetcode.tree.q199;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import leetcode.commons.TreeNode;
//import org.junit.jupiter.api.Test;
//import leetcode.tree.q199.BinaryTreeRightSideView;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class BinaryTreeRightSideViewTests {
//    @Test
//    public void testEmptyTree() {
//        BinaryTreeRightSideView ob = new BinaryTreeRightSideView();
//        TreeNode root = null;
//        assertEquals(ob.rightSideView(root), new ArrayList<Integer>());
//    }
//
//    @Test
//    public void testSingleNodeTree() {
//        BinaryTreeRightSideView ob = new BinaryTreeRightSideView();
//        TreeNode root = new TreeNode(1);
//        List<Integer> expected = new ArrayList<Integer>(Collections.singletonList(1));
//        assertEquals(ob.rightSideView(root), expected);
//    }
//
//    @Test
//    public void testLeftSkewedTree() {
//        BinaryTreeRightSideView ob = new BinaryTreeRightSideView();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.left.left = new TreeNode(4);
//        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
//        assertEquals(ob.rightSideView(root), expected);
//    }
//
//    @Test
//    public void testRightSkewedTree() {
//        BinaryTreeRightSideView ob = new BinaryTreeRightSideView();
//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
//        root.right.right = new TreeNode(3);
//        root.right.right.right = new TreeNode(4);
//        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
//        assertEquals(ob.rightSideView(root), expected);
//    }
//
//    @Test
//    public void testCompleteTree() {
//        BinaryTreeRightSideView ob = new BinaryTreeRightSideView();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
//        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 3, 7));
//        assertEquals(ob.rightSideView(root), expected);
//    }
//
//    @Test
//    public void testUnbalancedTree() {
//        BinaryTreeRightSideView ob = new BinaryTreeRightSideView();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(4);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(5);
//        root.right.left.left = new TreeNode(7);
//        root.right.right = new TreeNode(6);
//        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 3, 6, 7));
//        assertEquals(ob.rightSideView(root), expected);
//    }
//
//    @Test
//    public void testTreeWithNullNodes() {
//        BinaryTreeRightSideView ob = new BinaryTreeRightSideView();
//        TreeNode root = new TreeNode(1);
//        root.left = null;
//        root.right = new TreeNode(2);
//        root.right.left = null;
//        root.right.right = new TreeNode(3);
//        root.right.right.right = new TreeNode(4);
//        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
//        assertEquals(ob.rightSideView(root), expected);
//    }
//
//    @Test
//    public void testTreeWithDuplicateValues() {
//        BinaryTreeRightSideView ob = new BinaryTreeRightSideView();
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.left.left = new TreeNode(4);
//        root.right.right = new TreeNode(4);
//        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 4));
//        assertEquals(ob.rightSideView(root), expected);
//    }
//}