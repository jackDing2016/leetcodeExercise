package question.toImprove;

import question.common.ListNode;

import java.util.Stack;

/**
 * <a href=https://leetcode.com/problems/reverse-linked-list/description/>Go to Quest</a>
 */
public class NO206 {

    public ListNode reverseList(ListNode head) {
        return method1(head);
    }

    /**
     * This method using stack
     *
     * @param head
     * @return
     */
    public ListNode method1(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        ListNode res = new ListNode();
        helper(res, stack);
        return res.next;
    }

    private void helper(ListNode node, Stack<ListNode> stack) {
        if (stack.isEmpty()) return;
        ListNode toAppend = stack.pop();
        toAppend.next = null;
        node.next = toAppend;
        helper(node.next, stack);
    }

    public ListNode method2(ListNode head) {

        return null;
    }

}
