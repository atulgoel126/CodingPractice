package leetcode.linked_list.q19;

import static org.junit.jupiter.api.Assertions.*;

import leetcode.commons.ListNode;
import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndofListTests {

	@Test
    public void testEmptyList() {
        RemoveNthNodeFromEndofList ob = new RemoveNthNodeFromEndofList();
        ListNode head = null;

        assertNull(ob.removeNthFromEnd(head, 1));
    }

	@Test
	public void testSingleElement() {
		RemoveNthNodeFromEndofList ob = new RemoveNthNodeFromEndofList();
		ListNode head = new ListNode(1);

		assertNull(ob.removeNthFromEnd(head, 1));
	}

	@Test
	public void testLastNode() {
		RemoveNthNodeFromEndofList ob = new RemoveNthNodeFromEndofList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);

		ListNode result = ob.removeNthFromEnd(head, 1);
		assertEquals(result.val, 1);
		assertEquals(result.next, null);
	}

	@Test
	public void testMidNode() {
		RemoveNthNodeFromEndofList ob = new RemoveNthNodeFromEndofList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);

		ListNode result = ob.removeNthFromEnd(head, 2);
		assertEquals(result.val, 1);
		assertEquals(result.next.val, 2);
		assertEquals(result.next.next.val, 4);
		assertEquals(result.next.next.next, null);
	}

	@Test
	public void testFirstNode() {
		RemoveNthNodeFromEndofList ob = new RemoveNthNodeFromEndofList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);

		ListNode result = ob.removeNthFromEnd(head, 3);
		assertEquals(result.val, 2);
		assertEquals(result.next.val, 3);
		assertEquals(result.next.next, null);
	}

	@Test
	public void testOutOfRange() {
		RemoveNthNodeFromEndofList ob = new RemoveNthNodeFromEndofList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);

		assertThrows(IndexOutOfBoundsException.class, () -> ob.removeNthFromEnd(head, 4));
	}

}