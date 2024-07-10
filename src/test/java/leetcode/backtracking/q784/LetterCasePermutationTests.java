package leetcode.backtracking.q784;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.backtracking.q784.LetterCasePermutation;

import java.util.List;

public class LetterCasePermutationTests {
    @Test
    public void testValidInput() {
        LetterCasePermutation ob = new LetterCasePermutation();
        // Test a single letter
        assertEquals(List.of("a", "A"), ob.letterCasePermutation("a"));
        // Test a string with both lowercase and uppercase letters
        assertEquals(List.of("a1b2", "A1b2", "a1B2", "A1B2"), ob.letterCasePermutation("a1b2"));
        // Test a string with only uppercase letters
        assertEquals(List.of("123"), ob.letterCasePermutation("123"));
        // Test a string with only lowercase letters
        assertEquals(List.of("abc"), ob.letterCasePermutation("abc"));
        // Test a string with special characters
        assertEquals(List.of("a!b#c"), ob.letterCasePermutation("a!b#c"));
        // Test a string with spaces
        assertEquals(List.of("a b c"), ob.letterCasePermutation("a b c"));
        // Test a string with only one letter
        assertEquals(List.of("a", "A"), ob.letterCasePermutation("A"));
    }

    @Test
    public void testEmptyString() {
        LetterCasePermutation ob = new LetterCasePermutation();
        // Test an empty string
        assertEquals(List.of(""), ob.letterCasePermutation(""));
    }

    @Test
    public void testNullInput() {
        LetterCasePermutation ob = new LetterCasePermutation();
        // Test null input
        assertNull(ob.letterCasePermutation(null));
    }
}