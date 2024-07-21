//package leetcode.two_pointers.q125;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.two_pointers.q125.ValidPalindrome;
//
//public class ValidPalindromeTests {
//
//    @Test
//    public void testEmptyString() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome(""));
//    }
//
//    @Test
//    public void testSingleCharacter() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("a"));
//    }
//
//    @Test
//    public void testAllLowerCase() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("racecar"));
//    }
//
//    @Test
//    public void testAllUpperCase() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("MADAM"));
//    }
//
//    @Test
//    public void testMixedCase() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("abBa"));
//    }
//
//    @Test
//    public void testOddPalindrome() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("abcba"));
//    }
//
//    @Test
//    public void testEvenPalindrome() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("abba"));
//    }
//
//    @Test
//    public void testNonPalindrome() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertFalse(ob.isPalindrome("civicd"));
//    }
//
//    @Test
//    public void testPalindromeWithSpaces() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("a man a plan a canal panama"));
//    }
//
//    @Test
//    public void testPalindromeWithPunctuation() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("A. Santa! Lived As a Devil At NASA?"));
//    }
//
//    @Test
//    public void testPalindromeWithNumbers() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("1 2 3 2 1"));
//    }
//
//    @Test
//    public void testPalindromeWithSpecialCharacters() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("Madam, I'm Adam!"));
//    }
//
//    @Test
//    public void testStringWithOnlyNumbers() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("12345654321"));
//    }
//
//    @Test
//    public void testStringWithOnlySpecialCharacters() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("!@#$%^&*()"));
//    }
//
//    @Test
//    public void testStringWithBothNumbersAndSpecialCharacters() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("123aAbBba321"));
//    }
//
//    @Test
//    public void testStringWithUnicodeCharacters() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("कायक"));
//    }
//
//    @Test
//    public void testStringWithNonLatinCharacters() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("東京特許"));
//    }
//
//    @Test
//    public void testStringWithEmoji() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("\uD83D\uDE00\uD83D\uDC3A\uD83D\uDE42\uD83D\uDE0B\uD83D\uDE02"));
//    }
//
//    // Edge cases
//
//    @Test
//    public void testStringWithDigitAtMiddle() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertFalse(ob.isPalindrome("abcd1dcba"));
//    }
//
//    @Test
//    public void testStringWithEmptySpaces() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("  "));
//    }
//
//    @Test
//    public void testStringWithOddSpaces() {
//        ValidPalindrome ob = new ValidPalindrome();
//        assertTrue(ob.isPalindrome("a b c b a"));
//    }
//
//    @Test
//    void testStringWithOddNumberOfCharacters() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertFalse(ob.isPalindrome("hello"));
//    }
//
//    @Test
//    void testStringWithSpecialCharacters() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertFalse(ob.isPalindrome("Hello@"));
//    }
//
//    @Test
//    void testStringWithDifferentCase() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertTrue(ob.isPalindrome("Madam"));
//    }
//
//    @Test
//    void testStringWithPunctuation() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertTrue(ob.isPalindrome("A man, a plan, a canal, Panama!"));
//    }
//
//    @Test
//    void testStringWithNumbers() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertFalse(ob.isPalindrome("123"));
//    }
//
//    @Test
//    void testStringWithLeadingAndTrailingPunctuation() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertTrue(ob.isPalindrome("!Madam!"));
//    }
//
//    @Test
//    void testStringWithLeadingAndTrailingWhitespace() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertTrue(ob.isPalindrome(" Madam "));
//    }
//
//    @Test
//    void testNullString() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertFalse(ob.isPalindrome(null));
//    }
//
//    // Potential issues
//
//    @Test
//    void testStringWithBackslash() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertTrue(ob.isPalindrome("never odd or even"));
//    }
//
//    @Test
//    void testStringWithAmpersand() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertTrue(ob.isPalindrome("A man, a plan, a canal, & Panama"));
//    }
//
//    @Test
//    void testStringWithUnicodeEscapeSequence() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertTrue(ob.isPalindrome("\u0041\u0243\u1011"));
//    }
//
//    @Test
//    void testStringWithBackspace() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertTrue(ob.isPalindrome("A man,\u0008\u0008\u0008 a plan, a canal, Panama"));
//    }
//
//    @Test
//    void testStringWithNullCharacter() {
//    	ValidPalindrome ob = new ValidPalindrome();
//    	assertFalse(ob.isPalindrome("A man, a plan, a canal, Pan`\u0000ama"));
//    }
//
//
//}