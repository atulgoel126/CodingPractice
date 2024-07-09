package leetcode.backtracking.q491;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.backtracking.q491.IncreasingSubsequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IncreasingSubsequencesTests {
    
    // Test increasing subsequences of length 2
    @Test
    public void testLength2() {
        IncreasingSubsequences ob = new IncreasingSubsequences();
        int[] nums = new int[]{1,2,3,4};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1,2)));
        expected.add(new ArrayList<>(Arrays.asList(1,3)));
        expected.add(new ArrayList<>(Arrays.asList(1,4)));
        expected.add(new ArrayList<>(Arrays.asList(2,3)));
        expected.add(new ArrayList<>(Arrays.asList(2,4)));
        expected.add(new ArrayList<>(Arrays.asList(3,4)));
        List<List<Integer>> result = ob.findSubsequences(nums);
        assertEquals(expected, result);
    }
    
    // Test increasing subsequences of length 3
    @Test
    public void testLength3() {
        IncreasingSubsequences ob = new IncreasingSubsequences();
        int[] nums = new int[]{2,5,1,7,6};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(2,5,6)));
        expected.add(new ArrayList<>(Arrays.asList(2,5,7)));
        expected.add(new ArrayList<>(Arrays.asList(2,6,7)));
        expected.add(new ArrayList<>(Arrays.asList(1,7,6)));
        List<List<Integer>> result = ob.findSubsequences(nums);
        assertEquals(expected, result);
    }
    
    // Test empty input array
    @Test
    public void testEmptyInput() {
        IncreasingSubsequences ob = new IncreasingSubsequences();
        int[] nums = new int[0];
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ob.findSubsequences(nums);
        assertEquals(expected, result);
    }
    
    // Test input array with duplicate values
    @Test
    public void testDuplicates() {
        IncreasingSubsequences ob = new IncreasingSubsequences();
        int[] nums = new int[]{1,3,2,2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1,2)));
        expected.add(new ArrayList<>(Arrays.asList(1,3)));
        expected.add(new ArrayList<>(Arrays.asList(1,2,2)));
        expected.add(new ArrayList<>(Arrays.asList(2,2)));
        expected.add(new ArrayList<>(Arrays.asList(3,2)));
        expected.add(new ArrayList<>(Arrays.asList(2,2,2)));
        expected.add(new ArrayList<>(Arrays.asList(1,2,2,2)));
        List<List<Integer>> result = ob.findSubsequences(nums);
        assertEquals(expected, result);
    }
    
    // Test input array with only one element
    @Test
    public void testSingleElement() {
        IncreasingSubsequences ob = new IncreasingSubsequences();
        int[] nums = new int[]{1};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = ob.findSubsequences(nums);
        assertEquals(expected, result);
    }
    
    // Test input array with negative values
    @Test
    public void testNegativeValues() {
        IncreasingSubsequences ob = new IncreasingSubsequences();
        int[] nums = new int[]{5,4,-1,2,-3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(5,-1)));
        expected.add(new ArrayList<>(Arrays.asList(5,2)));
        expected.add(new ArrayList<>(Arrays.asList(4,-1)));
        expected.add(new ArrayList<>(Arrays.asList(4,-1,2)));
        expected.add(new ArrayList<>(Arrays.asList(-1,2)));
        expected.add(new ArrayList<>(Arrays.asList(-1,2,-3)));
        List<List<Integer>> result = ob.findSubsequences(nums);
        assertEquals(expected, result);
    }
}