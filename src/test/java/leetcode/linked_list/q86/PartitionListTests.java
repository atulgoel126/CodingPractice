//package leetcode.linked_list.q86;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.linked_list.q86.PartitionList;
//import leetcode.linked_list.ListNode;
//
//public class PartitionListTests {
//    @Test
//    public void testNormalCase() {
//        PartitionList ob = new PartitionList();
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(4);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(2);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(2);
//        int x = 3;
//        ListNode result = ob.partition(head,x);
//
//        ListNode expected = new ListNode(1);
//        expected.next = new ListNode(2);
//        expected.next.next = new ListNode(2);
//        expected.next.next.next = new ListNode(4);
//        expected.next.next.next.next = new ListNode(3);
//        expected.next.next.next.next.next = new ListNode(5);
//
//        while(result!=null && expected!=null){
//            assertEquals(result.val, expected.val);
//            result = result.next;
//            expected = expected.next;
//        }
//    }
//
//    @Test
//    public void testEmptyList() {
//        PartitionList ob = new PartitionList();
//        ListNode head = null;
//        int x = 5;
//        ListNode result = ob.partition(head,x);
//
//        assertNull(result);
//    }
//
//    @Test
//    public void testOneNode() {
//        PartitionList ob = new PartitionList();
//        ListNode head = new ListNode(1);
//        int x = 5;
//        ListNode result = ob.partition(head,x);
//
//        assertEquals(head.val, result.val);
//    }
//
//    @Test
//    public void testAllSmallValues() {
//        PartitionList ob = new PartitionList();
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        int x = 5;
//        ListNode result = ob.partition(head,x);
//
//        ListNode expected = new ListNode(1);
//        expected.next = new ListNode(2);
//        expected.next.next = new ListNode(3);
//
//        while(result!=null && expected!=null){
//            assertEquals(result.val, expected.val);
//            result = result.next;
//            expected = expected.next;
//        }
//    }
//
//    @Test
//    public void testAllLargeValues() {
//        PartitionList ob = new PartitionList();
//        ListNode head = new ListNode(5);
//        head.next = new ListNode(6);
//        head.next.next = new ListNode(7);
//        int x = 3;
//        ListNode result = ob.partition(head,x);
//
//        ListNode expected = new ListNode(5);
//        expected.next = new ListNode(6);
//        expected.next.next = new ListNode(7);
//
//        while(result!=null && expected!=null){
//            assertEquals(result.val, expected.val);
//            result = result.next;
//            expected = expected.next;
//        }
//    }
//
//    @Test
//    public void testEdgeCases() {
//        PartitionList ob = new PartitionList();
//        ListNode head = new ListNode(3);
//        head.next = new ListNode(5);
//        head.next.next = new ListNode(8);
//        int x = 3;
//        ListNode result = ob.partition(head,x);
//
//        ListNode expected = new ListNode(3);
//        expected.next = new ListNode(5);
//        expected.next.next = new ListNode(8);
//
//        while(result!=null && expected!=null){
//            assertEquals(result.val, expected.val);
//            result = result.next;
//            expected = expected.next;
//        }
//    }
//
//    @Test
//    public void testMultipleLargeValuesAfterPartition() {
//        PartitionList ob = new PartitionList();
//        ListNode head = new ListNode(7);
//        head.next = new ListNode(6);
//        head.next.next = new ListNode(9);
//        head.next.next.next = new ListNode(15);
//        head.next.next.next.next = new ListNode(1);
//        head.next.next.next.next.next = new ListNode(3);
//        head.next.next.next.next.next.next = new ListNode(5);
//        int x = 5;
//        ListNode result = ob.partition(head,x);
//
//        ListNode expected = new ListNode(1);
//        expected.next = new ListNode(3);
//        expected.next.next = new ListNode(7);
//        expected.next.next.next = new ListNode(6);
//        expected.next.next.next.next = new ListNode(9);
//        expected.next.next.next.next.next = new ListNode(15);
//        expected.next.next.next.next.next.next = new ListNode(5);
//
//        while(result!=null && expected!=null){
//            assertEquals(result.val, expected.val);
//            result = result.next;
//            expected = expected.next;
//        }
//    }
//
//    @Test
//    public void testMultipleSmallValuesAfterPartition() {
//        PartitionList ob = new PartitionList();
//        ListNode head = new ListNode(2);
//        head.next = new ListNode(1);
//        head.next.next = new ListNode(-1);
//        head.next.next.next = new ListNode(3);
//        head.next.next.next.next = new ListNode(-2);
//        int x = 1;
//        ListNode result = ob.partition(head,x);
//
//        ListNode expected = new ListNode(2);
//        expected.next = new ListNode(-1);
//        expected.next.next = new ListNode(-2);
//        expected.next.next.next = new ListNode(1);
//        expected.next.next.next.next = new ListNode(3);
//
//        while(result!=null && expected!=null){
//            assertEquals(result.val, expected.val);
//            result = result.next;
//            expected = expected.next;
//        }
//    }
//
//    @Test
//    public void testPartitionOnLargeValue() {
//        PartitionList ob = new PartitionList();
//        ListNode head = new ListNode(4);
//        head.next = new ListNode(6);
//        head.next.next = new ListNode(7);
//        head.next.next.next = new ListNode(10);
//        int x = 100;
//        ListNode result = ob.partition(head,x);
//
//        ListNode expected = new ListNode(4);
//        expected.next = new ListNode(6);
//        expected.next.next = new ListNode(7);
//        expected.next.next.next = new ListNode(10);
//
//        while(result!=null && expected!=null){
//            assertEquals(result.val, expected.val);
//            result = result.next;
//            expected = expected.next;
//        }
//    }
//
//    @Test
//    public void testPartitionOnSmallValue() {
//        PartitionList ob = new PartitionList();
//        ListNode head = new ListNode(5);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(1);
//        int x = 0;
//        ListNode result = ob.partition(head,x);
//
//        ListNode expected = new ListNode(5);
//        expected.next = new ListNode(2);
//        expected.next.next = new ListNode(3);
//        expected.next.next.next = new ListNode(1);
//
//        while(result!=null && expected!=null){
//            assertEquals(result.val, expected.val);
//            result = result.next;
//            expected = expected.next;
//        }
//    }
//}