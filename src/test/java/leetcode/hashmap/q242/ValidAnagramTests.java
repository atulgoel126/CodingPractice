//package leetcode.hashmap.q242;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class ValidAnagramTests {
//    @Test
//    public void testValidAnagram() {
//        ValidAnagram ob = new ValidAnagram();
//
//        // Test basic anagrams
//        assertTrue(ob.isAnagram("anagram", "nagaram"));
//
//        // Test edge cases with empty strings
//        assertTrue(ob.isAnagram("", ""));
//
//        // Test edge cases with one empty string
//        assertFalse(ob.isAnagram("a", ""));
//        assertFalse(ob.isAnagram("", "ab"));
//
//        // Test edge cases with different lengths
//        assertFalse(ob.isAnagram("aaa", "aaaa"));
//        assertFalse(ob.isAnagram("abc", "ab"));
//
//        // Test anagrams with special characters and spaces
//        assertTrue(ob.isAnagram("rat!", "!tar"));
//        assertTrue(ob.isAnagram("listen", "silent "));
//
//        // Test anagrams with different cases
//        assertTrue(ob.isAnagram("Tea", "Eat"));
//        assertTrue(ob.isAnagram("Hello", "hello"));
//
//        // Test for non-anagrams
//        assertFalse(ob.isAnagram("apple", "banana"));
//        assertFalse(ob.isAnagram("car", "cat"));
//    }
//}