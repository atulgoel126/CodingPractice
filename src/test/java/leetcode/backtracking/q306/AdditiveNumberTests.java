//package leetcode.backtracking.q306;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.backtracking.q306.AdditiveNumber;
//
//public class AdditiveNumberTests {
//
//    @Test
//    public void testAdditiveNumberValid() {
//        AdditiveNumber ob = new AdditiveNumber();
//        assertTrue(ob.isAdditiveNumber("12358"));
//        assertTrue(ob.isAdditiveNumber("78913"));
//    }
//
//    @Test
//    public void testAdditiveNumberInvalid() {
//        AdditiveNumber ob = new AdditiveNumber();
//        assertFalse(ob.isAdditiveNumber("12359")); // does not follow additive sequence
//        assertFalse(ob.isAdditiveNumber("00123")); // leading zeros not allowed
//    }
//
//    @Test
//    public void testAdditiveNumberSingleDigit() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // single digit numbers should not be considered additive numbers
//        assertFalse(ob.isAdditiveNumber("123"));
//        assertFalse(ob.isAdditiveNumber("7"));
//    }
//
//    @Test
//    public void testAdditiveNumberEmptyString() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // empty string should not be considered additive number
//        assertFalse(ob.isAdditiveNumber(""));
//    }
//
//    @Test
//    public void testAdditiveNumberNegatives() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // negative numbers should not be considered additive numbers
//        assertFalse(ob.isAdditiveNumber("-123456789"));
//        assertFalse(ob.isAdditiveNumber("-12"));
//    }
//
//    @Test
//    public void testAdditiveNumberFloats() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // floats should not be considered additive numbers
//        assertFalse(ob.isAdditiveNumber("123.456789"));
//        assertFalse(ob.isAdditiveNumber("12.34"));
//    }
//
//    @Test
//    public void testAdditiveNumberLargeNumbers() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // numbers that exceed the range of long should not be considered additive numbers
//        assertFalse(ob.isAdditiveNumber("123456789012345678901234567890"));
//        assertFalse(ob.isAdditiveNumber("98765432109876543210"));
//    }
//
//    @Test
//    public void testAdditiveNumberLeadingZeros() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // leading zeros in a number should not be considered as separate digits
//        assertFalse(ob.isAdditiveNumber("01234")); // should be considered as "1234"
//        assertFalse(ob.isAdditiveNumber("00123")); // should be considered as "123"
//    }
//
//    @Test
//    public void testAdditiveNumberRepeatedNumbers() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // numbers that are repeated should not be considered additive numbers
//        assertFalse(ob.isAdditiveNumber("1112")); // should not be considered as "1+1=2"
//        assertFalse(ob.isAdditiveNumber("2222")); // should not be considered as "2+2=4" or "22+22=44"
//    }
//
//    @Test
//    public void testAdditiveNumberLargeSequence() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // sequence length greater than 3 should be considered as additive numbers
//        assertTrue(ob.isAdditiveNumber("123456789"));
//        assertTrue(ob.isAdditiveNumber("11235813"));
//    }
//
//    @Test
//    public void testAdditiveNumberEdgeCase() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // edge cases where the sum of first two numbers exceed the length of the string
//        assertFalse(ob.isAdditiveNumber("220303"));
//        assertFalse(ob.isAdditiveNumber("11101"));
//    }
//
//    @Test
//    public void testAdditiveNumberOverflow() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // edge case where the addition of two numbers causes an overflow
//        assertFalse(ob.isAdditiveNumber("2147483647")); // largest possible integer value, any further adding will cause overflow
//        assertFalse(ob.isAdditiveNumber("2147483647000")); // 1000 added to above number causes overflow
//    }
//
//    @Test
//    public void testAdditiveNumberNullInput() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // null input should return false
//        assertFalse(ob.isAdditiveNumber(null));
//    }
//
//    @Test
//    public void testAdditiveNumberSingleNumInput() {
//        AdditiveNumber ob = new AdditiveNumber();
//        // single number input should return false
//        assertFalse(ob.isAdditiveNumber("123"));
//    }
//}