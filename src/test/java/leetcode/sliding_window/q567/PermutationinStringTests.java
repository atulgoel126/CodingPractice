//package leetcode.sliding_window.q567;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.sliding_window.q567.PermutationinString;
//
//public class PermutationinStringTests {
//    @Test
//    public void testEmptyStrings() {
//        PermutationinString ob = new PermutationinString();
//        assertTrue(ob.checkInclusion("", "")); // Both strings empty
//        assertFalse(ob.checkInclusion("", "abc")); // First string empty
//        assertFalse(ob.checkInclusion("def", "")); // Second string empty
//    }
//
//    @Test
//    public void testSameString() {
//        PermutationinString ob = new PermutationinString();
//        assertTrue(ob.checkInclusion("abc", "abc")); // Same string, permutation exists
//        assertFalse(ob.checkInclusion("abc", "def")); // Same string, no permutation exists
//    }
//
//    @Test
//    public void testPermutationExists() {
//        PermutationinString ob = new PermutationinString();
//        assertTrue(ob.checkInclusion("abc", "cab")); // Same characters, different order
//        assertTrue(ob.checkInclusion("abc", "bac")); // Same characters, different order
//        assertTrue(ob.checkInclusion("ab", "abb")); // Second string has an extra duplicate character
//    }
//
//    @Test
//    public void testPermutationDoesNotExist() {
//        PermutationinString ob = new PermutationinString();
//        assertFalse(ob.checkInclusion("abc", "def")); // Completely different strings
//        assertFalse(ob.checkInclusion("ab", "ac")); // Second string missing one character
//        assertFalse(ob.checkInclusion("abcd", "efgh")); // No common characters
//    }
//
//    @Test
//    public void testSubstringIsPermutation() {
//        PermutationinString ob = new PermutationinString();
//        assertTrue(ob.checkInclusion("ab", "bacde")); // First two characters are a permutation of "ab"
//        assertTrue(ob.checkInclusion("abc", "cbade")); // First three characters are a permutation of "abc"
//        assertTrue(ob.checkInclusion("abcd", "cdbaef")); // First four characters are a permutation of "abcd"
//    }
//
//    @Test
//    public void testSubstringIsNotPermutation() {
//        PermutationinString ob = new PermutationinString();
//        assertFalse(ob.checkInclusion("ab", "efghij")); // No common characters
//        assertFalse(ob.checkInclusion("abc", "bde")); // Second string missing one character needed to create "abc"
//        assertFalse(ob.checkInclusion("abcd", "cdefgh")); // Second string missing multiple characters needed to create "abcd"
//    }
//
//    @Test
//    public void testLongStrings() {
//        // Test with very long strings to check for time complexity issues
//        PermutationinString ob = new PermutationinString();
//
//        // Create two long strings, one that contains a permutation of the other and another that does not
//        StringBuilder longString1 = new StringBuilder();
//        StringBuilder longString2 = new StringBuilder();
//
//        for (int i = 0; i < 100000; i++) {
//            longString1.append("a");
//            longString2.append("a");
//        }
//
//        longString1.append("b"); // Add one "b" to the end to make it a permutation of longString2
//
//        assertTrue(ob.checkInclusion(longString1.toString(), longString2.toString()));
//
//        longString2.append("c"); // Add "c" to the end to make it not a permutation of longString2
//        assertFalse(ob.checkInclusion(longString1.toString(), longString2.toString()));
//    }
//}
//
//
//// Note: More tests can also be added to check for potential issues such as input with special characters, null inputs, and strings of different lengths. Furthermore, tests can also be added to check for the time and space complexity of the solution.