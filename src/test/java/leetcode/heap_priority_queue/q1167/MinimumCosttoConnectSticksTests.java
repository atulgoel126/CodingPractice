//package leetcode.heap_priority_queue.q1167;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.heap_priority_queue.q1167.MinimumCosttoConnectSticks;
//
//public class MinimumCosttoConnectSticksTests {
//
//   // Test case for a simple input with only two sticks
//   @Test
//   public void testSimpleInput() {
//      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
//      int[] sticks = {2,4};
//      int expected = 6;
//      int actual = ob.connectSticks(sticks);
//      assertEquals(expected, actual);
//   }
//
//   // Test case for a larger input
//   @Test
//   public void testLargerInput() {
//      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
//      int[] sticks = {5,10,15};
//      int expected = 50;
//      int actual = ob.connectSticks(sticks);
//      assertEquals(expected, actual);
//   }
//
//   // Test case for an input with repeated values
//   @Test
//   public void testRepeatedInput() {
//      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
//      int[] sticks = {2,2,2,2};
//      int expected = 12;
//      int actual = ob.connectSticks(sticks);
//      assertEquals(expected, actual);
//   }
//
//   // Test case for an input with negative values
//   @Test
//   public void testNegativeInput() {
//      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
//      int[] sticks = {-5,10,3,-2};
//      int expected = 13;
//      int actual = ob.connectSticks(sticks);
//      assertEquals(expected, actual);
//   }
//
//   // Test case for an input with all zeros
//   @Test
//   public void testZeroInput() {
//      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
//      int[] sticks = {0,0,0,0};
//      int expected = 0;
//      int actual = ob.connectSticks(sticks);
//      assertEquals(expected, actual);
//   }
//
//   // Test case for an input with one stick only
//   @Test
//   public void testOneStickInput() {
//      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
//      int[] sticks = {100};
//      int expected = 0;
//      int actual = ob.connectSticks(sticks);
//      assertEquals(expected, actual);
//   }
//
//   // Test case for an empty input
//   @Test
//   public void testEmptyInput() {
//      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
//      int[] sticks = {};
//      int expected = 0;
//      int actual = ob.connectSticks(sticks);
//      assertEquals(expected, actual);
//   }
//
//   // Test case for an input with large values
//   @Test
//   public void testLargeInput() {
//      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
//      int[] sticks = {100000,1000000,500000};
//      int expected = 6500000;
//      int actual = ob.connectSticks(sticks);
//      assertEquals(expected, actual);
//   }
//
//   // Test case for an input with small values
//   @Test
//   public void testSmallInput() {
//      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
//      int[] sticks = {1,2,3};
//      int expected = 9;
//      int actual = ob.connectSticks(sticks);
//      assertEquals(expected, actual);
//   }
//
//   // Test case for an input with a mix of positive and negative values
//   @Test
//   public void testMixInput() {
//      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
//      int[] sticks = {-2,5,-10,3,1};
//      int expected = 19;
//      int actual = ob.connectSticks(sticks);
//      assertEquals(expected, actual);
//   }
//
//   // Test case for an input with large amount of sticks
//   @Test
//   public void testLargeSticksInput() {
//      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
//      int[] sticks = new int[10000];
//      for(int i = 0; i < 10000; i++) {
//         sticks[i] = i;
//      }
//      int expected = 49995000;
//      int actual = ob.connectSticks(sticks);
//      assertEquals(expected, actual);
//   }
//
//   // Test case for an input with decimal values
////   @Test
////   public void testDecimalInput() {
////      MinimumCosttoConnectSticks ob = new MinimumCosttoConnectSticks();
////      int[] sticks = {2,3,1.5,2.5};
////      int expected = 15;
////      int actual = ob.connectSticks(sticks);
////      assertEquals(expected, actual);
////   }
//}