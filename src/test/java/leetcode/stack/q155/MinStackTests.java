package leetcode.stack.q155;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.stack.q155.MinStack;

public class MinStackTests {

    @Test
    public void testPushAndPop() {
        // Test basic push and pop operations
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(2);
        stack.push(4);
        assertEquals(4, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(5, stack.pop());
    }

    @Test
    public void testMin() {
        // Test min function after various push operations
        MinStack stack = new MinStack();
        // Push 5 and check min
        stack.push(5);
        assertEquals(5, stack.getMin());
        // Push 2 and check min
        stack.push(2);
        assertEquals(2, stack.getMin());
        // Push 4 and check min
        stack.push(4);
        assertEquals(2, stack.getMin());
        // Push 1 and check min
        stack.push(1);
        assertEquals(1, stack.getMin());
    }

    @Test
    public void testEmptyStack() {
        // Test pop and getMin functions on empty stack
        MinStack stack = new MinStack();
        assertNull(stack.pop());
        assertNull(stack.getMin());
    }

    @Test
    public void testNegativeValues() {
        // Test push and getMin functions with negative values
        MinStack stack = new MinStack();
        stack.push(-5);
        assertEquals(-5, stack.getMin());
        stack.push(-10);
        assertEquals(-10, stack.getMin());
        stack.push(-2);
        assertEquals(-10, stack.getMin());
    }

    @Test
    public void testDuplicateValues() {
        // Test push and getMin functions with duplicate values
        MinStack stack = new MinStack();
        stack.push(5);
        assertEquals(5, stack.getMin());
        stack.push(2);
        assertEquals(2, stack.getMin());
        stack.push(5);
        assertEquals(2, stack.getMin());
    }

    @Test
    public void testPopAllElements() {
        // Test pop function on stack with multiple elements
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertNull(stack.pop());
    }

    @Test
    public void testPushAndPopAlternating() {
        // Test push and pop functions with alternating operations
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        stack.push(3);
        stack.push(4);
        assertEquals(4, stack.pop());
        assertEquals(3, stack.pop());
        assertEquals(1, stack.pop());
    }

//    @Test
//    public void testPushNull() {
//        // Test push function with null value
//        MinStack stack = new MinStack();
//        stack.push(null);
//        assertNull(stack.pop());
//    }
//
//    @Test
//    public void testNullMin() {
//        // Test getMin function on stack with null values
//        MinStack stack = new MinStack();
//        stack.push(null);
//        assertEquals(null, stack.getMin());
//        stack.push(2);
//        assertEquals(2, stack.getMin());
//    }
}