//package leetcode.linked_list.q138;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import leetcode.linked_list.q138.CopyListwithRandomPointer;
//
//public class CopyListwithRandomPointerTests {
//    private CopyListwithRandomPointer ob;
//    private RandomListNode head;
//    private RandomListNode node1;
//    private RandomListNode node2;
//    private RandomListNode node3;
//    private RandomListNode node4;
//
//    @BeforeEach
//    public void setup() {
//        ob = new CopyListwithRandomPointer();
//        head = new RandomListNode(1);
//        node1 = new RandomListNode(2);
//        node2 = new RandomListNode(3);
//        node3 = new RandomListNode(4);
//        node4 = new RandomListNode(5);
//
//        head.next = node1;
//        head.random = node4;
//        node1.next = node2;
//        node1.random = node1;
//        node2.next = node3;
//        node2.random = null;
//        node3.random = node1;
//        node4.next = null;
//        node4.random = node2;
//    }
//
//    @Test
//    public void testCopyList() {
//        RandomListNode copiedHead = ob.copyRandomList(head);
//
//        // Check values of copied list
//        assertEquals(head.label, copiedHead.label);
//        assertEquals(head.next.label, copiedHead.next.label);
//        assertEquals(head.random.label, copiedHead.random.label);
//        assertEquals(node1.label, copiedHead.next.next.label);
//        assertEquals(node1.next.label, copiedHead.next.next.next.label);
//        assertEquals(node2.random.label, copiedHead.next.next.next.random.label);
//
//        // Check for deep copy
//        assertNotSame(head, copiedHead);
//        assertNotSame(head.next, copiedHead.next);
//        assertNotSame(head.random, copiedHead.random);
//    }
//
//    @Test
//    public void testOriginalListUnchanged() {
//        RandomListNode copiedHead = ob.copyRandomList(head);
//
//        // Check that the original list remains unchanged
//        assertNotSame(head, node1.random);
//        assertNotSame(head.next.next, node2);
//        assertNotSame(head.random, node4);
//    }
//
//    @Test
//    public void testEmptyList() {
//        RandomListNode copiedHead = ob.copyRandomList(null);
//
//        // Check that a null list returns null
//        assertNull(copiedHead);
//    }
//
//    @Test
//    public void testSingleNodeList() {
//        RandomListNode singleNode = new RandomListNode(1);
//        singleNode.random = singleNode;
//
//        RandomListNode copiedHead = ob.copyRandomList(singleNode);
//
//        // Check that a single node list is properly copied
//        assertEquals(singleNode.label, copiedHead.label);
//        assertNotSame(singleNode, copiedHead);
//    }
//}