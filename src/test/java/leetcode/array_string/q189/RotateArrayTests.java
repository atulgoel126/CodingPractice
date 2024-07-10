package leetcode.array_string.q189;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.array_string.q189.RotateArray;

public class RotateArrayTests {
    
    // test edge cases: array is empty, array has only one element, k is 0 or negative
    @Test
    public void testEdgeCases() {
        // empty array
        int[] empty = {};
        RotateArray.rotate(empty, 2);
        assertArrayEquals(empty, empty);
        
        // one element
        int[] one = {5};
        RotateArray.rotate(one, 4);
        assertArrayEquals(one, one);
        
        // k is 0
        int[] arr1 = {1, 2, 3, 4};
        RotateArray.rotate(arr1, 0);
        assertArrayEquals(arr1, arr1);
        
        // k is negative
        int[] arr2 = {1, 2, 3, 4};
        RotateArray.rotate(arr2, -1);
        assertArrayEquals(arr2, arr2);
    }
    
    // test normal cases: 
    // (1) k is smaller than array length
    // (2) k is larger than array length
    @Test
    public void testNormalCases() {
        // k is smaller than array length
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] expected1 = {5, 6, 7, 1, 2, 3, 4};
        RotateArray.rotate(arr1, 3);
        assertArrayEquals(arr1, expected1);
        
        // k is larger than array length
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int[] expected2 = {3, 4, 5, 6 ,7, 1, 2};
        RotateArray.rotate(arr2, 10);
        assertArrayEquals(arr2, expected2);
    }

    // test potential issues: 
    // (1) array contains duplicate elements
    // (2) array contains negative numbers
    @Test
    public void testPotentialIssues() {
        // array contains duplicate elements
        int[] arr1 = {1, 2, 3, 3, 4, 5, 5};
        int[] expected1 = {5, 5, 1, 2, 3, 3, 4};
        RotateArray.rotate(arr1, 2);
        assertArrayEquals(arr1, expected1);
        
        // array contains negative numbers
        int[] arr2 = {-1, 2, -3, 4, 5};
        int[] expected2 = {4, 5, -1, 2, -3};
        RotateArray.rotate(arr2, 2);
        assertArrayEquals(arr2, expected2);
    }

}