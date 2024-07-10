package leetcode.stack.q20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTests {

//1) Empty string:
    @Test
    public void testEmptyString() {
        ValidParentheses ob = new ValidParentheses();
        assertTrue(ob.isValid(""));
    }

//2) Strings with only opening or closing parentheses:
    @Test
    public void testSingleOpeningParentheses() {
        ValidParentheses ob = new ValidParentheses();
        assertFalse(ob.isValid("("));
    }

    @Test
    public void testSingleClosingParentheses() {
        ValidParentheses ob = new ValidParentheses();
        assertFalse(ob.isValid(")"));
    }

//3) Strings with non-bracket characters:
    @Test
    public void testStringWithNonBracketChars() {
        ValidParentheses ob = new ValidParentheses();
        assertFalse(ob.isValid("ab(c+d*e)f"));
    }

//4) Strings with uneven number of brackets:
    @Test
    public void testUnevenBrackets() {
        ValidParentheses ob = new ValidParentheses();
        assertFalse(ob.isValid("((()))("));
        assertFalse(ob.isValid("(()))"));
    }

//5) Nested parentheses:
    @Test
    public void testNestedParentheses() {
        ValidParentheses ob = new ValidParentheses();
        assertTrue(ob.isValid("(())"));
        assertTrue(ob.isValid("(()(()))"));
        assertFalse(ob.isValid("(()))(())"));
    }

//6) Invalid parentheses order:
    @Test
    public void testInvalidOrder() {
        ValidParentheses ob = new ValidParentheses();
        assertFalse(ob.isValid(")("));
        assertFalse(ob.isValid("()((()()()"));
    }
}