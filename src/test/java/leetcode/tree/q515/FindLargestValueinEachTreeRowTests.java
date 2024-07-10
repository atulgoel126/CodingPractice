package leetcode.tree.q515;

import static org.junit.jupiter.api.Assertions.*;

import leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FindLargestValueinEachTreeRowTests {
    @Test
    public void testSingleNode() {
        // Test if the code works for a tree with only one node
        TreeNode root = new TreeNode(5);
        FindLargestValueinEachTreeRow ob = new FindLargestValueinEachTreeRow();
        assertEquals(ob.largestValues(root), 5);
    }
    
    @Test
    public void testEmptyTree() {
        // Test if the code returns an empty list if the tree is empty
        FindLargestValueinEachTreeRow ob = new FindLargestValueinEachTreeRow();
        assertEquals(ob.largestValues(null), new ArrayList<Integer>());
    }
    
    @Test
    public void testBalancedTree() {
        // Test a balanced tree to check if the code works correctly 
        // with a variety of node values and levels 
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        
        FindLargestValueinEachTreeRow ob = new FindLargestValueinEachTreeRow();
        assertEquals(ob.largestValues(root), new ArrayList<Integer>(Arrays.asList(5, 8, 9)));
    }
    
    @Test
    public void testUnbalancedTree() {
        // Test an unbalanced tree to check if the code correctly 
        // handles the deepest level with fewer nodes
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(9);
        
        FindLargestValueinEachTreeRow ob = new FindLargestValueinEachTreeRow();
        assertEquals(ob.largestValues(root), new ArrayList<Integer>(Arrays.asList(10, 15, 9)));
    }
    
    @Test
    public void testNegativeValues() {
        // Test if the code works correctly with negative node values
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(-5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(-12);
        root.left.right = new TreeNode(-8);
        
        FindLargestValueinEachTreeRow ob = new FindLargestValueinEachTreeRow();
        assertEquals(ob.largestValues(root), new ArrayList<Integer>(Arrays.asList(-10, -3, -8)));
    }
    
    @Test
    public void testDuplicateValues() {
        // Test if the code correctly handles duplicate node values
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(12);
        
        FindLargestValueinEachTreeRow ob = new FindLargestValueinEachTreeRow();
        assertEquals(ob.largestValues(root), new ArrayList<Integer>(Arrays.asList(10, 8, 12)));
    }
    
    @Test
    public void testNullNode() {
        // Test if the code correctly handles null values for nodes
        TreeNode root = new TreeNode(5);
        root.left = null;
        root.right = new TreeNode(7);
        
        FindLargestValueinEachTreeRow ob = new FindLargestValueinEachTreeRow();
        assertEquals(ob.largestValues(root), new ArrayList<Integer>(Arrays.asList(5, 7)));
    }
}

