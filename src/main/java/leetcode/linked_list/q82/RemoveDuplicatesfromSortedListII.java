package leetcode.linked_list.q82;

import leetcode.commons.ListNode;

public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        // -1-> 1 -> 1 -> 1 -> 2 -> 3 -> 3
        //  p                            c    c.n
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
