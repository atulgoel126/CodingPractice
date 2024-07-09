//package leetcode.linked_list.q61;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//
//public class RotateListTests {
//
//    @Test
//    public void testEmptyListRotation() {
//        RotateList ob = new RotateList();
//        ListNode head = null;
//        assertEquals(null, ob.rotateRight(head, 3), "Should return null for an empty list.");
//    }
//
//    @Test
//    public void testSingleElementListRotation() {
//        RotateList ob = new RotateList();
//        ListNode head = ob.createList(new int[]{1});
//        assertEquals(head, ob.rotateRight(head, 5), "Should return the same as original head for k > 1.");
//        assertEquals(head, ob.rotateRight(head, 0), "Should return the same as original head for k = 0.");
//    }
//
//    @Test
//    public void testNegativeKRotation() {
//        RotateList ob = new RotateList();
//        ListNode head = ob.createList(new int[]{1,2,3,4,5});
//        assertEquals(head, ob.rotateRight(head, -3), "Should return the same as original head for k < 0.");
//    }
//
//    @Test
//    public void testRotateByKEqualsListLength() {
//        RotateList ob = new RotateList();
//        ListNode head = ob.createList(new int[]{1,2,3,4,5});
//        assertEquals(head, ob.rotateRight(head, 5), "Should return the same as original head for k = list length.");
//    }
//
//    @Test
//    public void testRotateByKGreaterThanListLength() {
//        RotateList ob = new RotateList();
//        ListNode head = ob.createList(new int[]{1,2,3,4,5});
//        assertEquals(head, ob.rotateRight(head, 6), "Should return the same as original head for k > list length.");
//    }
//
//    @Test
//    public void testRotateByKLessThanListLength() {
//        RotateList ob = new RotateList();
//        ListNode head = ob.createList(new int[]{1,2,3,4,5});
//        ListNode expected = ob.createList(new int[]{4,5,1,2,3});
//        assertEquals(expected, ob.rotateRight(head, 3), "Should return the correct rotated list for k < list length.");
//    }
//}