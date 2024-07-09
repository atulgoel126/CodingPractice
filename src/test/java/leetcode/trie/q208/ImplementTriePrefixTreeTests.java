package leetcode.trie.q208;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.trie.q208.ImplementTriePrefixTree;

public class ImplementTriePrefixTreeTests {
    
    // Initialize a trie for testing
    ImplementTriePrefixTree trie = new ImplementTriePrefixTree();
    
    @Test
    public void testInsert() {
        // Insert a word and check if it exists
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        
        // Insert another word with common prefix and check if both words exist
        trie.insert("applesauce");
        assertTrue(trie.search("applesauce"));
        assertTrue(trie.search("apple"));
        
        // Insert empty string and check if it exists
        trie.insert("");
        assertTrue(trie.search("")); 
        
        // Insert another instance of existing word and check if it exists
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        
        // Insert word that is a prefix of a previously inserted word and check if it exists
        trie.insert("app");
        assertTrue(trie.search("app"));       
    }
    
    @Test
    public void testSearch() {
        // Insert a word and search for it
        trie.insert("apple");
        assertTrue(trie.search("apple"));
        
        // Insert a word and search for a non-existent word
        assertFalse(trie.search("app"));
        
        // Insert a word with special characters and search for it
        String word = "app!";
        trie.insert(word);
        assertTrue(trie.search(word));
    }
    
    @Test
    public void testStartsWith() {
        // Insert a word and check if any word starts with that prefix
        trie.insert("apple");
        assertTrue(trie.startsWith("app"));
        
        // Insert a word and check if any word starts with a non-existent prefix
        assertFalse(trie.startsWith("ban"));
        
        // Insert a word and check if any word starts with an empty string
        assertTrue(trie.startsWith(""));
        
        // Insert a word with special characters and check if any word starts with that prefix
        String word = "app!";
        trie.insert(word);
        assertTrue(trie.startsWith("app!"));
    }
    
    @Test
    public void testEdgeCases() {
        // Insert a long word and check if it exists
        String word = "supercalifragilisticexpialidocious";
        trie.insert(word);
        assertTrue(trie.search(word));
        
        // Insert a word with spaces and check if it exists
        word = "hello world";
        trie.insert(word);
        assertTrue(trie.search(word));
        
        // Insert word with numbers and check if it exists
        word = "leet123";
        trie.insert(word);
        assertTrue(trie.search(word));
        
        // Search for an empty string in an empty trie
        assertFalse(trie.search(""));
        
        // Search for a non-existent word in an empty trie
        assertFalse(trie.search("apple"));
        
        // Search for a non-existent prefix in an empty trie
        assertFalse(trie.startsWith("app"));
    }
    
    @Test
    public void testIssues() {
        // Attempt to insert null and check if it throws an error
        assertThrows(NullPointerException.class, () -> trie.insert(null));
        
        // Attempt to insert an empty string and check if it throws an error
        assertThrows(IllegalArgumentException.class, () -> trie.insert(""));
        
        // Attempt to search for null and check if it throws an error
        assertThrows(NullPointerException.class, () -> trie.search(null));
        
        // Attempt to search for an empty string and check if it throws an error
        assertFalse(trie.search(""));
        
        // Attempt to search for a null prefix and check if it throws an error
        assertThrows(NullPointerException.class, () -> trie.startsWith(null));
        
        // Attempt to search for an empty prefix and check if it throws an error
        assertFalse(trie.startsWith(""));
    }
}