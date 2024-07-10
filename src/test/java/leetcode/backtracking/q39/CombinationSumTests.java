package leetcode.backtracking.q39;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumTests {
    @Test
    public void testEmptyInput() {
        CombinationSum ob = new CombinationSum();
        int[] candidates = {};
        int target = 5;
        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> result = ob.combinationSum(candidates, target);
        
        assertEquals(expected, result);
    }

    @Test
    public void testNoCombinationSum() {
        CombinationSum ob = new CombinationSum();
        int[] candidates = {2, 4, 6};
        int target = 5;
        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> result = ob.combinationSum(candidates, target);
        
        assertEquals(expected, result);
    }

    @Test
    public void testSingleCombinationSum() {
        CombinationSum ob = new CombinationSum();
        int[] candidates = {2, 4, 6};
        int target = 6;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(6));

        List<List<Integer>> result = ob.combinationSum(candidates, target);
        
        assertEquals(expected, result);
    }

    @Test
    public void testMultipleCombinationSum() {
        CombinationSum ob = new CombinationSum();
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 2, 2, 2));
        expected.add(Arrays.asList(2, 3, 3));
        expected.add(Arrays.asList(3, 5));

        List<List<Integer>> result = ob.combinationSum(candidates, target);
        
        assertEquals(expected, result);
    }

    @Test
    public void testNegativeTarget() {
        CombinationSum ob = new CombinationSum();
        int[] candidates = {2, 4, 6};
        int target = -5;
        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> result = ob.combinationSum(candidates, target);
        
        assertEquals(expected, result);
    }

    @Test
    public void testNegativeCandidates() {
        CombinationSum ob = new CombinationSum();
        int[] candidates = {-2, -4, -6};
        int target = 5;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-2, -2, 2, 3, 4));

        List<List<Integer>> result = ob.combinationSum(candidates, target);
        
        assertEquals(expected, result);
    }

    @Test
    public void testDuplicateCombinations() {
        CombinationSum ob = new CombinationSum();
        int[] candidates = {3, 3, 3};
        int target = 9;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3, 3, 3));

        List<List<Integer>> result = ob.combinationSum(candidates, target);
        
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyCandidates() {
        CombinationSum ob = new CombinationSum();
        int[] candidates = {};
        int target = 9;
        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> result = ob.combinationSum(candidates, target);
        
        assertEquals(expected, result);
    }

    @Test
    public void testVeryLargeCandidates() {
        CombinationSum ob = new CombinationSum();
        int[] candidates = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        int target = 0;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0));

        List<List<Integer>> result = ob.combinationSum(candidates, target);
        
        assertEquals(expected, result);
    }

    @Test
    public void testVeryLargeTarget() {
        CombinationSum ob = new CombinationSum();
        int[] candidates = {3, 6, 9};
        int target = Integer.MAX_VALUE;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3, 3, 3, 3));

        List<List<Integer>> result = ob.combinationSum(candidates, target);

        // Check that all combinations sum up to target
        for (List<Integer> combination : result) {
            int sum = 0;
            for (int num : combination) {
                sum += num;
            }
            assertEquals(target, sum);
        }
    }
}