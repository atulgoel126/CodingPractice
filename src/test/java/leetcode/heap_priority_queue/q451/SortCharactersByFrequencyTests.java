//package leetcode.heap_priority_queue.q451;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.heap_priority_queue.q451.SortCharactersByFrequency;
//
//public class SortCharactersByFrequencyTests {
//
//    // Test sorting characters in a string with unique characters
//    @Test
//    public void testUniqueCharacters() {
//        String s = "abcde";
//        SortCharactersByFrequency ob = new SortCharactersByFrequency();
//        String result = ob.frequencySort(s);
//        assertEquals(result, "edcba");
//    }
//
//    // Test sorting characters in a string with repeated characters
//    @Test
//    public void testRepeatCharacters() {
//        String s = "aabbccc";
//        SortCharactersByFrequency ob = new SortCharactersByFrequency();
//        String result = ob.frequencySort(s);
//        assertEquals(result, "cccbbbaa");
//    }
//
//    // Test sorting characters in an empty string
//    @Test
//    public void testEmptyString() {
//        String s = "";
//        SortCharactersByFrequency ob = new SortCharactersByFrequency();
//        String result = ob.frequencySort(s);
//        assertEquals(result, "");
//    }
//
//    // Test sorting characters in a string with only one type of character
//    @Test
//    public void testOneChar() {
//        String s = "aaaaa";
//        SortCharactersByFrequency ob = new SortCharactersByFrequency();
//        String result = ob.frequencySort(s);
//        assertEquals(result, "aaaaa");
//    }
//
//    // Test sorting characters in a string with special characters
//    @Test
//    public void testSpecialCharacters() {
//        String s = "a!$87@%^";
//        SortCharactersByFrequency ob = new SortCharactersByFrequency();
//        String result = ob.frequencySort(s);
//        assertEquals(result, "!$87@%^a");
//    }
//
//    // Test sorting characters in a string with only spaces
//    @Test
//    public void testSpaces() {
//        String s = "     ";
//        SortCharactersByFrequency ob = new SortCharactersByFrequency();
//        String result = ob.frequencySort(s);
//        assertEquals(result, "     ");
//    }
//
//    // Test sorting characters in a string with a mix of upper and lower case characters
//    @Test
//    public void testMixedCase() {
//        String s = "aAbBcC";
//        SortCharactersByFrequency ob = new SortCharactersByFrequency();
//        String result = ob.frequencySort(s);
//        assertEquals(result, "CCBBaaA");
//    }
//
//    // Test sorting characters in a string with numbers
//    @Test
//    public void testNumbers() {
//        String s = "112233";
//        SortCharactersByFrequency ob = new SortCharactersByFrequency();
//        String result = ob.frequencySort(s);
//        assertEquals(result, "332211");
//    }
//
//    // Test sorting characters in a string with null input
//    @Test
//    public void testNullInput() {
//        String s = null;
//        SortCharactersByFrequency ob = new SortCharactersByFrequency();
//        String result = ob.frequencySort(s);
//        assertEquals(result, null);
//    }
//
//    // Test sorting characters in a string with a mix of characters and numbers
//    @Test
//    public void testMixedCharactersAndNumbers() {
//        String s = "aAb1Bc2Cd3Fg5";
//        SortCharactersByFrequency ob = new SortCharactersByFrequency();
//        String result = ob.frequencySort(s);
//        assertEquals(result, "ggff112233bBcCdA");
//    }
//
//    // Test sorting characters in a string with a very large number of characters
//    @Test
//    public void testLargeNumCharacters() {
//        String s = "aaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccdddddddddddddddddddddd";
//        SortCharactersByFrequency ob = new SortCharactersByFrequency();
//        String result = ob.frequencySort(s);
//        assertEquals(result, "aaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccdddddddddddddddddddddd");
//    }
//}