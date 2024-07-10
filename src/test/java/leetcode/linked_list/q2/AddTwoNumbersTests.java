//package leetcode.linked_list.q2;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.linked_list.q2.AddTwoNumbers;
//import leetcode.linked_list.ListNode;
//
//public class AddTwoNumbersTests {
//
//    @Test
//    public void testEmptyLists() {
//        AddTwoNumbers ob = new AddTwoNumbers();
//        ListNode l1 = null;
//        ListNode l2 = null;
//        ListNode result = ob.addTwoNumbers(l1, l2);
//
//        assertEquals(null, result);
//    }
//
//    @Test
//    public void testL1Empty() {
//        AddTwoNumbers ob = new AddTwoNumbers();
//        ListNode l1 = null;
//        ListNode l2 = new ListNode(5);
//        ListNode result = ob.addTwoNumbers(l1, l2);
//
//        assertEquals(l2, result);
//    }
//
//    @Test
//    public void testL2Empty() {
//        AddTwoNumbers ob = new AddTwoNumbers();
//        ListNode l1 = new ListNode(2);
//        ListNode l2 = null;
//        ListNode result = ob.addTwoNumbers(l1, l2);
//
//        assertEquals(l1, result);
//    }
//
//    @Test
//    public void testDifferentLengthLists() {
//        AddTwoNumbers ob = new AddTwoNumbers();
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(2);
//        ListNode l2 = new ListNode(3);
//        ListNode result = ob.addTwoNumbers(l1, l2);
//
//        assertEquals(new ListNode(4, new ListNode(2)), result);
//    }
//
//    @Test
//    public void testCarryOver() {
//        AddTwoNumbers ob = new AddTwoNumbers();
//        ListNode l1 = new ListNode(5);
//        ListNode l2 = new ListNode(7);
//        ListNode result = ob.addTwoNumbers(l1, l2);
//
//        assertEquals(new ListNode(2, new ListNode(1)), result);
//    }
//
//    @Test
//    public void testLargeNumbers() {
//        AddTwoNumbers ob = new AddTwoNumbers();
//        ListNode l1 = new ListNode(123);
//        ListNode l2 = new ListNode(456);
//        ListNode result = ob.addTwoNumbers(l1, l2);
//
//        assertEquals(new ListNode(579), result);
//    }
//
//    @Test
//    public void testZeroes() {
//        AddTwoNumbers ob = new AddTwoNumbers();
//        ListNode l1 = new ListNode(0);
//        ListNode l2 = new ListNode(0);
//        ListNode result = ob.addTwoNumbers(l1, l2);
//
//        assertEquals(new ListNode(0), result);
//    }
//
//    @Test
//    public void testLeadingZeroes() {
//        AddTwoNumbers ob = new AddTwoNumbers();
//        ListNode l1 = new ListNode(0);
//        l1.next = new ListNode(0);
//        l1.next.next = new ListNode(1);
//        ListNode l2 = new ListNode(0);
//        l2.next = new ListNode(0);
//        l2.next.next = new ListNode(2);
//        ListNode result = ob.addTwoNumbers(l1, l2);
//
//        assertEquals(new ListNode(0, new ListNode(0, new ListNode(3))), result);
//    }
//
//    @Test
//    public void testNegativeNumbers() {
//        AddTwoNumbers ob = new AddTwoNumbers();
//        ListNode l1 = new ListNode(-1);
//        l1.next = new ListNode(2);
//        ListNode l2 = new ListNode(3);
//        ListNode result = ob.addTwoNumbers(l1, l2);
//
//        assertEquals(new ListNode(2, new ListNode(2)), result);
//    }
//
//    @Test
//    public void testLargeNumbersWithCarryOver() {
//        AddTwoNumbers ob = new AddTwoNumbers();
//        ListNode l1 = new ListNode(9999);
//        ListNode l2 = new ListNode(1);
//        ListNode result = ob.addTwoNumbers(l1, l2);
//
//        assertEquals(new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))), result);
//    }
//
//}