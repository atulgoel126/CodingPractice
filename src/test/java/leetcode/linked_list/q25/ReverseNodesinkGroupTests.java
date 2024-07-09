//package leetcode.linked_list.q25;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.linked_list.q25.ReverseNodesinkGroup;
//
//public class ReverseNodesinkGroupTests {
//    ReverseNodesinkGroup obj = new ReverseNodesinkGroup();
//
//    @Test
//    public void testReverseGroupsWithNullList() {
//        ListNode head = null;
//        int k = 3;
//        ListNode actual = obj.reverseKGroup(head, k);
//        ListNode expected = null;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testReverseGroupsWithoutEnoughNodes() {
//        ListNode head = new ListNode(1);
//        int k = 3;
//        ListNode actual = obj.reverseKGroup(head, k);
//        ListNode expected = new ListNode(1);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testReverseGroupsWithOneNode() {
//        ListNode head = new ListNode(1);
//        int k = 1;
//        ListNode actual = obj.reverseKGroup(head, k);
//        ListNode expected = new ListNode(1);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testReverseGroupsWithThreeNodes() {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        int k = 3;
//        ListNode actual = obj.reverseKGroup(head, k);
//        ListNode expected = new ListNode(3);
//        expected.next = new ListNode(2);
//        expected.next.next = new ListNode(1);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testReverseGroupsWithFiveNodes() {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        int k = 2;
//        ListNode actual = obj.reverseKGroup(head, k);
//        ListNode expected = new ListNode(2);
//        expected.next = new ListNode(1);
//        expected.next.next = new ListNode(4);
//        expected.next.next.next = new ListNode(3);
//        expected.next.next.next.next = new ListNode(5);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testReverseGroupsWithMultipleNodes() {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        int k = 4;
//        ListNode actual = obj.reverseKGroup(head, k);
//        ListNode expected = new ListNode(4);
//        expected.next = new ListNode(3);
//        expected.next.next = new ListNode(2);
//        expected.next.next.next = new ListNode(1);
//        expected.next.next.next.next = new ListNode(5);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testReverseGroupsWithNegativeK() {
//        ListNode head = new ListNode(1);
//        int k = -1;
//        ListNode actual = obj.reverseKGroup(head, k);
//        ListNode expected = new ListNode(1);
//        assertEquals(expected, actual);
//    }
//}