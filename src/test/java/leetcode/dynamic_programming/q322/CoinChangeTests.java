package leetcode.dynamic_programming.q322;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTests {

    // Test for base case when amount is zero
    @Test
    public void testZeroAmount() {
        CoinChange ob = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 0;
        int expected = 0;
        int actual = ob.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

    // Test for base case when coins array is empty
    @Test
    public void testEmptyCoinsArray() {
        CoinChange ob = new CoinChange();
        int[] coins = {};
        int amount = 10;
        int expected = -1;
        int actual = ob.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

    // Test for base case when coins array contains duplicate coins
    @Test
    public void testDuplicateCoins() {
        CoinChange ob = new CoinChange();
        int[] coins = {1, 2, 2, 5};
        int amount = 10;
        int expected = 2;
        int actual = ob.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

    // Test for base case when amount cannot be made with given coins
    @Test
    public void testImpossibleAmount() {
        CoinChange ob = new CoinChange();
        int[] coins = {2, 4, 5};
        int amount = 3;
        int expected = -1;
        int actual = ob.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

    // Test for base case when amount can only be made with 1 coin
    @Test
    public void testSingleCoinAmount() {
        CoinChange ob = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 5;
        int expected = 1;
        int actual = ob.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

    // Test for base case when amount can be made with multiple combinations
    @Test
    public void testMultipleCombinations() {
        CoinChange ob = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 10;
        int expected = 2;
        int actual = ob.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

    // Test for maximum possible amount
    @Test
    public void testMaxAmount() {
        CoinChange ob = new CoinChange();
        int[] coins = {1, 5, 10, 25, 50};
        int amount = 100;
        int expected = 2;
        int actual = ob.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

    // Test for large amount and coins array
    @Test
    public void testLargeAmountAndCoins() {
        CoinChange ob = new CoinChange();
        int[] coins = {1, 3, 7, 10, 25, 50, 100};
        int amount = 1000;
        int expected = 10;
        int actual = ob.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

    // Test for potential overflow case
    @Test
    public void testOverflow() {
        CoinChange ob = new CoinChange();
        int[] coins = {Integer.MAX_VALUE};
        int amount = 10;
        int expected = -1;
        int actual = ob.coinChange(coins, amount);
        assertEquals(expected, actual);
    }

}