package leetcode.linked_list.q2;

import static org.junit.jupiter.api.Assertions.*;

import leetcode.commons.ListNode;
import org.junit.jupiter.api.Test;

public class AddTwoNumbersTests {

    @Test
    public void testEmptyLists() {
        AddTwoNumbers ob = new AddTwoNumbers();
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode result = ob.addTwoNumbers(l1, l2);

        assertTrue(areListNodesEqual(result, l2));
    }

    @Test
    public void testL1Empty() {
        AddTwoNumbers ob = new AddTwoNumbers();
        ListNode l1 = null;
        ListNode l2 = new ListNode(5);
        ListNode result = ob.addTwoNumbers(l1, l2);

        assertTrue(areListNodesEqual(result, l2));
    }

    @Test
    public void testL2Empty() {
        AddTwoNumbers ob = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        ListNode l2 = null;
        ListNode result = ob.addTwoNumbers(l1, l2);

        assertTrue(areListNodesEqual(result, l1));
    }

    @Test
    public void testDifferentLengthLists() {
        AddTwoNumbers ob = new AddTwoNumbers();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode result = ob.addTwoNumbers(l1, l2);

        assertTrue(areListNodesEqual(result, new ListNode(4, new ListNode(2))));
    }

    @Test
    public void testCarryOver() {
        AddTwoNumbers ob = new AddTwoNumbers();
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(7);
        ListNode result = ob.addTwoNumbers(l1, l2);
        assertTrue(areListNodesEqual(result, new ListNode(2, new ListNode(1))));
    }

    @Test
    public void testZeroes() {
        AddTwoNumbers ob = new AddTwoNumbers();
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode result = ob.addTwoNumbers(l1, l2);
        assertTrue(areListNodesEqual(result, new ListNode(0)));
    }

    @Test
    public void testNegativeNumbers() {
        AddTwoNumbers ob = new AddTwoNumbers();
        ListNode l1 = new ListNode(-1);
        l1.next = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode result = ob.addTwoNumbers(l1, l2);
        assertTrue(areListNodesEqual(result, new ListNode(2, new ListNode(2))));
    }

    @Test
    public void testLargeNumbersWithCarryOver() {
        AddTwoNumbers ob = new AddTwoNumbers();
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        ListNode l2 = new ListNode(1);
        ListNode result = ob.addTwoNumbers(l1, l2);
        assertTrue(areListNodesEqual(result, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))));
    }

    private boolean areListNodesEqual(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

}