//package leetcode.heap_priority_queue.q373;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.heap_priority_queue.q373.FindKPairswithSmallestSums;
//
//public class FindKPairswithSmallestSumsTests {
//
//  // test that input arrays are empty, expect empty output
//  @Test
//  public void testEmptyArrays() {
//    int[] nums1 = {};
//    int[] nums2 = {};
//    int k = 3;
//    int[][] expected = {};
//    FindKPairswithSmallestSums obj = new FindKPairswithSmallestSums();
//    int[][] actual = obj.kSmallestPairs(nums1, nums2, k);
//    assertArrayEquals(expected, actual);
//  }
//
//  // test that input arrays are null, expect null output
//  @Test
//  public void testNullArrays() {
//    int[] nums1 = null;
//    int[] nums2 = null;
//    int k = 3;
//    int[][] expected = null;
//    FindKPairswithSmallestSums obj = new FindKPairswithSmallestSums();
//    int[][] actual = obj.kSmallestPairs(nums1, nums2, k);
//    assertEquals(expected, actual);
//  }
//
//  // test that k is 0, expect empty output
//  @Test
//  public void testKZero() {
//    int[] nums1 = {1, 2, 3};
//    int[] nums2 = {4, 5, 6};
//    int k = 0;
//    int[][] expected = {};
//    FindKPairswithSmallestSums obj = new FindKPairswithSmallestSums();
//    int[][] actual = obj.kSmallestPairs(nums1, nums2, k);
//    assertArrayEquals(expected, actual);
//  }
//
//  // test that k is larger than the total number of pairs possible, expect all pairs to be outputted
//  @Test
//  public void testKLargerThanSize() {
//    int[] nums1 = {1, 2};
//    int[] nums2 = {3, 4};
//    int k = 10;
//    int[][] expected = {{1, 3}, {1, 4}, {2, 3}, {2, 4}};
//    FindKPairswithSmallestSums obj = new FindKPairswithSmallestSums();
//    int[][] actual = obj.kSmallestPairs(nums1, nums2, k);
//    assertArrayEquals(expected, actual);
//  }
//
//  // test that both input arrays are already sorted in ascending order, expect output to be the same
//  @Test
//  public void testSortedArrays() {
//    int[] nums1 = {1, 2, 3};
//    int[] nums2 = {4, 5, 6};
//    int k = 4;
//    int[][] expected = {{1, 4}, {1, 5}, {1, 6}, {2, 4}};
//    FindKPairswithSmallestSums obj = new FindKPairswithSmallestSums();
//    int[][] actual = obj.kSmallestPairs(nums1, nums2, k);
//    assertArrayEquals(expected, actual);
//  }
//
//  // test that both input arrays are already sorted in descending order, expect output to be sorted in ascending order
//  @Test
//  public void testReverseSortedArrays() {
//    int[] nums1 = {3, 2, 1};
//    int[] nums2 = {6, 5, 4};
//    int k = 4;
//    int[][] expected = {{1, 4}, {1, 5}, {1, 6}, {2, 4}};
//    FindKPairswithSmallestSums obj = new FindKPairswithSmallestSums();
//    int[][] actual = obj.kSmallestPairs(nums1, nums2, k);
//    assertArrayEquals(expected, actual);
//  }
//
//  // test that both input arrays contain duplicates, expect duplicates to be included in output
//  @Test
//  public void testDuplicateInputArrays() {
//    int[] nums1 = {1, 1, 2};
//    int[] nums2 = {2, 3};
//    int k = 3;
//    int[][] expected = {{1, 2}, {1, 3}, {1, 3}};
//    FindKPairswithSmallestSums obj = new FindKPairswithSmallestSums();
//    int[][] actual = obj.kSmallestPairs(nums1, nums2, k);
//    assertArrayEquals(expected, actual);
//  }
//
//  // test that input arrays contain negative integers, expect output to be sorted in ascending order
//  @Test
//  public void testNegativeIntegers() {
//    int[] nums1 = {-3, -2, -1};
//    int[] nums2 = {-6, -5, -4};
//    int k = 6;
//    int[][] expected = {{-3, -6}, {-2, -6}, {-1, -6}, {-3, -5}, {-2, -5}, {-3, -4}};
//    FindKPairswithSmallestSums obj = new FindKPairswithSmallestSums();
//    int[][] actual = obj.kSmallestPairs(nums1, nums2, k);
//    assertArrayEquals(expected, actual);
//  }
//}