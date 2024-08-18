package leetcode.dynamic_programming.q322;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0 || amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }

        Arrays.sort(coins);
        reverseArray(coins);

        int[] dp = new int[amount + 1];
        // Setting max value as default to be used a flag.
        // Any unreachable amount will remain as MAX_VALUE
        Arrays.fill(dp, amount + 1);

        // dp[amount]
        // cost for amount 0 is 0
        dp[0] = 0;

//        for (int i = 0; i < dp.length; i++) {
//            for (int coin: coins) {
//                if (coin <= i) {
//                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
//                }
//            }
//        }

        for (int coin: coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    private void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
