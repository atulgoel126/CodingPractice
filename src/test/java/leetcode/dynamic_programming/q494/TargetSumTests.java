package leetcode.dynamic_programming.q494;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TargetSumTests {

  TargetSum targetSum = new TargetSum();

  @Test
  public void testEmptyArray() {
    int[] nums = {};
    int target = 0;
    assertEquals(targetSum.findTargetSumWays(nums, target), 1);
  }

  @Test
  public void testTargetZero() {
    int[] nums = {1,2,3,4};
    int target = 0;
    assertEquals(targetSum.findTargetSumWays(nums, target), 2);
  }

  @Test
  public void testAllPositiveNums() {
    int[] nums = {1,2,3,4};
    int target = 10;
    assertEquals(targetSum.findTargetSumWays(nums, target), 1);
  }

  @Test
  public void testAllNegativeNums() {
    int[] nums = {-1,-2,-3,-4};
    int target = -10;
    assertEquals(targetSum.findTargetSumWays(nums, target), 1);
  }

  @Test
  public void testMixOfPositiveAndNegativeNums() {
    int[] nums = {1,-2,3,4};
    int target = 2;
    assertEquals(targetSum.findTargetSumWays(nums, target), 2);
  }

  @Test
  public void testTargetLargerThanMaxSum() {
    int[] nums = {1,2,3,4};
    int target = 20;
    assertEquals(targetSum.findTargetSumWays(nums, target), 0);
  }

  @Test
  public void testTargetSmallerThanMinSum() {
    int[] nums = {-1,-2,-3,4};
    int target = -10;
    assertEquals(targetSum.findTargetSumWays(nums, target), 1);
  }
}