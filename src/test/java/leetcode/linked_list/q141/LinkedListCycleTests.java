//package leetcode.linked_list.q141;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//
//public class LinkedListCycleTests {
//
//	ListNode head;
//	ListNode cycleNode;
//	LinkedListCycle ob;
//
//	@BeforeEach
//	void setUp() throws Exception {
//		head = new ListNode(1);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
//		cycleNode = new ListNode(6);
//		head.next.next.next.next.next = cycleNode;
//		cycleNode.next = head.next.next;
//		ob = new LinkedListCycle();
//	}
//
//	@Test
//	public void testHasCycle() {
//		assertTrue(ob.hasCycle(head));
//	}
//
//	@Test
//	public void testHasCycle_NoCycle() {
//		assertFalse(ob.hasCycle(head.next));
//	}
//
//	@Test
//	public void testHasCycle_OneNode() {
//		assertFalse(ob.hasCycle(new ListNode(1)));
//	}
//
//	@Test
//	public void testHasCycle_NullHead() {
//		assertFalse(ob.hasCycle(null));
//	}
//
//	@Test
//	public void testHasCycle_SingleCycleNode() {
//		cycleNode.next = cycleNode;
//		assertTrue(ob.hasCycle(head));
//	}
//
//	@Test
//	public void testHasCycle_TailCycle() {
//		cycleNode.next = new ListNode(7);
//		assertFalse(ob.hasCycle(head));
//	}
//
//	@Test
//	public void testHasCycle_LongList() {
//		head.next.next.next.next.next.next = new ListNode(8);
//		head.next.next.next.next.next.next.next = new ListNode(9);
//		head.next.next.next.next.next.next.next.next = new ListNode(10);
//		cycleNode.next = head.next.next.next.next.next.next.next;
//		assertTrue(ob.hasCycle(head));
//	}
//
//	@Test
//	public void testHasCycle_SameNodeRepeated() {
//		head.next.next.next.next.next.next = new ListNode(8);
//		cycleNode.next = head.next.next.next.next.next.next;
//		assertTrue(ob.hasCycle(head));
//	}
//
//	@Test
//	public void testHasCycle_EqualNodes() {
//		head.next.next.next.next.next.next = new ListNode(8);
//		cycleNode.next = head;
//		assertTrue(ob.hasCycle(head));
//	}
//
//	@Test
//	public void testHasCycle_SameValueDifferentNodes() {
//		head.next.next.next.next.next.next = new ListNode(6);
//		ListNode cycleNode2 = new ListNode(6);
//		head.next.next.next.next.next.next.next = cycleNode2;
//		cycleNode2.next = head.next.next;
//		assertTrue(ob.hasCycle(head));
//	}
//
//	@Test
//	public void testHasCycle_DuplicateValues() {
//		head = new ListNode(1);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(2);
//		head.next.next.next = new ListNode(3);
//		head.next.next.next.next = new ListNode(3);
//		head.next.next.next.next.next = new ListNode(3);
//		head.next.next.next.next.next.next = new ListNode(4);
//		cycleNode = new ListNode(4);
//		head.next.next.next.next.next.next.next = cycleNode;
//		cycleNode.next = head.next;
//		assertTrue(ob.hasCycle(head));
//	}
//
//	@Test
//	public void testHasCycle_NullNodeInList() {
//		head.next.next = null;
//		assertFalse(ob.hasCycle(head));
//	}
//
//	@Test
//	public void testHasCycle_NullNodeInCycle() {
//		head.next.next.next.next = null;
//		assertFalse(ob.hasCycle(head));
//	}
//
//}