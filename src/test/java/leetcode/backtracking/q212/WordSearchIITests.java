package leetcode.backtracking.q212;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.backtracking.q212.WordSearchII;

import java.util.List;

public class WordSearchIITests {
    
    @Test
    public void testEmptyBoard() {
    	// Setup
    	char[][] board = {};
    	String[] words = {"apple", "banana", "cherry"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(0, result.size());
    }
    
    @Test
    public void testEmptyWords() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
    	String[] words = {};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(0, result.size());
    }
    
    @Test
    public void testNoWordsFound() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
    	String[] words = {"apple", "banana", "cherry"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(0, result.size());
    }
    
    @Test
    public void testWordsFound1() {
    	// Setup
    	char[][] board = {{'a', 'a', 'a'}, {'a', 'a', 'a'}, {'a', 'a', 'a'}};
    	String[] words = {"aaa"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(1, result.size());
    	assertEquals("aaa", result.get(0));
    }
    
    @Test
    public void testWordsFound2() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
    	String[] words = {"abc", "def", "ghi"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(3, result.size());
    	assertTrue(result.contains("abc"));
    	assertTrue(result.contains("def"));
    	assertTrue(result.contains("ghi"));
    }
    
    @Test
    public void testDuplicateWords() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
    	String[] words = {"abc", "def", "ghi", "abc"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(3, result.size());
    	assertTrue(result.contains("abc"));
    	assertTrue(result.contains("def"));
    	assertTrue(result.contains("ghi"));
    }
    
    @Test
    public void testExtraLettersInBoard() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c', 'd'}, {'e', 'f', 'g', 'h'}, {'i', 'j', 'k', 'l'}};
    	String[] words = {"abc", "def", "ghij"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(2, result.size());
    	assertTrue(result.contains("abc"));
    	assertTrue(result.contains("def"));
    }
    
    @Test
    public void testCaseInsensitive() {
    	// Setup
    	char[][] board = {{'a', 'b'}, {'c', 'd'}, {'E', 'f'}};
    	String[] words = {"ab", "FC"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(2, result.size());
    	assertTrue(result.contains("ab"));
    	assertTrue(result.contains("fc"));
    }
    
    @Test
    public void testOverlappingWords() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
    	String[] words = {"abce", "abcf"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(2, result.size());
    	assertTrue(result.contains("abce"));
    	assertTrue(result.contains("abcf"));
    }
    
    @Test
    public void testBoardContainsWords() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'a', 'b', 'c'}, {'a', 'b', 'c'}};
    	String[] words = {"abc", "ab"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(2, result.size());
    	assertTrue(result.contains("abc"));
    	assertTrue(result.contains("ab"));
    }
    
    @Test
    public void testBoardContainsPartialWords() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
    	String[] words = {"abcde", "def", "hij"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(2, result.size());
    	assertTrue(result.contains("def"));
    	assertTrue(result.contains("hij"));
    }
    
    @Test
    public void testBoardContainsSameLetter() {
    	// Setup
    	char[][] board = {{'a', 'a', 'a'}, {'a', 'a', 'a'}, {'a', 'a', 'a'}};
    	String[] words = {"aaa", "a"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(2, result.size());
    	assertTrue(result.contains("aaa"));
    	assertTrue(result.contains("a"));
    }
    
    @Test
    public void testBoardContainsSingleLetter() {
    	// Setup
    	char[][] board = {{'a', 'a', 'a'}, {'a', 'a', 'a'}, {'a', 'a', 'a'}};
    	String[] words = {"a"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(1, result.size());
    	assertEquals("a", result.get(0));
    }
    
    @Test
    public void testMultipleSolutions() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'c', 'a', 'b'}, {'c', 'a', 'c'}};
    	String[] words = {"abc", "acbc", "cabc"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(3, result.size());
    	assertTrue(result.contains("abc"));
    	assertTrue(result.contains("acbc"));
    	assertTrue(result.contains("cabc"));
    }
    
    @Test
    public void testLongWords() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c', 'd'}, {'a', 'b', 'c', 'd'}, {'a', 'b', 'c', 'd'}, {'a', 'b', 'c', 'd'}};
    	String[] words = {"abce", "abcde", "abcdef", "abcdefg"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(4, result.size());
    	assertTrue(result.contains("abce"));
    	assertTrue(result.contains("abcde"));
    	assertTrue(result.contains("abcdef"));
    	assertTrue(result.contains("abcdefg"));
    }
    
    @Test
    public void testWordsWithSamePrefix() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'a', 'd', 'e'}, {'a', 'f', 'g'}};
    	String[] words = {"abc", "abd", "abed", "abcf"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(3, result.size());
    	assertTrue(result.contains("abc"));
    	assertTrue(result.contains("abd"));
    	assertTrue(result.contains("abcf"));
    }
    
    @Test
    public void testDuplicateLettersInWords() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
    	String[] words = {"abcc", "deff", "ghi"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(3, result.size());
    	assertTrue(result.contains("abcc"));
    	assertTrue(result.contains("deff"));
    	assertTrue(result.contains("ghi"));
    }
    
    @Test
    public void testWordsWithSpaces() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
    	String[] words = {"abc ","def ", "ghi"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(3, result.size());
    	assertTrue(result.contains("abc"));
    	assertTrue(result.contains("def"));
    	assertTrue(result.contains("ghi"));
    }
    
    @Test
    public void testNullBoardAndWords() {
    	// Setup
    	char[][] board = null;
    	String[] words = null;
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertNull(result);
    }
    
    @Test
    public void testInvalidCharacters() {
    	// Setup
    	char[][] board = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
    	String[] words = {"abc", "def", "ghi", "£$%"};
    	WordSearchII ob = new WordSearchII();
    	
    	// Execute
    	List<String> result = ob.findWords(board, words);
    	
    	// Verify
    	assertEquals(3, result.size());
    	assertTrue(result.contains("abc"));
    	assertTrue(result.contains("def"));
    	assertTrue(result.contains("ghi"));
    }

}