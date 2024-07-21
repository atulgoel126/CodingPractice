//package leetcode.dynamic_programming.q91;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.dynamic_programming.q91.DecodeWays;
//
//public class DecodeWaysTests {
//
//    // Test empty input
//    @Test
//    public void testEmptyInput() {
//        DecodeWays ob = new DecodeWays();
//        assertEquals(0, ob.numDecodings(""));
//    }
//
//    // Test invalid input
//    @Test
//    public void testInvalidInput() {
//        DecodeWays ob = new DecodeWays();
//        assertEquals(0, ob.numDecodings("01"));
//        assertEquals(0, ob.numDecodings("10"));
//        assertEquals(0, ob.numDecodings("00"));
//    }
//
//    // Test single digit input
//    @Test
//    public void testSingleDigit() {
//        DecodeWays ob = new DecodeWays();
//        assertEquals(1, ob.numDecodings("1"));
//        assertEquals(1, ob.numDecodings("2"));
//        assertEquals(0, ob.numDecodings("0"));
//    }
//
//    // Test two-digit input
//    @Test
//    public void testTwoDigit() {
//        DecodeWays ob = new DecodeWays();
//        assertEquals(2, ob.numDecodings("12"));
//        assertEquals(1, ob.numDecodings("26"));
//        assertEquals(0, ob.numDecodings("27"));
//    }
//
//    // Test input with zeros in between
//    @Test
//    public void testZerosInBetween() {
//        DecodeWays ob = new DecodeWays();
//        assertEquals(3, ob.numDecodings("120"));
//        assertEquals(2, ob.numDecodings("206"));
//        assertEquals(0, ob.numDecodings("207"));
//    }
//
//    // Test input that cannot be decoded
//    @Test
//    public void testCannotBeDecoded() {
//        DecodeWays ob = new DecodeWays();
//        assertEquals(0, ob.numDecodings("1100"));
//        assertEquals(0, ob.numDecodings("100"));
//        assertEquals(0, ob.numDecodings("0"));
//    }
//
//    // Test input with large numbers
//    @Test
//    public void testLargeNumbers() {
//        DecodeWays ob = new DecodeWays();
//        assertEquals(2, ob.numDecodings("120342"));
//        assertEquals(1, ob.numDecodings("206987"));
//        assertEquals(8, ob.numDecodings("121813928"));
//    }
//
//    // Test input with only 1 zero as leading digit
//    @Test
//    public void test1LeadingZero() {
//        DecodeWays ob = new DecodeWays();
//        assertEquals(1, ob.numDecodings("102"));
//        assertEquals(0, ob.numDecodings("200"));
//        assertEquals(2, ob.numDecodings("276"));
//    }
//
//    // Test input with single-digit numbers
//    @Test
//    public void testSingleDigitNumbers() {
//        DecodeWays ob = new DecodeWays();
//        assertEquals(5, ob.numDecodings("12345"));
//        assertEquals(3, ob.numDecodings("10112"));
//        assertEquals(5, ob.numDecodings("12123"));
//    }
//
//    // Test input with larger number and alphabets
//    @Test
//    public void testCombinationsOfNumbersAndAlphabets() {
//        DecodeWays ob = new DecodeWays();
//        assertEquals(3, ob.numDecodings("123a45"));
//        assertEquals(5, ob.numDecodings("10bb20"));
//        assertEquals(1, ob.numDecodings("1c231f25"));
//    }
//}