//package leetcode.recursion_with_strings.q301;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.recursion_with_strings.q301.RemoveInvalidParentheses;
//
//public class RemoveInvalidParenthesesTests {
//
//    // Test case for a string with no invalid parentheses
//    @Test
//    public void testNoInvalidParentheses() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("abc(def)ghi");
//
//        assertEquals("abc(def)ghi", result);
//    }
//
//    // Test case for a string with single invalid parentheses
//    @Test
//    public void testSingleInvalidParentheses() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("a(bcd)))");
//
//        assertEquals("a(bcd)", result);
//    }
//
//    // Test case for a string with multiple invalid parentheses
//    @Test
//    public void testMultipleInvalidParentheses() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("))()(abc())def)))");
//
//        assertEquals("(abc)def", result);
//    }
//
//    // Test case for a string with invalid parentheses at beginning
//    @Test
//    public void testInvalidParenthesesAtBeginning() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses(")))((((abc)))def");
//
//        assertEquals("(abc)def", result);
//    }
//
//    // Test case for a string with invalid parentheses at end
//    @Test
//    public void testInvalidParenthesesAtEnd() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("abc((())def(((()))))");
//
//        assertEquals("abc(()def(()))", result);
//    }
//
//    // Test case for a string with all invalid parentheses
//    @Test
//    public void testAllInvalidParentheses() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("))((()()((()");
//
//        assertEquals("", result);
//    }
//
//    // Test case for an empty string
//    @Test
//    public void testEmptyString() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("");
//
//        assertEquals("", result);
//    }
//
//    // Test case for a string with only valid parentheses
//    @Test
//    public void testOnlyValidParentheses() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("((()))");
//
//        assertEquals("((()))", result);
//    }
//
//    // Test case for a string with only invalid parentheses
//    @Test
//    public void testOnlyInvalidParentheses() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("))((");
//
//        assertEquals("", result);
//    }
//
//    // Test case for a string with uneven number of parentheses
//    @Test
//    public void testUnevenParentheses() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("())");
//
//        assertEquals("()", result);
//    }
//
//    // Test case for a string with other characters besides parentheses
//    @Test
//    public void testOtherCharacters() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("abc(def)@#ghi");
//
//        assertEquals("abc(def)@#ghi", result);
//    }
//
//    // Test case for a string with nested invalid parentheses
//    @Test
//    public void testNestedInvalidParentheses() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("a()(b(())c");
//
//        assertEquals("a(b())c", result);
//    }
//
//    // Test case for a string with only one type of parentheses
//    @Test
//    public void testSingleParenthesesType() {
//        RemoveInvalidParentheses ob = new RemoveInvalidParentheses();
//        String result = ob.removeInvalidParentheses("(((");
//
//        assertEquals("(((", result);
//    }
//}