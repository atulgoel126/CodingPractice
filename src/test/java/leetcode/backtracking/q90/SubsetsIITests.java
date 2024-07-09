package leetcode.backtracking.q90;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import leetcode.backtracking.q90.SubsetsII;

public class SubsetsIITests {
    
    @Test
    public void testEmptyList() {
        SubsetsII ob = new SubsetsII();
        int[] nums = {};
        List<List<Integer>> expected = Arrays.asList(
            new ArrayList<>()
        );
        assertEquals(expected, ob.subsetsWithDup(nums));
    }
    
    @Test
    public void testSingleElement() {
        SubsetsII ob = new SubsetsII();
        int[] nums = {1};
        List<List<Integer>> expected = Arrays.asList(
            new ArrayList<>(),
            Arrays.asList(1)
        );
        assertEquals(expected, ob.subsetsWithDup(nums));
    }
    
    @Test
    public void testDuplicateElements() {
        SubsetsII ob = new SubsetsII();
        int[] nums = {1,2,2};
        List<List<Integer>> expected = Arrays.asList(
            new ArrayList<>(),
            Arrays.asList(1),
            Arrays.asList(2),
            Arrays.asList(1,2),
            Arrays.asList(2,2),
            Arrays.asList(1,2,2)
        );
        assertEquals(expected, ob.subsetsWithDup(nums));
    }
    
    @Test
    public void testLargeArray() {
        SubsetsII ob = new SubsetsII();
        int[] nums = {5,8,2,9,2,2,1,7,0,6,8};
        List<List<Integer>> expected = Arrays.asList(
            new ArrayList<>(),
            Arrays.asList(0),
            Arrays.asList(1),
            Arrays.asList(2),
            Arrays.asList(5),
            Arrays.asList(6),
            Arrays.asList(7),
            Arrays.asList(8),
            Arrays.asList(0,1),
            Arrays.asList(1,2),
            Arrays.asList(5,8),
            Arrays.asList(0,2),
            Arrays.asList(6,8),
            Arrays.asList(7,9),
            Arrays.asList(2,2),
            Arrays.asList(2,2,1),
            Arrays.asList(2,2,9),
            Arrays.asList(2,2,5),
            Arrays.asList(2,2,6),
            Arrays.asList(8,8),
            Arrays.asList(2,2,6,9)
        );
        assertEquals(expected, ob.subsetsWithDup(nums));
    }
    
}