//package leetcode.two_pointers.q209;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.two_pointers.q209.MinimumSizeSubarraySum;
//
//public class MinimumSizeSubarraySumTests {
//    @Test
//    public void testEmptyArray() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {};
//        int s = 5;
//        assertEquals(0, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testSingleElement() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {2};
//        int s = 5;
//        assertEquals(0, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testSumGreaterThanTarget() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {2,3,1,4,2,5};
//        int s = 15;
//        assertEquals(0, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testSumEqualTarget() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {2,3,1,4,2,5};
//        int s = 10;
//        assertEquals(2, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testSumLessThanTarget() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {2,3,1,4,2,5};
//        int s = 20;
//        assertEquals(3, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testNegativeIntegers() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {-3,2,-1,5,7,-4,-2};
//        int s = 3;
//        assertEquals(1, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testAllNegativeIntegers() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {-3,-2,-1,-5,-7,-4,-2};
//        int s = -12;
//        assertEquals(4, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testArrayWithZeros() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {0,2,1,4,0,5};
//        int s = 6;
//        assertEquals(2, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testArrayWithNegativeZero() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {0,2,-1,4,0,5};
//        int s = 6;
//        assertEquals(1, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testArrayWithNegativeTarget() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {2,3,1,4,2,5};
//        int s = -5;
//        assertEquals(0, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testArrayWithAllZeroes() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {0,0,0,0,0,0};
//        int s = 1;
//        assertEquals(0, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testArrayWithAllNegatives() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {-2,-3,-1,-4,-2,-5};
//        int s = -9;
//        assertEquals(3, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testArrayWithLargeNumbers() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {1000,2000,3000,4000,5000};
//        int s = 10000;
//        assertEquals(2, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testArrayWithAllEqualNumbers() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {5,5,5,5,5,5};
//        int s = 15;
//        assertEquals(3, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testArrayWithDuplicates() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {2,3,1,2,4,5,2};
//        int s = 8;
//        assertEquals(1, ob.minSubArrayLen(s, nums));
//    }
//
//    @Test
//    public void testArrayWithNegativeDuplicates() {
//        MinimumSizeSubarraySum ob = new MinimumSizeSubarraySum();
//        int[] nums = {-2,-3,-1,-2,-4,-5,-2};
//        int s = -4;
//        assertEquals(1, ob.minSubArrayLen(s, nums));
//    }
//
//}