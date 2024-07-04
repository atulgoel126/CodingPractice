package leetcode.q938;

import leetcode.commons.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumOfBstTests {

  // Act
  RangeSumOfBst ob = new RangeSumOfBst();

  @Test
  public void testRangeSum() {
    // Arrange
    TreeNode root1 = new TreeNode(10);
    root1.left = new TreeNode(5);
    root1.right = new TreeNode(15);
    root1.left.left = new TreeNode(3);
    root1.left.right = new TreeNode(7);
    root1.right.right = new TreeNode(18);

    TreeNode root2 = new TreeNode(10);
    root2.left = new TreeNode(5);
    root2.right = new TreeNode(15);
    root2.left.left = new TreeNode(3);
    root2.left.right = new TreeNode(7);
    root2.right.left = new TreeNode(13);
    root2.right.right = new TreeNode(18);
    root2.left.left.left = new TreeNode(1);
    root2.left.right.left = new TreeNode(6);

    // Assert
    assertEquals(32, ob.rangeSumBST(root1, 7, 15));
    assertEquals(23, ob.rangeSumBST(root2, 6, 10));
  }

  @Test
  public void edgeCases() {
    // Edge case 3: Tree is null
    TreeNode root3 = null;
    assertEquals(0, ob.rangeSumBST(root3, 0, 100));

    // Edge case 4: Tree contains one node, and the node is not within the range
    TreeNode root4 = new TreeNode(5);
    assertEquals(0, ob.rangeSumBST(root4, 10, 20));

    // Edge case 5: Tree contains one node and the node is within the range
    TreeNode root5 = new TreeNode(15);
    assertEquals(15, ob.rangeSumBST(root5, 10, 20));
  }

  @Test
  public void negativeNumbers() {
    // Test Case 6: Tree contains negative numbers and the range is negative
    TreeNode root6 = new TreeNode(-10);
    root6.left = new TreeNode(-20);
    root6.right = new TreeNode(-30);
    assertEquals(-60, ob.rangeSumBST(root6, -40, -5));

    // Test Case 7: Tree contains negative and positive numbers, and range includes negative and positive numbers
    TreeNode root7 = new TreeNode(-10);
    root7.left = new TreeNode(20);
    root7.right = new TreeNode(-30);
    assertEquals(10, ob.rangeSumBST(root7, -25, 25));
  }
}