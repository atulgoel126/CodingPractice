package leetcode.linked_list.q141;

import leetcode.commons.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
