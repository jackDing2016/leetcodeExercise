package question.pass;

import question.common.TreeNode;

/**
 * <a href=https://leetcode.com/problems/path-sum/>Go to Quest</a>
 */
public class NO112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return helper(root, 0, targetSum);
    }

    private boolean helper(TreeNode node, int temp, int targetSum) {
        if (node == null) return false;
        temp = temp + node.val;
        if (temp == targetSum && (node.left == null && node.right == null)) return true;
        return helper(node.left, temp, targetSum) || helper(node.right, temp, targetSum);
    }

}
