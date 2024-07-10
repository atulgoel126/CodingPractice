package leetcode.sliding_window.q30;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.sliding_window.q30.SubstringwithConcatenationofAllWords;

import java.util.ArrayList;
import java.util.Arrays;

public class SubstringwithConcatenationofAllWordsTests {
    
    @Test
    public void testEmptyString() {
        SubstringwithConcatenationofAllWords ob = new SubstringwithConcatenationofAllWords();
        
        // test with empty string and empty word list
        assertEquals(ob.findSubstring("", new String[] {}), new ArrayList<Integer>());
        
        // test with empty string and non-empty word list
        assertEquals(ob.findSubstring("", new String[] {"foo", "bar"}), new ArrayList<Integer>());
        
        // test with non-empty string and empty word list
        assertEquals(ob.findSubstring("foobar", new String[] {}), new ArrayList<Integer>());
    }
    
    @Test 
    public void testSingleWord() {
        SubstringwithConcatenationofAllWords ob = new SubstringwithConcatenationofAllWords();
        
        // test with single-word string and matching word in word list
        assertEquals(ob.findSubstring("foobar", new String[] {"foo"}), new ArrayList<Integer>(Arrays.asList(0)));
        
        // test with single-word string and non-matching word in word list
        assertEquals(ob.findSubstring("foobar", new String[] {"bar"}), new ArrayList<Integer>());
    }
    
    @Test
    public void testMultipleWords() {
        SubstringwithConcatenationofAllWords ob = new SubstringwithConcatenationofAllWords();
        
        // test with string containing multiple words and matching words in word list
        assertEquals(ob.findSubstring("barfoothefoobarman", new String[] {"foo", "bar"}), new ArrayList<Integer>(Arrays.asList(0, 9)));
        
        // test with string containing multiple words and non-matching words in word list
        assertEquals(ob.findSubstring("barfoothefoobarman", new String[] {"baz", "qux"}), new ArrayList<Integer>());
    }
    
    @Test
    public void testDuplicateWords() {
        SubstringwithConcatenationofAllWords ob = new SubstringwithConcatenationofAllWords();
        
        // test with duplicate words in word list
        assertEquals(ob.findSubstring("barfoobar", new String[] {"foo", "bar", "bar"}), new ArrayList<Integer>(Arrays.asList(3)));
    }
    
    @Test
    public void testEdgeCases() {
        SubstringwithConcatenationofAllWords ob = new SubstringwithConcatenationofAllWords();
        
        // test with string that does not contain any words in word list
        assertEquals(ob.findSubstring("foobar", new String[] {"baz", "qux"}), new ArrayList<Integer>());
        
        // test with large string length
        String largeString = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
        assertEquals(ob.findSubstring(largeString, new String[] {"abc", "xyz"}), new ArrayList<Integer>(Arrays.asList(0, 26, 52)));
    }
    
}