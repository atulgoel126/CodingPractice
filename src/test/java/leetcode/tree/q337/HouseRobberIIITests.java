//package leetcode.tree.q337;
//
//import leetcode.commons.TreeNode;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class HouseRobberIIITests {
//
//    @Test
//    public void testTreeWithUnbalancedNodes() {
//        HouseRobberIII ob = new HouseRobberIII();
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(5);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right.right = new TreeNode(1);
//        root.left.left.left = new TreeNode(2);
//        root.left.right.right = new TreeNode(1);
//
//        assertEquals(ob.rob(root), 11);
//    }
//
//    @Test
//    public void testTreeWithCircularNodes() {
//        HouseRobberIII ob = new HouseRobberIII();
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(5);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right.right = root;
//
//        assertEquals(ob.rob(root), 10);
//    }
//
//    @Test
//    public void testTreeWithLargeNumberValues() {
//        HouseRobberIII ob = new HouseRobberIII();
//        TreeNode root = new TreeNode(Integer.MAX_VALUE);
//        root.left = new TreeNode(Integer.MAX_VALUE);
//        root.right = new TreeNode(Integer.MAX_VALUE);
//
//        assertEquals(ob.rob(root), Integer.MAX_VALUE);
//    }
//
//    @Test
//    public void testTreeWithNonIntegerValues() {
//        HouseRobberIII ob = new HouseRobberIII();
//        TreeNode root = new TreeNode(3.5);
//        root.left = new TreeNode(4.2);
//        root.right = new TreeNode(5.9);
//
//        // Since the problem only allows positive integer values,
//        // we expect an IllegalArgumentException to be thrown.
//        assertThrows(IllegalArgumentException.class, () -> {ob.rob(root);});
//    }
//
//    @Test
//    public void testTreeWithNullValues() {
//        HouseRobberIII ob = new HouseRobberIII();
//        TreeNode root = new TreeNode(3);
//        root.left = null;
//        root.right = null;
//
//        assertEquals(ob.rob(root), 3);
//    }
//
//    @Test
//    public void testTreeWithDuplicateNodes() {
//        HouseRobberIII ob = new HouseRobberIII();
//        TreeNode root = new TreeNode(3);
//        root.left = new TreeNode(4);
//        root.right = new TreeNode(5);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right.right = new TreeNode(1);
//        root.left.left = root.right;
//
//        assertEquals(ob.rob(root), 9);
//    }
//}
