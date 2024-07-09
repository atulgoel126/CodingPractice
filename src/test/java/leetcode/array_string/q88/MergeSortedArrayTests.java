package leetcode.array_string.q88;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.array_string.q88.MergeSortedArray;

public class MergeSortedArrayTests {
    
    // Test for basic functionality
    @Test
    public void testMerge() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int[] expected = {1,2,2,3,5,6};
        ob.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for empty arrays
    @Test
    public void testMergeEmptyArrays() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {};
        int[] nums2 = {};
        int[] expected = {};
        ob.merge(nums1, 0, nums2, 0);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for arrays with one element
    @Test
    public void testMergeSingleElementArray() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1};
        int[] nums2 = {2};
        int[] expected = {1,2};
        ob.merge(nums1, 1, nums2, 1);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for arrays with unequal lengths
    @Test
    public void testMergeUnequalArrays() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int[] expected = {1,2,2,3,5,6};
        ob.merge(nums1, 4, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for arrays with negative values
    @Test
    public void testMergeNegativeValues() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {-1,2,3,0,0,0};
        int[] nums2 = {-2,-5,-6};
        int[] expected = {-2,-1,-2,2,3,3};
        ob.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for arrays with repeated values
    @Test
    public void testMergeRepeatedValues() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1,1,2,0,0,0};
        int[] nums2 = {1,3,4};
        int[] expected = {1,1,1,2,3,4};
        ob.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for arrays with large values 
    @Test
    public void testMergeLargeValues() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1000,2000,3000,0,0,0};
        int[] nums2 = {4000,5000,6000};
        int[] expected = {1000,2000,3000,4000,5000,6000};
        ob.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for arrays where first array is larger than second array
    @Test
    public void testMergeFirstArrayLarger() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1,2,3,4,5,6,0,0,0};
        int[] nums2 = {2,5,6};
        int[] expected = {1,2,2,3,4,5,5,6,6};
        ob.merge(nums1, 6, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for arrays where second array is larger than first array
    @Test
    public void testMergeSecondArrayLarger() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1,2,6,0,0,0};
        int[] nums2 = {3,4,5,7,8,9};
        int[] expected = {1,2,3,4,5,6,7,8,9};
        ob.merge(nums1, 3, nums2, 6);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for arrays with null values
    @Test
    public void testMergeNullValues() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = null;
        int[] nums2 = {2,5,6};
        int[] expected = null;
        ob.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for arrays with null values
    @Test
    public void testMergeNullSecondArray() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = null;
        int[] expected = {1,2,3,4,5,6};
        ob.merge(nums1, 6, nums2, 0);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for array with all elements equal
    @Test
    public void testMergeEqualElementsArray() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1,1,1,0,0,0};
        int[] nums2 = {1,1,1};
        int[] expected = {1,1,1,1,1,1};
        ob.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for array where all elements in first array are smaller than second array
    @Test
    public void testMergeSmallerFirstArray() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1,3,5,0,0,0};
        int[] nums2 = {2,4,6};
        int[] expected = {1,2,3,4,5,6};
        ob.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for array where all elements in second array are smaller than first array
    @Test
    public void testMergeSmallerSecondArray() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {2,4,6,0,0,0};
        int[] nums2 = {1,3,5};
        int[] expected = {1,2,3,4,5,6};
        ob.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for case where arrays are not sorted
    @Test
    public void testMergeUnsortedArrays() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {3,1,2,0,0,0};
        int[] nums2 = {6,4,5};
        int[] expected = {1,2,3,4,5,6};
        ob.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for case where first array is not sorted
    @Test
    public void testMergeUnsortedFirstArray() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {3,6,5,0,0,0};
        int[] nums2 = {1,2,4};
        int[] expected = {1,2,3,4,5,6};
        ob.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
    
    // Test for case where second array is not sorted
    @Test
    public void testMergeUnsortedSecondArray() {
        MergeSortedArray ob = new MergeSortedArray();
        int[] nums1 = {1,2,4,0,0,0};
        int[] nums2 = {6,3,5};
        int[] expected = {1,2,3,4,5,6};
        ob.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
}