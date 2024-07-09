package leetcode.hashmap.q128;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.hashmap.q128.LongestConsecutiveSequence;

public class LongestConsecutiveSequenceTests {
    
    // Test case for empty array
    @Test
    public void testEmptyArray() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {};
        assertEquals(0, ob.longestConsecutive(nums));
    }
    
    // Test case for array with duplicate elements 
    @Test
    public void testArrayWithDuplicates() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 5};
        assertEquals(5, ob.longestConsecutive(nums));
    }
    
    // Test case for array with negative numbers
    @Test
    public void testArrayWithNegativeNumbers() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {3, -2, 0, 2, -1, 1};
        assertEquals(6, ob.longestConsecutive(nums));
    }
    
    // Test case for array with only one element 
    @Test
    public void testArrayWithOneElement() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {5};
        assertEquals(1, ob.longestConsecutive(nums));
    }
    
    // Test case for array with all consecutive numbers 
    @Test
    public void testArrayWithAllConsecutiveNumbers() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(5, ob.longestConsecutive(nums));
    }
    
    // Test case for array with all non-consecutive numbers 
    @Test
    public void testArrayWithAllNonConsecutiveNumbers() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {5, 4, 3, 2, 1};
        assertEquals(1, ob.longestConsecutive(nums));
    }
    
    // Test case for array with negative consecutive numbers 
    @Test
    public void testArrayWithNegativeConsecutiveNumbers() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {-5, -4, -3, -2, -1};
        assertEquals(5, ob.longestConsecutive(nums));
    }
    
    // Test case for array with both positive and negative numbers 
    @Test
    public void testMixedArray() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {-1, 2, 3, -4, 0, 1};
        assertEquals(5, ob.longestConsecutive(nums));
    }
    
    // Test case for array with only one sequence 
    @Test
    public void testArrayWithOneSequence() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {1, 2, 3, 10, 11, 12};
        assertEquals(3, ob.longestConsecutive(nums));
    }
    
    // Test case for array with multiple sequences 
    @Test
    public void testArrayWithMultipleSequences() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {1, 2, 3, 5, 4, 8, 7, 9, 10};
        assertEquals(5, ob.longestConsecutive(nums));
    }
    
    // Test case for array with multiple sequences with duplicate elements 
    @Test
    public void testArrayWithMultipleDuplicateSequences() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {1, 2, 2, 4, 7, 6, 7, 5, 5, 8, 9, 9, 10};
        assertEquals(5, ob.longestConsecutive(nums));
    }
    
    // Test case for array with large numbers 
    @Test
    public void testArrayWithLargeNumbers() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = {1000, -10000, 24000, -5000, 999, 1001, 0, 12563};
        assertEquals(3, ob.longestConsecutive(nums));
    }
    
    // Test case for null input 
    @Test
    public void testNullInput() {
        LongestConsecutiveSequence ob = new LongestConsecutiveSequence();
        int[] nums = null;
        assertThrows(NullPointerException.class, () -> ob.longestConsecutive(nums));
    }
}