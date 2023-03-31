package question.notBySelf;

import question.common.ListNode;

/**
 * <a href=https://leetcode.com/problems/swap-nodes-in-pairs/>Go to Quest</a>
 */
public class NO24 {
    public ListNode swapPairs(ListNode head) {
        return helper(head);
    }

    private ListNode helper(ListNode a) {

        if (a == null || a.next == null) return a;
        ListNode b = a.next;
        ListNode c = b.next;

        b.next = a;
        a.next = helper(c);
        return b;
    }

}
