package leetcode.commons;

public class ListNode {
    public ListNode next;
    public int val;
    public ListNode(int x) {
        val = x;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        ListNode other = (ListNode) obj;

        if (val != other.val) return false;

        if (next == null && other.next == null) return true;
        if (next == null || other.next == null) return false;

        return next.equals(other.next);
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    public String printList() {
        StringBuilder sb = new StringBuilder();
        ListNode cur = this;
        while (cur.next != null) {
            sb.append(cur.val).append("->");
            cur = cur.next;
        }
        sb.append(cur.val);
        return sb.toString();
    }
}
