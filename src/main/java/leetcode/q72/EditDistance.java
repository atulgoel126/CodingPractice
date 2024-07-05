package leetcode.q72;
public class EditDistance {
    public int minDistance(String word1, String word2) {

        int l1 = word1.length();
        int l2 = word2.length();

        int[][] memo = new int[l1][l2];

        // Initialize entire 2D array to -1.
        // -1 denotes that the calculation hasn't happened yet.
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                memo[i][j] = -1;
            }
        }
        // Start from the bottom right corner of the array
        return foo(word1, word2, l1 - 1, l2 - 1, memo);
    }

    private int foo(String s1, String s2, int i, int j, int[][] memo) {
        if (i < 0 || j < 0) {
            return Math.max(i,j) + 1;
        }
        // If already calculated, don't recalculate it again
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        // If the characters are the same in both strings, focus on the next character for both s1 and s2
        if (s1.charAt(i) == s2.charAt(j)) {
            memo[i][j] = foo(s1, s2, i - 1, j - 1, memo);
            return memo[i][j];
        }

        int insert = foo(s1, s2, i, j - 1, memo) + 1;
        int delete = foo(s1, s2, i - 1, j, memo) + 1;
        int replace = foo(s1, s2, i - 1, j - 1, memo) + 1;

        memo[i][j] = Math.min(insert, Math.min(delete, replace));
        return memo[i][j];
    }
}