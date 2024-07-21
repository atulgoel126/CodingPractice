//package leetcode.array_string.q12;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.array_string.q12.IntegertoRoman;
//
//public class IntegertoRomanTests {
//    @Test
//    public void testIntegerToRoman() {
//        IntegertoRoman ob = new IntegertoRoman();
//
//        // Valid inputs and expected output
//        assertEquals(ob.integerToRoman(3), "III");
//        assertEquals(ob.integerToRoman(4), "IV");
//        assertEquals(ob.integerToRoman(9), "IX");
//        assertEquals(ob.integerToRoman(58), "LVIII");
//        assertEquals(ob.integerToRoman(1994), "MCMXCIV");
//
//        // Edge cases: 0 and 3999
//        assertEquals(ob.integerToRoman(0), "");
//        assertEquals(ob.integerToRoman(3999), "MMMCMXCIX");
//
//        // Invalid inputs: negative numbers and numbers greater than 3999
//        assertEquals(ob.integerToRoman(-1), "Invalid input");
//        assertEquals(ob.integerToRoman(4000), "Invalid input");
//    }
//
//    @Test
//    public void testRomanToInteger() {
//        IntegertoRoman ob = new IntegertoRoman();
//
//        // Valid inputs and expected output
//        assertEquals(ob.romanToInteger("III"), 3);
//        assertEquals(ob.romanToInteger("IV"), 4);
//        assertEquals(ob.romanToInteger("IX"), 9);
//        assertEquals(ob.romanToInteger("LVIII"), 58);
//        assertEquals(ob.romanToInteger("MCMXCIV"), 1994);
//
//        // Edge cases: Empty string
//        assertEquals(ob.romanToInteger(""), 0);
//
//        // Invalid inputs: strings with incorrect Roman numeral symbols
//        assertEquals(ob.romanToInteger("ABC"), -1);
//        assertEquals(ob.romanToInteger("IIM"), -1);
//        assertEquals(ob.romanToInteger("VL"), -1);
//    }
//}