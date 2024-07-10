//package leetcode.hashmap.q290;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class WordPatternTests {
//
//	@Test
//	public void testPatternMatch() {
//		/*
//		 * Test cases where pattern and string match
//		 */
//		WordPattern wp = new WordPattern();
//		String pattern = "abba";
//		String str = "dog cat cat dog";
//		boolean expected = true;
//		boolean actual = wp.wordPattern(pattern, str);
//		assertTrue("Expected true but got false", expected == actual);
//
//		// Test with empty string
//		str = "";
//		expected = true;
//		actual = wp.wordPattern(pattern, str);
//		assertTrue("Expected true but got false", expected == actual);
//
//		// Test with single character pattern and string
//		pattern = "a";
//		str = "hello";
//		expected = true;
//		actual = wp.wordPattern(pattern, str);
//		assertTrue("Expected true but got false", expected == actual);
//
//		// Test with special characters
//		pattern = "*+?%$#";
//		str = "&$^(%^)(*%+@#";
//		expected = true;
//		actual = wp.wordPattern(pattern, str);
//		assertTrue("Expected true but got false", expected == actual);
//	}
//
//	@Test
//	public void testPatternNoMatch() {
//		/*
//		 * Test cases where pattern and string do not match
//		 */
//		WordPattern wp = new WordPattern();
//		String pattern = "abba";
//		String str = "dog cat cat fish";
//		boolean expected = false;
//		boolean actual = wp.wordPattern(pattern, str);
//		assertTrue("Expected false but got true", expected == actual);
//
//		// Test with different pattern and string lengths
//		pattern = "abab";
//		str = "dog cat dog";
//		expected = false;
//		actual = wp.wordPattern(pattern, str);
//		assertTrue("Expected false but got true", expected == actual);
//
//		// Test with pattern and string containing duplicate words
//		pattern = "aba";
//		str = "dog dog dog";
//		expected = false;
//		actual = wp.wordPattern(pattern, str);
//		assertTrue("Expected false but got true", expected == actual);
//
//		// Test with pattern and string containing different number of words
//		pattern = "abc";
//		str = "dog cat fish bird";
//		expected = false;
//		actual = wp.wordPattern(pattern, str);
//		assertTrue("Expected false but got true", expected == actual);
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void testNullPattern() {
//		/*
//		 * Test case for NullPointerException with null pattern
//		 */
//		WordPattern wp = new WordPattern();
//		String pattern = null;
//		String str = "dog cat cat dog";
//		boolean expected = false;
//		boolean actual = wp.wordPattern(pattern, str);
//		assertFalse("Expected NullPointerException but no exception was thrown", expected == actual);
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void testNullString() {
//		/*
//		 * Test case for NullPointerException with null string
//		 */
//		WordPattern wp = new WordPattern();
//		String pattern = "abba";
//		String str = null;
//		boolean expected = false;
//		boolean actual = wp.wordPattern(pattern, str);
//		assertFalse("Expected NullPointerException but no exception was thrown", expected == actual);
//	}
//
//}