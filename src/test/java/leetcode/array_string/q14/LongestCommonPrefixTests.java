package leetcode.array_string.q14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.array_string.q14.LongestCommonPrefix;

public class LongestCommonPrefixTests {
    
    // Test case for empty array
    @Test
    public void testEmptyArray() {
        String[] strings = {};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("", result);
    }
    
    // Test case for array with single string
    @Test
    public void testSingleString() {
        String[] strings = {"flower"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("flower", result);
    }
    
    // Test case for array with all identical strings
    @Test
    public void testIdenticalStrings() {
        String[] strings = {"apple", "apple", "apple"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("apple", result);
    }
    
    // Test case for array with no common prefix
    @Test
    public void testNoCommonPrefix() {
        String[] strings = {"dog", "cat", "bird"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("", result);
    }
    
    // Test case for array with one empty string
    @Test
    public void testEmptyStringInArray() {
        String[] strings = {"", "flower", "sunflower"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("", result);
    }
    
    // Test case for array with multiple empty strings
    @Test
    public void testMultipleEmptyStrings() {
        String[] strings = {"", "", "", "flower"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("", result);
    }
    
    // Test case for array with strings of different lengths
    @Test
    public void testDifferentLengths() {
        String[] strings = {"apple", "app", "ap"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("ap", result);
    }
    
    // Test case for array with special characters
    @Test
    public void testSpecialCharacters() {
        String[] strings = {"!@#$", "!@#$%^", "!@#$%^&*"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("!@#$", result);
    }
    
    // Test case for array with null values
    @Test
    public void testNullValuesInArray() {
        String[] strings = {null, "apple", "orange"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("", result);
    }
    
    // Test case for array with only null values
    @Test
    public void testOnlyNullValuesInArray() {
        String[] strings = {null, null, null};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("", result);
    }
    
    // Test case for array with strings of different cases
    @Test
    public void testDifferentCases() {
        String[] strings = {"Apple", "aPPle", "apPLe"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("a", result);
    }
    
    // Test case for array with only one string of different case
    @Test
    public void testSingleDifferentCase() {
        String[] strings = {"apple", "APPLE", "apple"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("apple", result);
    }
    
    // Test case for array with strings containing white spaces
    @Test
    public void testWhiteSpaces() {
        String[] strings = {" apple ", " apple pie ", " apple juice "};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals(" apple ", result);
    }
    
    // Test case for array with only one string containing white spaces
    @Test
    public void testSingleStringWithWhiteSpaces() {
        String[] strings = {"apple", "apple pie", "apple"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("apple", result);
    }
    
    // Test case for array with strings containing numbers
    @Test
    public void testNumbers() {
        String[] strings = {"123", "123000", "123456789"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("123", result);
    }
    
    // Test case for array with only one string containing numbers
    @Test
    public void testSingleStringWithNumbers() {
        String[] strings = {"apple123", "apple456", "apple"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("apple", result);
    }
    
    // Test case for array with strings of only one character
    @Test
    public void testSingleCharacterStrings() {
        String[] strings = {"a", "b", "c", "d"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("", result);
    }
    
    // Test case for array with strings of only one character and empty string
    @Test
    public void testWithEmptyStringAndSingleCharacterStrings() {
        String[] strings = {"", "a", "b", "c"};
        LongestCommonPrefix ob = new LongestCommonPrefix();
        String result = ob.longestCommonPrefix(strings);
        assertEquals("", result);
    }
}