package question.fail;

import java.util.ArrayList;
import java.util.List;

import question.common.TreeNode;

/**
 * <a href=https://leetcode.com/problems/binary-tree-paths/>Go to Quest</a>
 */

public class NO257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        helper(root, res, path);
        return res;
    }

    private void helper(TreeNode node, List<String> res, StringBuilder path){
        if(node==null) return;
        int len=path.length();
        path.append(node.val);
        if(node.left == null && node.right == null) {
            res.add(path.toString());
        }
        else{
            path.append("->");
            helper(node.left, res, path);
            helper(node.right, res, path);
        }
        path.setLength(len);
    }

    public static void main(String[] args) {
        System.out.println("aa");
    }
}
