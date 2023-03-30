package question.pass;

import question.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href=https://leetcode.com/problems/binary-tree-postorder-traversal/>Go to Quest</a>
 */
public class NO145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        add(res, root);
        return res;
    }

    private void add(List<Integer> list, TreeNode node) {
        if (node == null) return;
        add(list, node.left);
        add(list, node.right);
        list.add(node.val);
    }

}
