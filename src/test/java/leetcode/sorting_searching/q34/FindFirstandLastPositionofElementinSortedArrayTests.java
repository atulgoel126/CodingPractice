package leetcode.sorting_searching.q34;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.sorting_searching.q34.FindFirstandLastPositionofElementinSortedArray;

public class FindFirstandLastPositionofElementinSortedArrayTests {
    
    @Test
    public void testValidInputs() {
        FindFirstandLastPositionofElementinSortedArray ob = new FindFirstandLastPositionofElementinSortedArray();
        
        //Test case for an even number of elements in the array
        int[] nums1 = {1,2,2,4,4};
        int[] expected1 = {1,2};
        assertArrayEquals(expected1, ob.searchRange(nums1, 2));
        
        //Test case for an odd number of elements in the array
        int[] nums2 = {1,2,3,3,4};
        int[] expected2 = {2,3};
        assertArrayEquals(expected2, ob.searchRange(nums2, 3));
        
        //Test case for an array with all the same elements
        int[] nums3 = {5,5,5,5,5};
        int[] expected3 = {0,4};
        assertArrayEquals(expected3, ob.searchRange(nums3, 5));
    }
    
    @Test
    public void testInvalidInputs() {
        FindFirstandLastPositionofElementinSortedArray ob = new FindFirstandLastPositionofElementinSortedArray();
        
        //Test case for an empty array
        int[] nums1 = {};
        int target1 = 4;
        int[] expected1 = {-1,-1};
        assertArrayEquals(expected1, ob.searchRange(nums1, target1));
        
        //Test case for a target element not in the array
        int[] nums2 = {1,3,5,7,9};
        int target2 = 2;
        int[] expected2 = {-1,-1};
        assertArrayEquals(expected2, ob.searchRange(nums2, target2));
    }
    
    @Test
    public void testEdgeCases() {
        FindFirstandLastPositionofElementinSortedArray ob = new FindFirstandLastPositionofElementinSortedArray();
        
        //Test case for an array with only one element
        int[] nums1 = {5};
        int[] expected1 = {0,0};
        assertArrayEquals(expected1, ob.searchRange(nums1, 5));
        
        //Test case for an array with two elements with the target as the first element
        int[] nums2 = {3,5};
        int[] expected2 = {0,0};
        assertArrayEquals(expected2, ob.searchRange(nums2, 3));
        
        //Test case for an array with two elements with the target as the second element
        int[] nums3 = {3,5};
        int[] expected3 = {1,1};
        assertArrayEquals(expected3, ob.searchRange(nums3, 5));
    }
}