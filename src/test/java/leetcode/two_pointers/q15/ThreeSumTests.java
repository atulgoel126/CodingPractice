package leetcode.two_pointers.q15;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumTests {
    @Test
    public void testEmptyInput() {
        // Empty input should return an empty list
        int[] input = {};
        List<List<Integer>> expected = new ArrayList<>();
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testZeroSum() {
        // Input with 3 elements that sum up to 0 should return a list with the 3 elements
        int[] input = {-1, 0, 1};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, 1));
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPositiveInput() {
        // Input with all positive elements should return an empty list
        int[] input = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegativeInput() {
        // Input with all negative elements should return an empty list
        int[] input = {-1, -2, -3};
        List<List<Integer>> expected = new ArrayList<>();
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDuplicateTriplets() {
        // Input with duplicate triplets should return only one occurrence of each triplet
        int[] input = {-1, 0, 1, -1, 2, -1};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, 1), Arrays.asList(-1, 2, -1));
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSortedOutput() {
        // Output should be sorted in ascending order
        int[] input = {-1, 2, 0, -3, 1};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-3, 0, 3), Arrays.asList(-3, 2, 1),
                                                     Arrays.asList(-1, 0, 1));
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testArrayWithDuplicates() {
        // Input with duplicates should handle them correctly and return unique triplets only
        int[] input = {1, 1, 2, 2, 3, 4};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 3));
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testArrayWithZeroTriplet() {
        // Input with a triplet containing 0 should return only that triplet
        int[] input = {1, 3, 0, -1, -3};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, -1, 1));
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testArrayWithAllZeroTriplet() {
        // Input with a triplet containing three 0s should return only that triplet
        int[] input = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testArrayWithOnlyNegativeElements() {
        // Input with only negative elements should not contain any triplets that sum up to 0
        int[] input = {-1, -3, -2, -1};
        List<List<Integer>> expected = new ArrayList<>();
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testArrayWithOnlyPositiveElements() {
        // Input with only positive elements should not contain any triplets that sum up to 0
        int[] input = {1, 2, 3, 4};
        List<List<Integer>> expected = new ArrayList<>();
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testArrayWithBothPositiveAndNegativeTriplets() {
        // Input with both positive and negative elements should return the appropriate triplets
        int[] input = {-1, 2, 0, -3, 1, -2, 4, 5};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-3, 0, 3), Arrays.asList(-3, 2, 1), Arrays.asList(-2, 1, 1), Arrays.asList(-2, -1, 3));
        
        ThreeSum ob = new ThreeSum();
        List<List<Integer>> actual = ob.threeSum(input);
        
        assertEquals(expected, actual);
    }
}