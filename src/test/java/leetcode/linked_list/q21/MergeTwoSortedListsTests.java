//package leetcode.linked_list.q21;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.linked_list.q21.MergeTwoSortedLists;
//
//public class MergeTwoSortedListsTests {
//
//    // Test case for merging two empty lists
//    @Test
//    public void testMergeEmptyLists() {
//        MergeTwoSortedLists ob = new MergeTwoSortedLists();
//        ListNode l1 = null;
//        ListNode l2 = null;
//        ListNode result = ob.mergeTwoLists(l1, l2);
//        assertEquals(null, result);
//    }
//
//    // Test case for merging one empty list with non-empty list
//    @Test
//    public void testMergeOneEmptyList() {
//        MergeTwoSortedLists ob = new MergeTwoSortedLists();
//        ListNode l1 = null;
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(2);
//        l2.next.next = new ListNode(3);
//        ListNode result = ob.mergeTwoLists(l1, l2);
//        assertEquals(l2, result);
//    }
//
//    // Test case for merging two non-empty lists of different lengths
//    @Test
//    public void testMergeListsOfDifferentLengths() {
//        MergeTwoSortedLists ob = new MergeTwoSortedLists();
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(4);
//        l2.next = new ListNode(5);
//        l2.next.next = new ListNode(6);
//        ListNode result = ob.mergeTwoLists(l1, l2);
//        assertEquals("1->2->3->4->5->6", result.printList());
//    }
//
//    // Test case for merging two non-empty lists with duplicate values
//    @Test
//    public void testMergeListsWithDuplicates() {
//        MergeTwoSortedLists ob = new MergeTwoSortedLists();
//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(3);
//        l1.next.next = new ListNode(5);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(4);
//        l2.next.next = new ListNode(6);
//        ListNode result = ob.mergeTwoLists(l1, l2);
//        assertEquals("1->1->3->4->5->6", result.printList());
//    }
//
//    // Test case for merging two lists with negative values
//    @Test
//    public void testMergeListsNegativeValues() {
//        MergeTwoSortedLists ob = new MergeTwoSortedLists();
//        ListNode l1 = new ListNode(-5);
//        l1.next = new ListNode(3);
//        l1.next.next = new ListNode(7);
//        ListNode l2 = new ListNode(-10);
//        l2.next = new ListNode(2);
//        l2.next.next = new ListNode(6);
//        ListNode result = ob.mergeTwoLists(l1, l2);
//        assertEquals("-10->-5->2->3->6->7", result.printList());
//    }
//
//    // Test case for merging two lists with repeating values
//    @Test
//    public void testMergeListsRepeatingValues() {
//        MergeTwoSortedLists ob = new MergeTwoSortedLists();
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(5);
//        ListNode l2 = new ListNode(2);
//        l2.next = new ListNode(5);
//        l2.next.next = new ListNode(7);
//        ListNode result = ob.mergeTwoLists(l1, l2);
//        assertEquals("2->2->2->5->5->7", result.printList());
//    }
//
//    // Test case for merging two lists with values in descending order
//    @Test
//    public void testMergeListsDescendingOrder() {
//        MergeTwoSortedLists ob = new MergeTwoSortedLists();
//        ListNode l1 = new ListNode(10);
//        l1.next = new ListNode(8);
//        l1.next.next = new ListNode(5);
//        ListNode l2 = new ListNode(4);
//        l2.next = new ListNode(2);
//        l2.next.next = new ListNode(-1);
//        ListNode result = ob.mergeTwoLists(l1, l2);
//        assertEquals("-1->2->4->5->8->10", result.printList());
//    }
//
//    // Test case for merging two lists where one list contains only one value
//    @Test
//    public void testMergeListsWithOneValue() {
//        MergeTwoSortedLists ob = new MergeTwoSortedLists();
//        ListNode l1 = new ListNode(5);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(9);
//        ListNode result = ob.mergeTwoLists(l1, l2);
//        assertEquals("1->3->5->9", result.printList());
//    }
//
//    // Test case for merging two lists with values in descending order
//    // This test case ensures that the temp variable is being used correctly during the merge process
//    @Test
//    public void testMergeListsDescendingOrderWithTemp() {
//        MergeTwoSortedLists ob = new MergeTwoSortedLists();
//        ListNode l1 = new ListNode(10);
//        l1.next = new ListNode(6);
//        l1.next.next = new ListNode(4);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(1);
//        ListNode result = ob.mergeTwoLists(l1, l2);
//        assertEquals("1->3->4->5->6->10", result.printList());
//    }
//
//    // Test case for potential issue when one list is longer than the other
//    @Test
//    public void testMergeListsWithLongerList() {
//        MergeTwoSortedLists ob = new MergeTwoSortedLists();
//        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(7);
//        l1.next.next = new ListNode(9);
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(2);
//        ListNode result = ob.mergeTwoLists(l1, l2);
//        assertEquals("1->2->5->7->9", result.printList());
//    }
//
//    // Test case for potential issue when both lists have only one value
//    @Test
//    public void testMergeListsWithOneValueEach() {
//        MergeTwoSortedLists ob = new MergeTwoSortedLists();
//        ListNode l1 = new ListNode(3);
//        ListNode l2 = new ListNode(2);
//        ListNode result = ob.mergeTwoLists(l1, l2);
//        assertEquals("2->3", result.printList());
//    }
//
//}