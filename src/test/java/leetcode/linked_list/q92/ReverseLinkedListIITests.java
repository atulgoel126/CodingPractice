//package leetcode.linked_list.q92;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.linked_list.q92.ReverseLinkedListII;
//
//public class ReverseLinkedListIITests {
//    @Test
//    public void testReverseBetween() {
//        // Setup
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//
//        int m = 2;
//        int n = 4;
//
//        // Execution
//        ReverseLinkedListII.reverseBetween(head, m, n);
//
//        // Verification
//        ListNode curr = head;
//        int[] expected = new int[]{1, 4, 3, 2, 5};
//        int index = 0;
//
//        while (curr != null) {
//            assertEquals(expected[index], curr.val);
//            curr = curr.next;
//            index++;
//        }
//    }
//
//    @Test
//    public void testReverseSingleElementList() {
//        // Setup
//        ListNode head = new ListNode(1);
//
//        int m = 1;
//        int n = 1;
//
//        // Execution
//        ReverseLinkedListII.reverseBetween(head, m, n);
//
//        // Verification
//        assertEquals(1, head.val);
//        assertNull(head.next);
//    }
//
//    @Test
//    public void testReverseEmptyList() {
//        // Setup
//        ListNode head = null;
//
//        int m = 1;
//        int n = 1;
//
//        // Execution
//        ReverseLinkedListII.reverseBetween(head, m, n);
//
//        // Verification
//        assertNull(head);
//    }
//
//    @Test
//    public void testReverseEntireList() {
//        // Setup
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//
//        int m = 1;
//        int n = 3;
//
//        // Execution
//        ReverseLinkedListII.reverseBetween(head, m, n);
//
//        // Verification
//        ListNode curr = head;
//        int[] expected = new int[]{3, 2, 1};
//        int index = 0;
//
//        while (curr != null) {
//            assertEquals(expected[index], curr.val);
//            curr = curr.next;
//            index++;
//        }
//    }
//
//    @Test
//    public void testInvalidInput() {
//        // Setup
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//
//        int m = -1;
//        int n = 6;
//
//        // Execution
//        try {
//            ReverseLinkedListII.reverseBetween(head, m, n);
//            fail("Should have thrown IllegalArgumentException");
//        } catch (IllegalArgumentException e) {
//            // Exception caught as expected
//        }
//    }
//
//    @Test
//    public void testReverseMiddleOfList() {
//        // Setup
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//
//        int m = 2;
//        int n = 3;
//
//        // Execution
//        ReverseLinkedListII.reverseBetween(head, m, n);
//
//        // Verification
//        ListNode curr = head;
//        int[] expected = new int[]{1, 3, 2, 4, 5};
//        int index = 0;
//
//        while (curr != null) {
//            assertEquals(expected[index], curr.val);
//            curr = curr.next;
//            index++;
//        }
//    }
//
//    @Test
//    public void testReverseEndOfList() {
//        // Setup
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//
//        int m = 4;
//        int n = 5;
//
//        // Execution
//        ReverseLinkedListII.reverseBetween(head, m, n);
//
//        // Verification
//        ListNode curr = head;
//        int[] expected = new int[]{1, 2, 3, 5, 4};
//        int index = 0;
//
//        while (curr != null) {
//            assertEquals(expected[index], curr.val);
//            curr = curr.next;
//            index++;
//        }
//    }
//}