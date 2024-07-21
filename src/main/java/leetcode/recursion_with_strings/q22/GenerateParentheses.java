package leetcode.recursion_with_strings.q22;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        foo("(", 1, 0,n);
        return res;
    }

    private void foo(String curr, int open, int close, int n) {
        // This should never happen, just a sanity condition for myself
        if (curr.length() > n * 2) {
            System.err.println("This should never happen. curr:" + curr);
            return;
        }
        if (open == close && n * 2 == curr.length()) {
            res.add(curr);
        }

        if (open < n) {
            foo(curr + "(", open + 1, close, n);
        }
        if (close < open) {
            foo(curr + ")", open, close + 1, n);

        }
    }
}
