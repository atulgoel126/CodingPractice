//package leetcode.monotonic_stack.q901;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.monotonic_stack.q901.OnlineStockSpan;
//
//public class OnlineStockSpanTests {
//
//    // Test case for empty price list
//    @Test
//    public void testEmptyPrices() {
//        OnlineStockSpan ob = new OnlineStockSpan();
//        int[] prices = new int[0];
//        for (int i = 0; i < prices.length; i++) {
//            assertEquals(0, ob.next(prices[i]));
//        }
//    }
//
//    // Test case for single price listed
//    @Test
//    public void testSinglePrice() {
//        OnlineStockSpan ob = new OnlineStockSpan();
//        int[] prices = {100};
//        assertEquals(1, ob.next(prices[0]));
//    }
//
//    // Test case for multiple increasing prices
//    @Test
//    public void testIncreasingPrices() {
//        OnlineStockSpan ob = new OnlineStockSpan();
//        int[] prices = {100, 200, 300, 400, 500};
//        int[] expected = {1, 2, 3, 4, 5};
//        for (int i = 0; i < prices.length; i++) {
//            assertEquals(expected[i], ob.next(prices[i]));
//        }
//    }
//
//    // Test case for multiple decreasing prices
//    @Test
//    public void testDecreasingPrices() {
//        OnlineStockSpan ob = new OnlineStockSpan();
//        int[] prices = {500, 400, 300, 200, 100};
//        int[] expected = {1, 1, 1, 1, 1};
//        for (int i = 0; i < prices.length; i++) {
//            assertEquals(expected[i], ob.next(prices[i]));
//        }
//    }
//
//    // Test case for alternate increasing and decreasing prices
//    @Test
//    public void testAlternatePrices() {
//        OnlineStockSpan ob = new OnlineStockSpan();
//        int[] prices = {100, 500, 200, 400, 300};
//        int[] expected = {1, 2, 1, 2, 1};
//        for (int i = 0; i < prices.length; i++) {
//            assertEquals(expected[i], ob.next(prices[i]));
//        }
//    }
//
//    // Test case for prices with same value
//    @Test
//    public void testSamePrices() {
//        OnlineStockSpan ob = new OnlineStockSpan();
//        int[] prices = {100, 100, 100, 100};
//        int[] expected = {1, 2, 3, 4};
//        for (int i = 0; i < prices.length; i++) {
//            assertEquals(expected[i], ob.next(prices[i]));
//        }
//    }
//
//    // Test case for large input
//    @Test
//    public void testLargeInput() {
//        OnlineStockSpan ob = new OnlineStockSpan();
//        int[] prices = new int[1000000];
//        int[] expected = new int[1000000];
//        for (int i = 0; i < prices.length; i++) {
//            prices[i] = i+1;
//            expected[i] = i+1;
//        }
//        for (int i = 0; i < prices.length; i++) {
//            assertEquals(expected[i], ob.next(prices[i]));
//        }
//    }
//
//    // Test case for negative prices
//    @Test
//    public void testNegativePrices() {
//        OnlineStockSpan ob = new OnlineStockSpan();
//        int[] prices = {-100, -200, -300, 400, 500};
//        int[] expected = {1, 1, 1, 4, 5};
//        for (int i = 0; i < prices.length; i++) {
//            assertEquals(expected[i], ob.next(prices[i]));
//        }
//    }
//}