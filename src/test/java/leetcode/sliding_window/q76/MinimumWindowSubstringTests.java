package leetcode.sliding_window.q76;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.sliding_window.q76.MinimumWindowSubstring;

public class MinimumWindowSubstringTests {
    // Edge cases: empty string and empty pattern
    @Test
    public void testEmptyStrings() {
        String s = "";
        String t = "";
        MinimumWindowSubstring ob = new MinimumWindowSubstring();
        String result = ob.minWindow(s, t);
        assertEquals("", result);
    }
    
    // Edge case: string contains all characters in pattern but in different order
    @Test
    public void testSameCharsInDifferentOrder() {
        String s = "acbcac";
        String t = "cab";
        MinimumWindowSubstring ob = new MinimumWindowSubstring();
        String result = ob.minWindow(s, t);
        assertEquals("cab", result);
    }
    
    // Edge case: pattern contains duplicate characters
    @Test
    public void testDuplicateCharsInPattern() {
        String s = "aabbcdbcd";
        String t = "abb";
        MinimumWindowSubstring ob = new MinimumWindowSubstring();
        String result = ob.minWindow(s, t);
        assertEquals("abb", result);
    }
    
    // Edge case: string contains duplicate characters
    @Test
    public void testDuplicateCharsInString() {
        String s = "abcadcadc";
        String t = "ca";
        MinimumWindowSubstring ob = new MinimumWindowSubstring();
        String result = ob.minWindow(s, t);
        assertEquals("ca", result);
    }
    
    // Edge case: pattern is longer than string
    @Test
    public void testPatternLongerThanString() {
        String s = "abc";
        String t = "abcd";
        MinimumWindowSubstring ob = new MinimumWindowSubstring();
        String result = ob.minWindow(s, t);
        assertEquals("", result);
    }
    
    // Potential issue: string and pattern are the same
    @Test
    public void testIdenticalStringAndPattern() {
        String s = "abcd";
        String t = "abcd";
        MinimumWindowSubstring ob = new MinimumWindowSubstring();
        String result = ob.minWindow(s, t);
        assertEquals("abcd", result);
    }
    
    // Potential issue: string is very long
    // This test case may take a long time to run, so it could be commented out if necessary
    @Test
    public void testVeryLongString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i % 10);
        }
        String s = sb.toString();
        String t = "128";
        MinimumWindowSubstring ob = new MinimumWindowSubstring();
        String result = ob.minWindow(s, t);
        assertEquals("128", result);
    }
    
    // Potential issue: string contains non-alphabetic characters
    @Test
    public void testNonAlphabeticString() {
        String s = "a12#$%^&bc";
        String t = "abc";
        MinimumWindowSubstring ob = new MinimumWindowSubstring();
        String result = ob.minWindow(s, t);
        assertEquals("abc", result);
    }
}