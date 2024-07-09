package leetcode.tree.q103;

import static org.junit.jupiter.api.Assertions.*;

import leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import java.util.*;
import leetcode.tree.q103.BinaryTreeZigzagLevelOrderTraversal;

public class BinaryTreeZigzagLevelOrderTraversalTests {

    // Sample tree for testing
    private static TreeNode sampleTree;

    @BeforeAll
    static void setup() {
        // Create a sample tree
        //               1
        //            /     \
        //           2       3
        //          / \     / \
        //         4   5   6   7
        //               /       \
        //              8         9
        sampleTree = new TreeNode(1);
        sampleTree.left = new TreeNode(2);
        sampleTree.right = new TreeNode(3);
        sampleTree.left.left = new TreeNode(4);
        sampleTree.left.right = new TreeNode(5);
        sampleTree.right.left = new TreeNode(6);
        sampleTree.right.right = new TreeNode(7);
        sampleTree.right.left.left = new TreeNode(8);
        sampleTree.right.right.right = new TreeNode(9);
    }

    // Test to cover the basic functionality of the zigzagLevelOrder method
    @Test
    public void testZigzagLevelOrder() {
        // Create an instance of the class to be tested
        BinaryTreeZigzagLevelOrderTraversal ob = new BinaryTreeZigzagLevelOrderTraversal();

        // Get the expected output
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(3, 2));
        expected.add(Arrays.asList(4, 5, 6, 7));
        expected.add(Arrays.asList(9, 8));

        // Get the actual output
        List<List<Integer>> actual = ob.zigzagLevelOrder(sampleTree);

        // Compare the expected and actual output
        assertEquals(expected, actual);
    }

    // Test to check if the method returns an empty list when given an empty tree
    @Test
    public void testEmptyTree() {
        // Create an empty tree
        TreeNode emptyTree = null;

        // Create an instance of the class to be tested
        BinaryTreeZigzagLevelOrderTraversal ob = new BinaryTreeZigzagLevelOrderTraversal();

        // Get the expected output
        List<List<Integer>> expected = new ArrayList<>();

        // Get the actual output
        List<List<Integer>> actual = ob.zigzagLevelOrder(emptyTree);

        // Compare the expected and actual output
        assertEquals(expected, actual);
    }

    // Test to check if the method correctly handles a tree with only one node
    @Test
    public void testSingleNodeTree() {
        // Create a tree with only one node
        TreeNode singleNodeTree = new TreeNode(5);

        // Create an instance of the class to be tested
        BinaryTreeZigzagLevelOrderTraversal ob = new BinaryTreeZigzagLevelOrderTraversal();

        // Get the expected output
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(5));

        // Get the actual output
        List<List<Integer>> actual = ob.zigzagLevelOrder(singleNodeTree);

        // Compare the expected and actual output
        assertEquals(expected, actual);
    }

    // Test to check if the method correctly handles a tree with only left childs
    @Test
    public void testLeftChildTree() {
        // Create a tree with only left children
        TreeNode leftChildTree = new TreeNode(1);
        leftChildTree.left = new TreeNode(2);
        leftChildTree.left.left = new TreeNode(3);
        leftChildTree.left.left.left = new TreeNode(4);

        // Create an instance of the class to be tested
        BinaryTreeZigzagLevelOrderTraversal ob = new BinaryTreeZigzagLevelOrderTraversal();

        // Get the expected output
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(4));

        // Get the actual output
        List<List<Integer>> actual = ob.zigzagLevelOrder(leftChildTree);

        // Compare the expected and actual output
        assertEquals(expected, actual);
    }

    // Test to check if the method correctly handles a tree with only right children
    @Test
    public void testRightChildTree() {
        // Create a tree with only right children
        TreeNode rightChildTree = new TreeNode(1);
        rightChildTree.right = new TreeNode(2);
        rightChildTree.right.right = new TreeNode(3);
        rightChildTree.right.right.right = new TreeNode(4);

        // Create an instance of the class to be tested
        BinaryTreeZigzagLevelOrderTraversal ob = new BinaryTreeZigzagLevelOrderTraversal();

        // Get the expected output
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(4));

        // Get the actual output
        List<List<Integer>> actual = ob.zigzagLevelOrder(rightChildTree);

        // Compare the expected and actual output
        assertEquals(expected, actual);
    }

    // Test to check if the method correctly handles a tree with alternating levels of left and right children
    @Test
    public void testAlternatingTree() {
        // Create a tree with alternating levels of left and right children
        TreeNode alternatingTree = new TreeNode(1);
        alternatingTree.left = new TreeNode(2);
        alternatingTree.right = new TreeNode(3);
        alternatingTree.left.left = new TreeNode(4);
        alternatingTree.left.right = new TreeNode(5);
        alternatingTree.right.left = new TreeNode(6);
        alternatingTree.right.right = new TreeNode(7);
        alternatingTree.left.left.left = new TreeNode(8);
        alternatingTree.right.right.right = new TreeNode(9);

        // Create an instance of the class to be tested
        BinaryTreeZigzagLevelOrderTraversal ob = new BinaryTreeZigzagLevelOrderTraversal();

        // Get the expected output
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(3, 2));
        expected.add(Arrays.asList(4, 5, 6, 7));
        expected.add(Arrays.asList(9, 8));

        // Get the actual output
        List<List<Integer>> actual = ob.zigzagLevelOrder(alternatingTree);

        // Compare the expected and actual output
        assertEquals(expected, actual);
    }

    // Test to check if the method correctly handles a tree with nodes in a non-consecutive level sequence
    @Test
    public void testNonConsecutiveTree() {
        // Create a tree with nodes in a non-consecutive level sequence
        TreeNode nonConsecutiveTree = new TreeNode(1);
        nonConsecutiveTree.right = new TreeNode(2);
        nonConsecutiveTree.left = new TreeNode(3);
        nonConsecutiveTree.right.right = new TreeNode(4);
        nonConsecutiveTree.right.left = new TreeNode(5);
        nonConsecutiveTree.left.right = new TreeNode(6);
        nonConsecutiveTree.left.left = new TreeNode(7);
        nonConsecutiveTree.right.right.left = new TreeNode(8);
        nonConsecutiveTree.left.left.right = new TreeNode(9);

        // Create an instance of the class to be tested
        BinaryTreeZigzagLevelOrderTraversal ob = new BinaryTreeZigzagLevelOrderTraversal();

        // Get the expected output
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(3, 2));
        expected.add(Arrays.asList(4, 5, 6, 7));
        expected.add(Arrays.asList(9, 8));

        // Get the actual output
        List<List<Integer>> actual = ob.zigzagLevelOrder(nonConsecutiveTree);

        // Compare the expected and actual output
        assertEquals(expected, actual);
    }

    // Test to check if the method correctly handles a tree with multiple nodes having the same value
    @Test
    public void testDuplicateValuesTree() {
        // Create a tree with multiple nodes having the same value
        TreeNode duplicateValuesTree = new TreeNode(1);
        duplicateValuesTree.left = new TreeNode(2);
        duplicateValuesTree.right = new TreeNode(3);
        duplicateValuesTree.left.left = new TreeNode(4);
        duplicateValuesTree.left.right = new TreeNode(4);
        duplicateValuesTree.right.left = new TreeNode(3);
        duplicateValuesTree.right.right = new TreeNode(2);

        // Create an instance of the class to be tested
        BinaryTreeZigzagLevelOrderTraversal ob = new BinaryTreeZigzagLevelOrderTraversal();

        // Get the expected output
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(3, 2));
        expected.add(Arrays.asList(4, 4, 3, 2));

        // Get the actual output
        List<List<Integer>> actual = ob.zigzagLevelOrder(duplicateValuesTree);

        // Compare the expected and actual output
        assertEquals(expected, actual);
    }
}