//package leetcode.array_string.q122;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.array_string.q122.BestTimetoBuyandSellStockII;
//
//public class BestTimetoBuyandSellStockIITests {
//
//    // Edge cases:
//    // 1. Empty array
//    // 2. Array with single element
//    // 3. Array with all elements equal (should return 0)
//    // 4. Array with decreasing prices (should return 0)
//    // 5. Array with prices in ascending order (should return difference between first and last prices)
//
//    @Test
//    public void testEmptyArray() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = {};
//        int expected = 0;
//        int actual = ob.maxProfit(prices);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testSingleElementArray() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = {5};
//        int expected = 0;
//        int actual = ob.maxProfit(prices);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testAllEqualPrices() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = {5, 5, 5, 5, 5};
//        int expected = 0;
//        int actual = ob.maxProfit(prices);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testDecreasingPrices() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = {10, 9, 8, 7, 6};
//        int expected = 0;
//        int actual = ob.maxProfit(prices);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testAscendingPrices() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = {5, 10, 20, 25, 30};
//        int expected = 25;
//        int actual = ob.maxProfit(prices);
//        assertEquals(expected, actual);
//    }
//
//    // Further test cases:
//    // 1. Array with negative prices
//    // 2. Array with large range of prices (check for possible integer overflows)
//    // 3. Array with multiple local maxima and minima
//
//    @Test
//    public void testNegativePrices() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = {-5, -10, -1, -3, -8};
//        int expected = 9;
//        int actual = ob.maxProfit(prices);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testLargeRangePrices() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = {Integer.MAX_VALUE, 10, 1000, 5000, Integer.MIN_VALUE};
//        int expected = 4990;
//        int actual = ob.maxProfit(prices);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testMultipleLocalExtrema() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = {7, 4, 6, 2, 9, 10, 3, 5};
//        int expected = 10;
//        int actual = ob.maxProfit(prices);
//        assertEquals(expected, actual);
//    }
//
//    // Potential issues:
//    // 1. Duplicate prices in array (should not count as multiple transactions)
//    // 2. Negative difference between prices (should not be included in max profit)
//    // 3. Empty/null array input (should throw exception)
//
//    @Test
//    public void testDuplicatePrices() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = {5, 5, 10, 7, 5, 10, 7};
//        int expected = 10;
//        int actual = ob.maxProfit(prices);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testNegativePriceDifference() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = {10, 7, 5, 3, 1};
//        int expected = 0;
//        int actual = ob.maxProfit(prices);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testEmptyArrayInput() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = {};
//
//        assertThrows(ArrayIndexOutOfBoundsException.class, () -> ob.maxProfit(prices));
//    }
//
//    @Test
//    public void testNullArrayInput() {
//        BestTimetoBuyandSellStockII ob = new BestTimetoBuyandSellStockII();
//        int[] prices = null;
//
//        assertThrows(NullPointerException.class, () -> ob.maxProfit(prices));
//    }
//}