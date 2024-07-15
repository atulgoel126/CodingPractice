package leetcode.linked_list.q19;

import leetcode.commons.ListNode;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        ListNode iter = head;
        int count = 0;
        while (iter != null) {
            iter = iter.next;
            count++;
        }

        int nodeToRemove = count - n;

        if (nodeToRemove < 0) {
            throw new IndexOutOfBoundsException("Index: " + nodeToRemove + ", Size: " + count);
        }

        if (nodeToRemove == 0) {
            return head.next;
        }

        iter = head;
        while (nodeToRemove > 1) {
            iter = iter.next;
            nodeToRemove--;
        }
        // account for deletion of last node

        if (iter.next != null) {
            iter.next = iter.next.next;
        }

        return head;

    }

}
