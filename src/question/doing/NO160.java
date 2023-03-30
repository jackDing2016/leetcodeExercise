package question.doing;

import question.common.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href=https://leetcode.com/problems/intersection-of-two-linked-lists/>Go to Quest</a>
 */
public class NO160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeHeadA = getSize(headA);
        int sizeHeadB = getSize(headB);
        if (sizeHeadA > sizeHeadB) {
            compare(skip(headA, sizeHeadA - sizeHeadB), headB);
        } else if (sizeHeadA < sizeHeadB) {
            compare(headA, skip(headB, sizeHeadB - sizeHeadA));
        } else compare(headA, headB);
        return null;
    }

    private ListNode compare(ListNode a, ListNode b) {
        if (a == b) return a;
        else return compare(a.next, b.next);
    }

    private ListNode skip(ListNode node, int skipNumber) {
        ListNode res = node;
        for (int i = 0; i < skipNumber; i++) {
            res = res.next;
        }
        return res;
    }

    private int getSize(ListNode node) {
        if (node == null) return 0;
        return 1 + getSize(node.next);
    }

}
