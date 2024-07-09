package leetcode.array_string.q13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import leetcode.array_string.q13.RomantoInteger;

public class RomantoIntegerTests {

    private RomantoInteger ob;
    
    @BeforeEach
    public void init() {
        ob = new RomantoInteger();
    }
    
    @Test
    public void testValidRomanNumerals() {
        // Test single characters
        assertEquals(1, ob.romanToInt("I"));
        assertEquals(5, ob.romanToInt("V"));
        assertEquals(10, ob.romanToInt("X"));
        assertEquals(50, ob.romanToInt("L"));
        assertEquals(100, ob.romanToInt("C"));
        assertEquals(500, ob.romanToInt("D"));
        assertEquals(1000, ob.romanToInt("M"));
        
        // Test multiple characters - additive combinations
        assertEquals(2, ob.romanToInt("II"));
        assertEquals(6, ob.romanToInt("VI"));
        assertEquals(12, ob.romanToInt("XII"));
        assertEquals(60, ob.romanToInt("LX"));
        assertEquals(156, ob.romanToInt("CLVI"));
        
        // Test multiple characters - subtractive combinations
        assertEquals(4, ob.romanToInt("IV"));
        assertEquals(9, ob.romanToInt("IX"));
        assertEquals(40, ob.romanToInt("XL"));
        assertEquals(90, ob.romanToInt("XC"));
        assertEquals(400, ob.romanToInt("CD"));
        assertEquals(900, ob.romanToInt("CM"));
        
        // Test combination of both additive and subtractive
        assertEquals(44, ob.romanToInt("XLIV"));
        assertEquals(2999, ob.romanToInt("MMCMXCIX"));
    }
    
    @Test
    public void testInvalidRomanNumerals() {
        // Test invalid characters
        assertEquals(0, ob.romanToInt("A"));
        assertEquals(0, ob.romanToInt("%"));
        assertEquals(0, ob.romanToInt("Q"));
        
        // Test invalid combinations
        assertEquals(0, ob.romanToInt("VM"));
        assertEquals(0, ob.romanToInt("CLLL"));
    }
    
    @Test
    public void testEmptyInput() {
        assertEquals(0, ob.romanToInt(""));
    }
    
    @Test
    public void testEdgeCases() {
        // Test lower and upper case inputs
        assertEquals(1442, ob.romanToInt("MCDXLII"));
        assertEquals(1442, ob.romanToInt("mcdxlii"));
        
        // Test input with leading and trailing spaces
        assertEquals(2999, ob.romanToInt(" MMCMXCIX "));
        
        // Test input with leading subtractive combinations
        assertEquals(49, ob.romanToInt("XLIX"));
        
        // Test input with trailing subtractive combinations
        assertEquals(4950, ob.romanToInt("MMMCDL"));
    }
    
    @Test
    public void testPotentialIssues() {
        // Test input with multiple sequential subtractive combinations
        assertEquals(49, ob.romanToInt("XXIX"));
        assertEquals(999, ob.romanToInt("CMXCIX"));
        
        // Test input with subtractive combination before a larger additive combination
        assertEquals(8, ob.romanToInt("IIX"));
        assertEquals(8, ob.romanToInt("VIII"));
    }

}