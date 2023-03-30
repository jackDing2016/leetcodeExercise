package question.pass;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href=https://leetcode.com/problems/n-ary-tree-preorder-traversal/>Go to Quest</a>
 */
public class NO589 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    public List<Integer> preorder(Node root) {

        List<Integer> res = new ArrayList<>();
        helper(res, root);
        return res;
    }

    private void helper(List<Integer> list, Node node) {
        if (node == null) return;
        list.add(node.val);
        if (node.children != null) {
            for (Node child : node.children) {
                helper(list, child);
            }
        }
    }

}
