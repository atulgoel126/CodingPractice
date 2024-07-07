package leetcode.commons;

public class DoubleLinkedList {
    private final Node head;
    private final Node tail;

    public DoubleLinkedList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

     public void addToHead(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public Node removeTail() {
        Node node = tail.prev;
        removeNode(node);
        return node;
    }
}
