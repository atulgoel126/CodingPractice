//package leetcode.stack.q150;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.stack.q150.EvaluateReversePolishNotation;
//
//public class EvaluateReversePolishNotationTests {
//
//    // Test case for basic arithmetic operations
//    @Test
//    public void testBasicOperations() {
//        EvaluateReversePolishNotation ob = new EvaluateReversePolishNotation();
//
//        // Input: ["2", "1", "+"]  Output: 3
//        String[] tokens1 = {"2", "1", "+"};
//        assertEquals(3, ob.evalRPN(tokens1));
//
//        // Input: ["4", "13", "5", "/", "+"]  Output: 6
//        String[] tokens2 = {"4", "13", "5", "/", "+"};
//        assertEquals(6, ob.evalRPN(tokens2));
//
//        // Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]  Output: 22
//        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
//        assertEquals(22, ob.evalRPN(tokens3));
//    }
//
//    // Test case for handling negative numbers
//    @Test
//    public void testNegativeNumbers() {
//        EvaluateReversePolishNotation ob = new EvaluateReversePolishNotation();
//
//        // Input: ["-1", "1", "+"]  Output: 0
//        String[] tokens1 = {"-1", "1", "+"};
//        assertEquals(0, ob.evalRPN(tokens1));
//
//        // Input: ["1", "-5", "-"]  Output: 6
//        String[] tokens2 = {"1", "-5", "-"};
//        assertEquals(6, ob.evalRPN(tokens2));
//    }
//
//    // Test case for handling decimal numbers
//    @Test
//    public void testDecimalNumbers() {
//        EvaluateReversePolishNotation ob = new EvaluateReversePolishNotation();
//
//        // Input: ["2.5", "0.5", "*"]  Output: 1.25
//        String[] tokens1 = {"2.5", "0.5", "*"};
//        assertEquals(1.25, ob.evalRPN(tokens1));
//
//        // Input: ["3.6", "1.2", "/"]  Output: 3
//        String[] tokens2 = {"3.6", "1.2", "/"};
//        assertEquals(3, ob.evalRPN(tokens2));
//    }
//
//    // Test case for division by zero
//    @Test
//    public void testDivisionByZero() {
//        EvaluateReversePolishNotation ob = new EvaluateReversePolishNotation();
//
//        // Input: ["2", "0", "/"]  Output: Error - cannot divide by zero
//        String[] tokens1 = {"2", "0", "/"};
//        assertThrows(ArithmeticException.class, () -> ob.evalRPN(tokens1));
//
//        // Input: ["7", "3", "-", "0", "/"]  Output: Error - cannot divide by zero
//        String[] tokens2 = {"7", "3", "-", "0", "/"};
//        assertThrows(ArithmeticException.class, () -> ob.evalRPN(tokens2));
//    }
//
//    // Test case for handling empty input
//    @Test
//    public void testEmptyInput() {
//        EvaluateReversePolishNotation ob = new EvaluateReversePolishNotation();
//
//        // Input: []  Output: Error - no input provided
//        String[] tokens = {};
//        assertThrows(IllegalArgumentException.class, () -> ob.evalRPN(tokens));
//    }
//
//    // Test case for handling invalid input
//    @Test
//    public void testInvalidInput() {
//        EvaluateReversePolishNotation ob = new EvaluateReversePolishNotation();
//
//        // Input: ["2", "1", "3", "+"]
//        String[] tokens1 = {"2", "1", "3", "+"};
//        assertThrows(IllegalArgumentException.class, () -> ob.evalRPN(tokens1));
//
//        // Input: ["2", "1", "#"]
//        String[] tokens2 = {"2", "1", "#"};
//        assertThrows(IllegalArgumentException.class, () -> ob.evalRPN(tokens2));
//    }
//}