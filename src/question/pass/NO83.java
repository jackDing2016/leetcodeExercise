package question.pass;

import question.common.ListNode;

/**
 * <a href=https://leetcode.com/problems/remove-duplicates-from-sorted-list/>Go to Quest</a>
 */
public class NO83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode res = temp;
        while (temp != null && temp.next != null) {
            if ( temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return res;
    }

    public static void main(String[] args) {


        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1)));

        ListNode res =
        new NO83().deleteDuplicates(head);

        System.out.println(res);

    }

}
