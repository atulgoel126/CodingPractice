package leetcode.tree.q230;

import static org.junit.jupiter.api.Assertions.*;

import leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;


public class KthSmallestElementinaBSTTests {


	@Test
	public void testSingleNodeTree() {
		// Create a single node BST with value 5
		TreeNode root = new TreeNode(5);
		KthSmallestElementinaBST ob = new KthSmallestElementinaBST();
		assertEquals(5, ob.kthSmallest(root, 1));
	}

	@Test
	public void testBalancedTree() {
		// Create a balanced BST:        4
		//                              /   \
		//                             2     6
		//                            / \   / \
		//                           1   3 5   7
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);

		KthSmallestElementinaBST ob = new KthSmallestElementinaBST();
		assertEquals(1, ob.kthSmallest(root, 1));
		assertEquals(4, ob.kthSmallest(root, 5));
		assertEquals(7, ob.kthSmallest(root, 7));
	}

	@Test
	public void testUnbalancedTree() {
		// Create an unbalanced BST:       5
		//                               /   \
		//                             2       8
		//                           /  \     / \
		//                          1    3   7   9
		//                                 \   /
		//                                  4 6

		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(9);
		root.left.right.right = new TreeNode(4);
		root.right.left.left = new TreeNode(6);

		KthSmallestElementinaBST ob = new KthSmallestElementinaBST();
		assertEquals(1, ob.kthSmallest(root, 1));
		assertEquals(4, ob.kthSmallest(root, 4));
		assertEquals(5, ob.kthSmallest(root, 5));
		assertEquals(8, ob.kthSmallest(root, 8));
		assertEquals(9, ob.kthSmallest(root, 9));
	}

	@Test
	public void testDuplicateValues() {
		// Create a BST with duplicate values:       5
		//                                         /   \
		//                                        3     8
		//                                      /  \   / \
		//                                     3    4 7   10
		//                                                      				

		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(10);

		KthSmallestElementinaBST ob = new KthSmallestElementinaBST();
		assertEquals(3, ob.kthSmallest(root, 1));
		assertEquals(3, ob.kthSmallest(root, 2));
		assertEquals(5, ob.kthSmallest(root, 3));
		assertEquals(7, ob.kthSmallest(root, 5));
		assertEquals(10, ob.kthSmallest(root, 7));
	}

	@Test
	public void testEmptyTree() {
		KthSmallestElementinaBST ob = new KthSmallestElementinaBST();
		assertThrows(NullPointerException.class, () -> {ob.kthSmallest(null, 1);});
	}

	@Test
	public void testNegativeK() {
		// Create a balanced BST:        5
		//                              /   \
		//                             2     6
		//                            / \   / \
		//                           1   3 5   7
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);

		KthSmallestElementinaBST ob = new KthSmallestElementinaBST();
		assertThrows(IllegalArgumentException.class, () -> {ob.kthSmallest(root, -1);});
	}

	@Test
	public void testInvalidK() {
		// Create a balanced BST:        5
		//                              /   \
		//                             2     6
		//                            / \   / \
		//                           1   3 5   7
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(7);

		KthSmallestElementinaBST ob = new KthSmallestElementinaBST();
		assertThrows(IllegalArgumentException.class, () -> {ob.kthSmallest(root, 8);});
	}

}