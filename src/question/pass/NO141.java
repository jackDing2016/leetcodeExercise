package question.pass;

import question.common.ListNode;

/**
 *<a href=https://leetcode.com/problems/linked-list-cycle/>Go to Quest</a>
 */
public class NO141 {
    public boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode node1 = head.next;

        if ( node1 == null ) return false;

        ListNode node2 = head.next.next;

        while ( node1 != null && node2 != null ) {
            if ( node1 == node2 ) return true;
            node1 = node1.next;
            if ( node2.next == null ) return false;
            node2 = node2.next.next;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
