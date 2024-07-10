package leetcode.hashmap.q219;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.hashmap.q219.ContainsDuplicateII;

public class ContainsDuplicateIITests {
    
    // Create an instance of the class to test
    ContainsDuplicateII ob = new ContainsDuplicateII();
    
    // Test case for positive integers
    @Test
    public void testPositiveIntegers() {
        int[] nums = {3, 1, 5, 2, 7};
        int k = 2;
        assertTrue(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case for negative integers
    @Test
    public void testNegativeIntegers() {
        int[] nums = {-3, -1, -5, -2, -7};
        int k = 2;
        assertFalse(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case for duplicate values in the array
    @Test
    public void testDuplicateValues() {
        int[] nums = {1, 3, 2, 5, 1, 4};
        int k = 3;
        assertTrue(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case for empty array
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int k = 2;
        assertFalse(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case for large array size with duplicate values
    @Test
    public void testLargeArray() {
        int[] nums = new int[10000];
        for (int i = 0; i < 10000; i++) {
            nums[i] = i / 2;
        }
        int k = 3;
        assertFalse(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case where k is larger than the array size
    @Test
    public void testKlargerThanArraySize() {
        int[] nums = {1, 2, 3};
        int k = 4;
        assertTrue(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case where k is negative
    @Test
    public void testKNegative() {
        int[] nums = {1, 2, 3};
        int k = -1;
        assertFalse(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case where k is 0
    @Test
    public void testKZero() {
        int[] nums = {1, 2, 3};
        int k = 0;
        assertFalse(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case where array contains only 1 element
    @Test
    public void testSingleElementArray() {
        int[] nums = {10};
        int k = 1;
        assertFalse(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case where array contains all the same values
    @Test
    public void testAllSameValues() {
        int[] nums = {1, 1, 1, 1};
        int k = 2;
        assertTrue(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case for null value array
    @Test
    public void testNullArray() {
        int[] nums = null;
        int k = 3;
        assertFalse(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case for negative k value
    @Test
    public void testNegativeK() {
        int[] nums = {1, 2, 3};
        int k = -2;
        assertFalse(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case for empty array and k = 0
    @Test
    public void testEmptyArrayAndK() {
        int[] nums = {};
        int k = 0;
        assertFalse(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case for k = 1
    @Test
    public void testKOne() {
        int[] nums = {1, 2, 3};
        int k = 1;
        assertFalse(ob.containsNearbyDuplicate(nums, k));
    }
    
    // Test case where k is larger than array size but there are duplicates
    @Test
    public void testKlargerThanArraySizeWithDuplicates() {
        int[] nums = {1, 2, 1};
        int k = 4;
        assertTrue(ob.containsNearbyDuplicate(nums, k));
    }

}