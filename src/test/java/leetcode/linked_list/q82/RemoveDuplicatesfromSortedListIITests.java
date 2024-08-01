package leetcode.linked_list.q82;

import static org.junit.jupiter.api.Assertions.*;

import leetcode.commons.ListNode;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesfromSortedListIITests {

    @Test
    void testEmptyList() {
        ListNode head = null;
        ListNode expected = null; // Expected list after removing duplicates
        removeDuplicatesAndAssert(head, expected);
    }

    @Test
    void testSingleElementList() {
        ListNode head = new ListNode(1);
        ListNode expected = new ListNode(1);
        removeDuplicatesAndAssert(head, expected);
    }

    @Test
    void testDuplicateElements() {
        // Input list: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        
        // Expected list: 2
        ListNode expected = new ListNode(2);
        removeDuplicatesAndAssert(head, expected);
    }

    @Test
    void testAllDuplicateElements() {
        // Input list: 1 -> 1 -> 1 -> 1 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);

        // Expected list: null
        ListNode expected = null;
        removeDuplicatesAndAssert(head, expected);
    }

    @Test
    void testNoDuplicateElements() {
        // Input list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Expected list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(4);
        expected.next.next.next.next = new ListNode(5);

        removeDuplicatesAndAssert(head, expected);
    }

    private void removeDuplicatesAndAssert(ListNode head, ListNode expected) {
        RemoveDuplicatesfromSortedListII ob = new RemoveDuplicatesfromSortedListII();
        ListNode actual = ob.deleteDuplicates(head);
        assertListNodeEquals(expected, actual);
    }

    private void assertListNodeEquals(ListNode expected, ListNode actual) {
        if (expected == null && actual == null) {
            return;
        }

        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }

        assertNull(expected);
        assertNull(actual);
    }
}