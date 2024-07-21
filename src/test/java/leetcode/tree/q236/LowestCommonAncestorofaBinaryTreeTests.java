//package leetcode.tree.q236;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import leetcode.commons.TreeNode;
//import org.junit.jupiter.api.*;
//
//public class LowestCommonAncestorofaBinaryTreeTests {
//
//  LowestCommonAncestorofaBinaryTree obj;
//
//  @BeforeEach
//  void setUp() throws Exception {
//    obj = new LowestCommonAncestorofaBinaryTree();
//  }
//
//  @Test
//  @DisplayName("Test normal case")
//  void testLowestCommonAncestor() {
//    TreeNode root = new TreeNode(1);
//    root.left = new TreeNode(2);
//    root.right = new TreeNode(3);
//    root.left.left = new TreeNode(4);
//    root.left.right = new TreeNode(5);
//    root.right.left = new TreeNode(6);
//    root.right.right = new TreeNode(7);
//
//    TreeNode lca = obj.lowestCommonAncestor(root, root.left, root.right);
//    assertEquals(1, lca.val);
//  }
//
//  @Test
//  @DisplayName("Test same node as root")
//  void testSameNodeAsRoot() {
//    TreeNode root = new TreeNode(1);
//    root.left = new TreeNode(2);
//    root.right = new TreeNode(3);
//
//    TreeNode lca = obj.lowestCommonAncestor(root, root.left, root.left);
//    assertEquals(2, lca.val);
//  }
//
//  @Test
//  @DisplayName("Test same node as ancestor")
//  void testSameNodeAsAncestor() {
//    TreeNode root = new TreeNode(1);
//    root.left = new TreeNode(2);
//    root.right = new TreeNode(3);
//    root.left.left = new TreeNode(4);
//    root.left.right = new TreeNode(5);
//    root.right.left = new TreeNode(6);
//    root.right.right = new TreeNode(7);
//
//    TreeNode lca = obj.lowestCommonAncestor(root, root.left.left, root.left.left);
//    assertEquals(4, lca.val);
//  }
//
//  @Test
//  @DisplayName("Test null nodes")
//  void testNullNodes() {
//    TreeNode root = new TreeNode(1);
//
//    TreeNode lca = obj.lowestCommonAncestor(root, null, null);
//    assertNull(lca);
//  }
//
//  @Test
//  @DisplayName("Test nodes not in the tree")
//  void testNodesNotInTree() {
//    TreeNode root = new TreeNode(1);
//    root.left = new TreeNode(2);
//    root.right = new TreeNode(3);
//
//    TreeNode node1 = new TreeNode(4);
//    TreeNode node2 = new TreeNode(5);
//
//    TreeNode lca = obj.lowestCommonAncestor(root, node1, node2);
//    assertNull(lca);
//  }
//
//}