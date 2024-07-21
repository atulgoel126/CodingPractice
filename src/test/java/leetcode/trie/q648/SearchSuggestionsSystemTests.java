//package leetcode.trie.q648;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.trie.q648.SearchSuggestionsSystem;
//
//public class SearchSuggestionsSystemTests {
//    // Test empty input strings
//    @Test
//    public void testEmptyInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(0, ob.getSuggestions("").size());
//    }
//
//    // Test single letter input string
//    @Test
//    public void testSingleLetterInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(0, ob.getSuggestions("a").size());
//    }
//
//    // Test input string with only spaces
//    @Test
//    public void testSpaceInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(0, ob.getSuggestions("     ").size());
//    }
//
//    // Test input string with only special characters
//    @Test
//    public void testSpecialCharacterInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(0, ob.getSuggestions("#$%").size());
//    }
//
//    // Test input string with all uppercase letters
//    @Test
//    public void testAllUppercaseInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(3, ob.getSuggestions("APPLE").size());
//    }
//
//    // Test input string with all lowercase letters
//    @Test
//    public void testAllLowercaseInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(3, ob.getSuggestions("apple").size());
//    }
//
//    // Test input string with mixed case letters
//    @Test
//    public void testMixedcaseInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(3, ob.getSuggestions("aPpLe").size());
//    }
//
//    // Test input string with non-existing prefix
//    @Test
//    public void testNonExistingPrefixInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(0, ob.getSuggestions("xyz").size());
//    }
//
//    // Test input string with duplicate prefixes
//    @Test
//    public void testDuplicatePrefixInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(3, ob.getSuggestions("ball").size());
//    }
//
//    // Test input string with special characters and letters
//    @Test
//    public void testSpecialCharacterAndLetterInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(3, ob.getSuggestions("#bAlL").size());
//    }
//
//    // Test input string with numbers
//    @Test
//    public void testNumberInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(0, ob.getSuggestions("123").size());
//    }
//
//    // Test input string with a mix of numbers and letters
//    @Test
//    public void testNumberAndLetterInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertEquals(0, ob.getSuggestions("1Ba2Ll3").size());
//    }
//
//    // Test input string with null value
//    @Test
//    public void testNullInput() {
//        SearchSuggestionsSystem ob = new SearchSuggestionsSystem();
//        assertThrows(NullPointerException.class, () -> {
//            ob.getSuggestions(null);
//        });
//    }
//}