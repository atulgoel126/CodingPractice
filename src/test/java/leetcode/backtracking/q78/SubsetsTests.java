//package leetcode.backtracking.q78;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.backtracking.q78.Subsets;
//import java.util.*;
//
//public class SubsetsTests {
//    Subsets ob = new Subsets();
//
//    @Test
//    public void testEmptyArray() {
//        int[] nums = {};
//        List<List<Integer>> expected = new ArrayList<>();
//        List<List<Integer>> result = ob.subsets(nums);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void testNullArray() {
//        int[] nums = null;
//        List<List<Integer>> expected = null;
//        List<List<Integer>> result = ob.subsets(nums);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void testDuplicates() {
//        int[] nums = {1, 2, 2};
//        List<List<Integer>> expected = new ArrayList<>();
//        expected.add(new ArrayList<>());
//        expected.add(Arrays.asList(1));
//        expected.add(Arrays.asList(2));
//        expected.add(Arrays.asList(1,2));
//        expected.add(Arrays.asList(2,2));
//        expected.add(Arrays.asList(1,2,2));
//        List<List<Integer>> result = ob.subsets(nums);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void testLargeArray() {
//        int[] nums = {1,2,3,4,5,6,7,8,9};
//        List<List<Integer>> expected = new ArrayList<>();
//        int numSubsets = (int) Math.pow(2, nums.length); // expected number of subsets for a set with n elements = 2^n
//        for(int i = 0; i < numSubsets; i++) { // generate all possible subsets and add to expected list
//            String binaryString = Integer.toBinaryString(i); // convert current index to binary
//            List<Integer> subset = new ArrayList<>();
//            for(int j = 0; j < binaryString.length(); j++) { // loop through binary digits, if 1 add element at corresponding index to subset
//                if(binaryString.charAt(binaryString.length() - 1 - j) == '1') {
//                    subset.add(nums[j]);
//                }
//            }
//            expected.add(subset);
//        }
//        List<List<Integer>> result = ob.subsets(nums);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void testNegativeNumbers() {
//        int[] nums = {-1, -2, -3};
//        List<List<Integer>> expected = new ArrayList<>();
//        expected.add(new ArrayList<>());
//        expected.add(Arrays.asList(-1));
//        expected.add(Arrays.asList(-2));
//        expected.add(Arrays.asList(-3));
//        expected.add(Arrays.asList(-1,-2));
//        expected.add(Arrays.asList(-1,-3));
//        expected.add(Arrays.asList(-2,-3));
//        expected.add(Arrays.asList(-1,-2,-3));
//        List<List<Integer>> result = ob.subsets(nums);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void testAllSameNumbers() {
//        int[] nums = {1,1,1,1};
//        List<List<Integer>> expected = new ArrayList<>();
//        expected.add(new ArrayList<>());
//        expected.add(Arrays.asList(1));
//        expected.add(Arrays.asList(1,1));
//        expected.add(Arrays.asList(1,1,1));
//        expected.add(Arrays.asList(1,1,1,1));
//        List<List<Integer>> result = ob.subsets(nums);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void testNegativeAndPositiveNumbers() {
//        int[] nums = {-1,1,-2,2,-3,3,-4,4};
//        List<List<Integer>> expected = new ArrayList<>();
//        expected.add(new ArrayList<>());
//        expected.add(Arrays.asList(-1));
//        expected.add(Arrays.asList(1));
//        expected.add(Arrays.asList(-1,1));
//        expected.add(Arrays.asList(-2));
//        expected.add(Arrays.asList(2));
//        expected.add(Arrays.asList(-1,-2));
//        expected.add(Arrays.asList(-1,2));
//        expected.add(Arrays.asList(1,2));
//        expected.add(Arrays.asList(-1,-2,2));
//        expected.add(Arrays.asList(-3));
//        expected.add(Arrays.asList(-1,-3));
//        expected.add(Arrays.asList(1,-3));
//        expected.add(Arrays.asList(-1,1,-3));
//        expected.add(Arrays.asList(-2,-3));
//        expected.add(Arrays.asList(2,-3));
//        expected.add(Arrays.asList(-1,-2,-3));
//        expected.add(Arrays.asList(-1,2,-3));
//        expected.add(Arrays.asList(1,2,-3));
//        expected.add(Arrays.asList(-1,-2,2,-3));
//        expected.add(Arrays.asList(-4));
//        expected.add(Arrays.asList(-1,-4));
//        expected.add(Arrays.asList(1,-4));
//        expected.add(Arrays.asList(-1,1,-4));
//        expected.add(Arrays.asList(-2,-4));
//        expected.add(Arrays.asList(2,-4));
//        expected.add(Arrays.asList(-1,-2,-4));
//        expected.add(Arrays.asList(-1,2,-4));
//        expected.add(Arrays.asList(1,2,-4));
//        expected.add(Arrays.asList(-1,-2,2,-4));
//        expected.add(Arrays.asList(-3,-4));
//        expected.add(Arrays.asList(-1,-3,-4));
//        expected.add(Arrays.asList(1,-3,-4));
//        expected.add(Arrays.asList(-1,1,-3,-4));
//        expected.add(Arrays.asList(-1,-2,-3,-4));
//        expected.add(Arrays.asList(-1,2,-3,-4));
//        expected.add(Arrays.asList(1,2,-3,-4));
//        expected.add(Arrays.asList(-1,-2,2,-3,-4));
//        List<List<Integer>> result = ob.subsets(nums);
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void testDuplicateNegativeNumbers() {
//        int[] nums = {-1,-1,-2,-3,-3,-3,-4};
//        List<List<Integer>> expected = new ArrayList<>();
//        expected.add(new ArrayList<>());
//        expected.add(Arrays.asList(-1));
//        expected.add(Arrays.asList(-1,-1));
//        expected.add(Arrays.asList(-2));
//        expected.add(Arrays.asList(-1,-2));
//        expected.add(Arrays.asList(-1,-1,-2));
//        expected.add(Arrays.asList(-3));
//        expected.add(Arrays.asList(-1,-3));
//        expected.add(Arrays.asList(-1,-1,-3));
//        expected.add(Arrays.asList(-2,-3));
//        expected.add(Arrays.asList(-1,-2,-3));
//        expected.add(Arrays.asList(-1,-1,-2,-3));
//        expected.add(Arrays.asList(-3,-3));
//        expected.add(Arrays.asList(-1,-3,-3));
//        expected.add(Arrays.asList(-1,-1,-3,-3));
//        expected.add(Arrays.asList(-2,-3,-3));
//        expected.add(Arrays.asList(-1,-2,-3,-3));
//        expected.add(Arrays.asList(-1,-1,-2,-3,-3));
//        expected.add(Arrays.asList(-3,-3,-3));
//        expected.add(Arrays.asList(-1,-3,-3,-3));
//        expected.add(Arrays.asList(-1,-1,-3,-3,-3));
//        expected.add(Arrays.asList(-2,-3,-3,-3));
//        expected.add(Arrays.asList(-1,-2,-3,-3,-3));
//        expected.add(Arrays.asList(-1,-1,-2,-3,-3,-3));
//        expected.add(Arrays.asList(-4));
//        expected.add(Arrays.asList(-1,-4));
//        expected.add(Arrays.asList(-1,-1,-4));
//        expected.add(Arrays.asList(-2,-4));
//        expected.add(Arrays.asList(-1,-2,-4));
//        expected.add(Arrays.asList(-1,-1,-2,-4));
//        expected.add(Arrays.asList(-3,-4));
//        expected.add(Arrays.asList(-1,-3,-4));
//        expected.add(Arrays.asList(-1,-1,-3,-4));
//        expected.add(Arrays.asList(-2,-3,-4));
//        expected.add(Arrays.asList(-1,-2,-3,-4));
//        expected.add(Arrays.asList(-1,-1,-2,-3,-4));
//        expected.add(Arrays.asList(-3,-3,-4));
//        expected.add(Arrays.asList(-1,-3,-3,-4));
//        expected.add(Arrays.asList(-1,-1,-3,-3,-4));
//        expected.add(Arrays.asList(-2,-3,-3,-4));
//        expected.add(Arrays.asList(-1,-2,-3,-3,-4));
//        expected.add(Arrays.asList(-1,-1,-2,-3,-3,-4));
//        expected.add(Arrays.asList(-3,-3,-3,-4));
//        expected.add(Arrays.asList(-1,-3,-3,-3,-4));
//        expected.add(Arrays.asList(-1,-1,-3,-3,-3,-4));
//        expected.add(Arrays.asList(-2,-3,-3,-3,-4));
//        expected.add(Arrays.asList(-1,-2,-3,-3,-3,-4));
//        expected.add(Arrays.asList(-1,-1,-2,-3,-3,-3,-4));
//        List<List<Integer>> result = ob.subsets(nums);
//        assertEquals(expected, result);
//    }
//
//
//}