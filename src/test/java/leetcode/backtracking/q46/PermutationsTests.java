package leetcode.backtracking.q46;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.backtracking.q46.Permutations;

public class PermutationsTests {
    
    // Test if the correct number of permutations are generated
    @Test
    public void testPermutationsCount() {
        int[] nums = {1,2,3};
        Permutations ob = new Permutations();
        List<List<Integer>> perms = ob.permute(nums);
        assertEquals(factorial(nums.length), perms.size());
    }
    
    // Test if permutations are generated correctly
    @Test
    public void testPermutationsCorrectness() {
        int[] nums = {1,2,3};
        Permutations ob = new Permutations();
        List<List<Integer>> perms = ob.permute(nums);
        
        // Create an array of expected permutations
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1,2,3)));
        expected.add(new ArrayList<>(Arrays.asList(1,3,2)));
        expected.add(new ArrayList<>(Arrays.asList(2,1,3)));
        expected.add(new ArrayList<>(Arrays.asList(2,3,1)));
        expected.add(new ArrayList<>(Arrays.asList(3,1,2)));
        expected.add(new ArrayList<>(Arrays.asList(3,2,1)));
        
        // Compare the expected and actual permutations
        for(List<Integer> perm : perms) {
            assertTrue(expected.contains(perm));
        }
    }
    
    // Test if empty input array returns an empty list of permutations
    @Test
    public void testEmptyInput() {
        int[] nums = {};
        Permutations ob = new Permutations();
        List<List<Integer>> perms = ob.permute(nums);
        assertEquals(0, perms.size());
    }
    
    // Test if input array with one element returns the same element as a single permutation
    @Test
    public void testSingleElementInput() {
        int[] nums = {1};
        Permutations ob = new Permutations();
        List<List<Integer>> perms = ob.permute(nums);
        assertEquals(1, perms.size());
        assertEquals(1, perms.get(0).get(0));
    }
    
    // Test if null input returns null output
    @Test
    public void testNullInput() {
        Permutations ob = new Permutations();
        List<List<Integer>> perms = ob.permute(null);
        assertNull(perms);
    }
    
    // Test if negative integers in input array are handled correctly
    @Test
    public void testNegativeIntegers() {
        int[] nums = {-1,2,-3};
        Permutations ob = new Permutations();
        List<List<Integer>> perms = ob.permute(nums);
        
        // Create an array of expected permutations
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(-1,2,-3)));
        expected.add(new ArrayList<>(Arrays.asList(-1,-3,2)));
        expected.add(new ArrayList<>(Arrays.asList(2,-1,-3)));
        expected.add(new ArrayList<>(Arrays.asList(2,-3,-1)));
        expected.add(new ArrayList<>(Arrays.asList(-3,-1,2)));
        expected.add(new ArrayList<>(Arrays.asList(-3,2,-1)));
        
        // Compare the expected and actual permutations
        for(List<Integer> perm : perms) {
            assertTrue(expected.contains(perm));
        }
    }
    
    // Helper function to calculate factorial
    public static int factorial(int n) {
        if(n <= 1)
            return 1;
        else
            return n * factorial(n-1);
    }
}