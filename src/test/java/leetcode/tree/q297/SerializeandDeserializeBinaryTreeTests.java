//package leetcode.tree.q297;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import leetcode.commons.TreeNode;
//import org.junit.jupiter.api.Test;
//import leetcode.tree.q297.SerializeandDeserializeBinaryTree;
//
//public class SerializeandDeserializeBinaryTreeTests {
//    @Test
//    public void testEmptyTree() {
//        SerializeandDeserializeBinaryTree ob = new SerializeandDeserializeBinaryTree();
//        String serializedTree = ob.serialize(null);
//        assertNull(serializedTree);
//        TreeNode deserializedTree = ob.deserialize(serializedTree);
//        assertNull(deserializedTree);
//    }
//
//    @Test
//    public void testSingleNodeTree() {
//        SerializeandDeserializeBinaryTree ob = new SerializeandDeserializeBinaryTree();
//        TreeNode root = new TreeNode(5);
//        String serializedTree = ob.serialize(root);
//        assertNotNull(serializedTree);
//        assertEquals("5", serializedTree);
//        TreeNode deserializedTree = ob.deserialize(serializedTree);
//        assertNotNull(deserializedTree);
//        assertEquals(root.val, deserializedTree.val);
//        assertNull(deserializedTree.left);
//        assertNull(deserializedTree.right);
//    }
//
//    @Test
//    public void testBalancedTree() {
//        SerializeandDeserializeBinaryTree ob = new SerializeandDeserializeBinaryTree();
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(8);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(4);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(9);
//        String serializedTree = ob.serialize(root);
//        assertNotNull(serializedTree);
//        assertEquals("5,3,8,1,4,6,9", serializedTree);
//        TreeNode deserializedTree = ob.deserialize(serializedTree);
//        assertNotNull(deserializedTree);
//        assertEquals(root.val, deserializedTree.val);
//        assertEquals(root.left.val, deserializedTree.left.val);
//        assertEquals(root.right.val, deserializedTree.right.val);
//        assertEquals(root.left.left.val, deserializedTree.left.left.val);
//        assertEquals(root.left.right.val, deserializedTree.left.right.val);
//        assertEquals(root.right.left.val, deserializedTree.right.left.val);
//        assertEquals(root.right.right.val, deserializedTree.right.right.val);
//    }
//
//    @Test
//    public void testUnbalancedTree() {
//        SerializeandDeserializeBinaryTree ob = new SerializeandDeserializeBinaryTree();
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(8);
//        root.left.left = new TreeNode(1);
//        root.left.right = null;
//        root.right.left = new TreeNode(6);
//        root.right.right = null;
//        String serializedTree = ob.serialize(root);
//        assertNotNull(serializedTree);
//        assertEquals("5,3,8,1,null,6,null", serializedTree);
//        TreeNode deserializedTree = ob.deserialize(serializedTree);
//        assertNotNull(deserializedTree);
//        assertEquals(root.val, deserializedTree.val);
//        assertEquals(root.left.val, deserializedTree.left.val);
//        assertEquals(root.right.val, deserializedTree.right.val);
//        assertEquals(root.left.left.val, deserializedTree.left.left.val);
//        assertNull(deserializedTree.left.right);
//        assertEquals(root.right.left.val, deserializedTree.right.left.val);
//        assertNull(deserializedTree.right.right);
//    }
//
//    @Test
//    public void testTreeWithNegativeValues() {
//        SerializeandDeserializeBinaryTree ob = new SerializeandDeserializeBinaryTree();
//        TreeNode root = new TreeNode(-5);
//        root.left = new TreeNode(-3);
//        root.right = new TreeNode(8);
//        root.left.left = new TreeNode(-1);
//        root.left.right = new TreeNode(-4);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(9);
//        String serializedTree = ob.serialize(root);
//        assertNotNull(serializedTree);
//        assertEquals("-5,-3,8,-1,-4,6,9", serializedTree);
//        TreeNode deserializedTree = ob.deserialize(serializedTree);
//        assertNotNull(deserializedTree);
//        assertEquals(root.val, deserializedTree.val);
//        assertEquals(root.left.val, deserializedTree.left.val);
//        assertEquals(root.right.val, deserializedTree.right.val);
//        assertEquals(root.left.left.val, deserializedTree.left.left.val);
//        assertEquals(root.left.right.val, deserializedTree.left.right.val);
//        assertEquals(root.right.left.val, deserializedTree.right.left.val);
//        assertEquals(root.right.right.val, deserializedTree.right.right.val);
//    }
//
//    @Test
//    public void testTreeWithDuplicateValues() {
//        SerializeandDeserializeBinaryTree ob = new SerializeandDeserializeBinaryTree();
//        TreeNode root = new TreeNode(5);
//        root.left = new TreeNode(3);
//        root.right = new TreeNode(5);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(4);
//        root.right.left = new TreeNode(3);
//        root.right.right = new TreeNode(8);
//        String serializedTree = ob.serialize(root);
//        assertNotNull(serializedTree);
//        assertEquals("5,3,5,1,4,3,8", serializedTree);
//        TreeNode deserializedTree = ob.deserialize(serializedTree);
//        assertNotNull(deserializedTree);
//        assertEquals(root.val, deserializedTree.val);
//        assertEquals(root.left.val, deserializedTree.left.val);
//        assertEquals(root.right.val, deserializedTree.right.val);
//        assertEquals(root.left.left.val, deserializedTree.left.left.val);
//        assertEquals(root.left.right.val, deserializedTree.left.right.val);
//        assertEquals(root.right.left.val, deserializedTree.right.left.val);
//        assertEquals(root.right.right.val, deserializedTree.right.right.val);
//    }
//}