package leetcode.hashmap.q205;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.hashmap.q205.IsomorphicStrings;

public class IsomorphicStringsTests {

    IsomorphicStrings ob = new IsomorphicStrings();

    @Test 
    public void testIsIsomorphic() {

        // basic test case
        assertTrue(ob.isIsomorphic("egg", "add"));

        // case with different length strings
        assertFalse(ob.isIsomorphic("foo", "bar"));

        // case with same characters but different order
        assertTrue(ob.isIsomorphic("aab", "aab"));
        
        // case with special characters
        assertTrue(ob.isIsomorphic("#$^&@", "@$&^#"));

        // case with empty strings
        assertTrue(ob.isIsomorphic("", ""));

        // case with strings of different lengths
        assertFalse(ob.isIsomorphic("abcd", "efg"));

        // case with repeating characters
        assertFalse(ob.isIsomorphic("abb", "aaa"));
    }

    @Test
    public void testIsIsomorphicEdgeCases() {
        
        // case with null strings
        assertThrows(IllegalArgumentException.class, () -> {
            ob.isIsomorphic(null, null);
        });

        // case with null first string
        assertThrows(IllegalArgumentException.class, () -> {
            ob.isIsomorphic(null, "foo");
        });

        // case with null second string
        assertThrows(IllegalArgumentException.class, () -> {
            ob.isIsomorphic("bar", null);
        });

        // case with one empty string
        assertFalse(ob.isIsomorphic("", "foo"));

        // case with non-alphabetic characters
        assertFalse(ob.isIsomorphic("123", "456"));

        // case with strings with same length but not isomorphic
        assertFalse(ob.isIsomorphic("abc", "bcd"));
    }
}