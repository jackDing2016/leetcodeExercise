package question.fail;

import question.common.TreeNode;

/**
 * <a href=https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/>Go to Quest</a>
 */
public class NO1022 {

    public int sumRootToLeaf(TreeNode root) {
        return helper(0, root);
    }

    private int helper(int res, TreeNode node) {
        if (node == null) return 0;
        res = res + node.val;
        return helper(res, node.left) + helper(res, node.right);
    }

}
