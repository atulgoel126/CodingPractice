package leetcode.recursion_with_strings.q22;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.recursion_with_strings.q22.GenerateParentheses;
import java.util.List;
import java.util.Arrays;

public class GenerateParenthesesTests {
    
    private GenerateParentheses obj = new GenerateParentheses();
    
    @Test
    public void testEmptyN() {
        List<String> expected = Arrays.asList();
        List<String> result = obj.generateParenthesis(0);
        assertEquals(expected, result);
    }
    
    @Test
    public void testNegativeN() {
        List<String> expected = Arrays.asList();
        List<String> result = obj.generateParenthesis(-1);
        assertEquals(expected, result);
    }
    
    @Test
    public void testNEquals1() {
        List<String> expected = Arrays.asList("()");
        List<String> result = obj.generateParenthesis(1);
        assertEquals(expected, result);
    }
    
    @Test
    public void testNEquals2() {
        List<String> expected = Arrays.asList("(())", "()()");
        List<String> result = obj.generateParenthesis(2);
        assertEquals(expected, result);
    }
    
    @Test
    public void testNEquals3() {
        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> result = obj.generateParenthesis(3);
        assertEquals(expected, result);
    }
    
    @Test
    public void testLargeN() {
        List<String> result = obj.generateParenthesis(10);
        assertEquals(16796, result.size());
    }
    
    @Test
    public void testWithSpecialCharacters() {
        List<String> expected = Arrays.asList("()()", "(())", "(()", "())", "(((");
        List<String> result = obj.generateParenthesis(2);
        assertNotEquals(expected, result);
    }
    
    // Potential issue with input containing characters other than "(" or ")":
    // The method should check for invalid characters and return an empty list instead.
    
}