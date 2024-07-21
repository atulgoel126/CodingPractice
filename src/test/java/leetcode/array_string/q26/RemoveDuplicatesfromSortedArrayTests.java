//package leetcode.array_string.q26;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class RemoveDuplicatesfromSortedArrayTests {
//    // Test case for Empty array input
//    @Test
//    public void testRemoveDuplicates_EmptyArray() {
//        int[] nums = {};
//        RemoveDuplicatesfromSortedArray ob = new RemoveDuplicatesfromSortedArray();
//        int result = ob.removeDuplicates(nums);
//        int expected = 0;
//        assertEquals(expected, result);
//    }
//
//    // Test case for single element in array
//    @Test
//    public void testRemoveDuplicates_SingleElement() {
//        int[] nums = {1};
//        RemoveDuplicatesfromSortedArray ob = new RemoveDuplicatesfromSortedArray();
//        int result = ob.removeDuplicates(nums);
//        int expected = 1;
//        assertEquals(expected, result);
//    }
//
//    // Test case for only duplicate elements in array
//    @Test
//    public void testRemoveDuplicates_OnlyDuplicates() {
//        int[] nums = {1,1,1,1,1};
//        RemoveDuplicatesfromSortedArray ob = new RemoveDuplicatesfromSortedArray();
//        int result = ob.removeDuplicates(nums);
//        int expected = 1;
//        assertEquals(expected, result);
//    }
//
//    // Test case for array with no duplicates
//    @Test
//    public void testRemoveDuplicates_NoDuplicates() {
//        int[] nums = {1,2,3,4,5};
//        RemoveDuplicatesfromSortedArray ob = new RemoveDuplicatesfromSortedArray();
//        int result = ob.removeDuplicates(nums);
//        int expected = 5;
//        assertEquals(expected, result);
//    }
//
//    // Test case for array with both duplicates and non-duplicate elements
//    @Test
//    public void testRemoveDuplicates_DuplicatesAndNonDuplicates() {
//        int[] nums = {1,2,2,3,4,4,4,5,5};
//        RemoveDuplicatesfromSortedArray ob = new RemoveDuplicatesfromSortedArray();
//        int result = ob.removeDuplicates(nums);
//        int expected = 5;
//        assertEquals(expected, result);
//    }
//
//    // Test case for negative numbers in array
//    @Test
//    public void testRemoveDuplicates_NegativeNumbers() {
//        int[] nums = {-3,-2,-2,-1,0,0,1,2,3};
//        RemoveDuplicatesfromSortedArray ob = new RemoveDuplicatesfromSortedArray();
//        int result = ob.removeDuplicates(nums);
//        int expected = 7;
//        assertEquals(expected, result);
//    }
//
//    // Test case for array with all same elements
//    @Test
//    public void testRemoveDuplicates_AllSameElements() {
//        int[] nums = {5,5,5,5,5,5};
//        RemoveDuplicatesfromSortedArray ob = new RemoveDuplicatesfromSortedArray();
//        int result = ob.removeDuplicates(nums);
//        int expected = 1;
//        assertEquals(expected, result);
//    }
//
//    // Test case for array with large number of elements
//    @Test
//    public void testRemoveDuplicates_LargeNumberOfElements() {
//        int[] nums = new int[1000];
//        for(int i=0; i<1000; i++) {
//            nums[i] = i;
//        }
//        RemoveDuplicatesfromSortedArray ob = new RemoveDuplicatesfromSortedArray();
//        int result = ob.removeDuplicates(nums);
//        int expected = 1000;
//        assertEquals(expected, result);
//    }
//
//    // Test case to check if original array is mutated
//    @Test
//    public void testRemoveDuplicates_OriginalArrayMutated() {
//        int[] nums = {1,2,3};
//        int[] expected = {1,2,3};
//        RemoveDuplicatesfromSortedArray ob = new RemoveDuplicatesfromSortedArray();
//        ob.removeDuplicates(nums);
//        assertArrayEquals(expected, nums);
//    }
//}