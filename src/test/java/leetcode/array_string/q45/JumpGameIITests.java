//package leetcode.array_string.q45;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.array_string.q45.JumpGameII;
//
//public class JumpGameIITests {
//    @Test
//    public void testSingleElementArray() {
//        // Input: [1]
//        // Output: 0 (no jumps needed)
//        int[] nums = {1};
//        JumpGameII ob = new JumpGameII();
//        assertEquals(0, ob.jump(nums));
//    }
//
//    @Test
//    public void testNoJumpsPossible() {
//        // Input: [0, 0, 0, 0, 0]
//        // Output: -1 (not possible to reach last index)
//        int[] nums = {0, 0, 0, 0, 0};
//        JumpGameII ob = new JumpGameII();
//        assertEquals(-1, ob.jump(nums));
//    }
//
//    @Test
//    public void testLargeArray() {
//        // Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//        // Output: 2 (jump from index 0 to 9)
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        JumpGameII ob = new JumpGameII();
//        assertEquals(2, ob.jump(nums));
//    }
//
//    @Test
//    public void testSmallArray() {
//        // Input: [2, 1]
//        // Output: 1 (jump from index 0 to index 1)
//        int[] nums = {2, 1};
//        JumpGameII ob = new JumpGameII();
//        assertEquals(1, ob.jump(nums));
//    }
//
//    @Test
//    public void testNegativeNumber() {
//        // Input: [-1, -2, -3, 4, 5]
//        // Output: 2 (jump from index 0 to index 3)
//        int[] nums = {-1, -2, -3, 4, 5};
//        JumpGameII ob = new JumpGameII();
//        assertEquals(2, ob.jump(nums));
//    }
//
//    @Test
//    public void testOnlyZeros() {
//        // Input: [0, 0, 0, 0]
//        // Output: -1 (no jumps possible)
//        int[] nums = {0, 0, 0, 0};
//        JumpGameII ob = new JumpGameII();
//        assertEquals(-1, ob.jump(nums));
//    }
//
//    @Test
//    public void testNegativeInput() {
//        // Input: [-10, -20, -30, -40, -50]
//        // Output: -1 (no jumps possible)
//        int[] nums = {-10, -20, -30, -40, -50};
//        JumpGameII ob = new JumpGameII();
//        assertEquals(-1, ob.jump(nums));
//    }
//
//    @Test
//    public void testDuplicates() {
//        // Input: [3, 3, 3, 3, 3]
//        // Output: 1 (jump from index 0 to index 4)
//        int[] nums = {3, 3, 3, 3, 3};
//        JumpGameII ob = new JumpGameII();
//        assertEquals(1, ob.jump(nums));
//    }
//
//    @Test
//    public void testEmptyArray() {
//        // Input: []
//        // Output: -1 (no elements to jump on)
//        int[] nums = {};
//        JumpGameII ob = new JumpGameII();
//        assertEquals(-1, ob.jump(nums));
//    }
//}