package question.pass;

import question.common.TreeNode;

/**
 * <a href=https://leetcode.com/problems/symmetric-tree/>Go to Guest</a>
 */
public class NO101 {

    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val == right.val) {
            return helper(left.left, right.right) && helper(left.right, right.left);
        }
        return false;
    }

}
