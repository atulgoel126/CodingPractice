package leetcode.two_pointers.q3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTests {

    // Test case for an empty string
    @Test
    public void testEmptyString() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("");
        assertEquals(0, result);
    }

    // Test case for a string with all unique characters
    @Test
    public void testUniqueCharacters() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("abcdefg");
        assertEquals(7, result);
    }

    // Test case for a string with no repeating characters
    @Test
    public void testNoRepeats() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("abcdefgh");
        assertEquals(8, result);
    }

    // Test case for a string with all repeating characters
    @Test
    public void testAllRepeats() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("aaaaaa");
        assertEquals(1, result);
    }

    // Test case for a string with only one character
    @Test
    public void testSingleChar() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("a");
        assertEquals(1, result);
    }

    // Test case for a string with two different characters
    @Test
    public void testTwoChars() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("ab");
        assertEquals(2, result);
    }

    // Test case for a string with multiple repeating characters
    @Test
    public void testMultipleRepeats() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("aaabbbc");
        assertEquals(2, result);
    }

    // Test case for a string with special characters
    @Test
    public void testSpecialChars() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("!@#$%^&*()");
        assertEquals(10, result);
    }

    // Test case for a string with a mix of uppercase and lowercase characters
    @Test
    public void testUpperCase() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("AbCdEfGhIj");
        assertEquals(10, result);
    }

    // Test case for a string with a mix of letters and numbers
    @Test
    public void testLettersAndNumbers() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("a1b2c3d4");
        assertEquals(8, result);
    }

    // Test case for a string with repeating characters at the beginning
    @Test
    public void testRepeatsAtBeginning() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("aabcdefgh");
        assertEquals(8, result);
    }

    // Test case for a string with repeating characters at the end
    @Test
    public void testRepeatsAtEnd() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("abcdefghijkk");
        assertEquals(11, result);
    }

    // Test case for a string with repeating characters in the middle
    @Test
    public void testRepeatsInMiddle() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("abcdefghijkkllmn");
        assertEquals(11, result);
    }

    // Test case for a string with special characters and numbers
    @Test
    public void testSpecialCharsAndNumbers() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("!@#$a1b2c3d4");
        assertEquals(12, result);
    }

    // Test case for a string with repeating special characters
    @Test
    public void testRepeatingSpecialChars() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("!@#$%^&*!@");
        assertEquals(8, result);
    }

    // Test case for a string with only one repeating character
    @Test
    public void testSingleRepeat() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        assertEquals(26, result);
    }

    // Test case for a long string
    @Test
    public void testLongString() {
        LongestSubstringWithoutRepeatingCharacters ob = new LongestSubstringWithoutRepeatingCharacters();
        int result = ob.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        assertEquals(26, result);
    }
}