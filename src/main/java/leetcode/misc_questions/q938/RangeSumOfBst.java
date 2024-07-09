package leetcode.misc_questions.q938;

import leetcode.commons.TreeNode;

public class RangeSumOfBst {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val > high || root.val < low) {
            return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
        else {
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
    }
}


