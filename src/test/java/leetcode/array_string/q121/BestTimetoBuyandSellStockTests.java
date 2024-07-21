//package leetcode.array_string.q121;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.array_string.q121.BestTimetoBuyandSellStock;
//
//public class BestTimetoBuyandSellStockTests {
//
//    // Test an empty array
//    @Test
//    public void testEmptyArray() {
//        int[] prices = {};
//        BestTimetoBuyandSellStock ob = new BestTimetoBuyandSellStock();
//        int result = ob.maxProfit(prices);
//        assertEquals(0, result);
//    }
//
//    // Test array with only one element
//    @Test
//    public void testSingleElementArray() {
//        int[] prices = {10};
//        BestTimetoBuyandSellStock ob = new BestTimetoBuyandSellStock();
//        int result = ob.maxProfit(prices);
//        assertEquals(0, result);
//    }
//
//    // Test array with all negative numbers
//    @Test
//    public void testAllNegativeArray() {
//        int[] prices = {-1, -5, -3, -10};
//        BestTimetoBuyandSellStock ob = new BestTimetoBuyandSellStock();
//        int result = ob.maxProfit(prices);
//        assertEquals(0, result);
//    }
//
//    // Test array with all positive numbers
//    @Test
//    public void testAllPositiveArray() {
//        int[] prices = {1, 2, 3, 4, 5};
//        BestTimetoBuyandSellStock ob = new BestTimetoBuyandSellStock();
//        int result = ob.maxProfit(prices);
//        assertEquals(4, result);
//    }
//
//    // Test array with all equal numbers
//    @Test
//    public void testAllEqualArray() {
//        int[] prices = {1, 1, 1, 1, 1};
//        BestTimetoBuyandSellStock ob = new BestTimetoBuyandSellStock();
//        int result = ob.maxProfit(prices);
//        assertEquals(0, result);
//    }
//
//    // Test array with alternating gain and loss
//    @Test
//    public void testAlternatingArray() {
//        int[] prices = {1, -2, 3, -4, 5, -6};
//        BestTimetoBuyandSellStock ob = new BestTimetoBuyandSellStock();
//        int result = ob.maxProfit(prices);
//        assertEquals(8, result);
//    }
//
//    // Test array with multiple peaks and valleys
//    @Test
//    public void testPeakValleyArray() {
//        int[] prices = {5, 10, 2, 15, 20, 3, 8};
//        BestTimetoBuyandSellStock ob = new BestTimetoBuyandSellStock();
//        int result = ob.maxProfit(prices);
//        assertEquals(18, result);
//    }
//
//    // Test array with a single peak and valley
//    @Test
//    public void testSinglePeakValleyArray() {
//        int[] prices = {10, 2, 15, 4, 20};
//        BestTimetoBuyandSellStock ob = new BestTimetoBuyandSellStock();
//        int result = ob.maxProfit(prices);
//        assertEquals(18, result);
//    }
//}