//package leetcode.backtracking.q131;//import necessary packages and classes
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.backtracking.q131.PalindromePartitioning;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.ArrayList;
//
//public class PalindromePartitioningTests {
//
//    //test case for a simple string with valid partitions
//    @Test
//    public void testValidPartitions() {
//        PalindromePartitioning ob = new PalindromePartitioning();
//        String s = "aab";
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList("a","a","b"));
//    	expected.add(Arrays.asList("aa","b"));
//        List<List<String>> actual = ob.partition(s);
//        assertEquals(expected, actual);
//    }
//
//    //test case for an empty string
//    @Test
//    public void testEmptyString() {
//        PalindromePartitioning ob = new PalindromePartitioning();
//        String s = "";
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList());
//        List<List<String>> actual = ob.partition(s);
//        assertEquals(expected, actual);
//    }
//
//    //test case for a string with only one character
//    @Test
//    public void testSingleCharacter() {
//        PalindromePartitioning ob = new PalindromePartitioning();
//        String s = "a";
//        List<List<String>> expected = new ArrayList<>();
//     	expected.add(Arrays.asList("a"));
//        List<List<String>> actual = ob.partition(s);
//        assertEquals(expected, actual);
//    }
//
//    //test case for a string with all unique characters
//    @Test
//    public void testUniqueString() {
//        PalindromePartitioning ob = new PalindromePartitioning();
//        String s = "abcdef";
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList("a","b","c","d","e","f"));
//        List<List<String>> actual = ob.partition(s);
//        assertEquals(expected, actual);
//    }
//
//    //test case for a string with all identical characters
//    @Test
//    public void testIdenticalString() {
//        PalindromePartitioning ob = new PalindromePartitioning();
//        String s = "aaaaa";
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList("a","a","a","a","a"));
//        List<List<String>> actual = ob.partition(s);
//        assertEquals(expected, actual);
//    }
//
//    //test case for a string with both lowercase and uppercase characters
//    @Test
//    public void testCaseInsensitiveString() {
//        PalindromePartitioning ob = new PalindromePartitioning();
//        String s = "aAaBbB";
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList("a","A","a","B","b","B"));
//        List<List<String>> actual = ob.partition(s);
//        assertEquals(expected, actual);
//    }
//
//    //test case for a string with spaces and special characters
//    @Test
//    public void testStringWithSpacesAndSpecialCharacters() {
//        PalindromePartitioning ob = new PalindromePartitioning();
//        String s = "a bcb = $";
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList("a"," ","b","c","b"," ","="," ","$"));
//        List<List<String>> actual = ob.partition(s);
//        assertEquals(expected, actual);
//    }
//
//    //test case for a string with leading and trailing spaces
//    @Test
//    public void testStringWithLeadingAndTrailingSpaces() {
//        PalindromePartitioning ob = new PalindromePartitioning();
//        String s = " a b c ";
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList(" ","a"," ","b"," ","c"," "));
//        List<List<String>> actual = ob.partition(s);
//        assertEquals(expected, actual);
//    }
//
//    //test case for a string that is already a palindrome
//    @Test
//    public void testPalindromeString() {
//        PalindromePartitioning ob = new PalindromePartitioning();
//        String s = "abba";
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList("a","b","b","a"));
//        expected.add(Arrays.asList("a","bb","a"));
//        expected.add(Arrays.asList("abba"));
//        List<List<String>> actual = ob.partition(s);
//        assertEquals(expected, actual);
//    }
//
//    //test case for a string with no valid partitions
//    @Test
//    public void testNonPalindromeString() {
//        PalindromePartitioning ob = new PalindromePartitioning();
//        String s = "abc";
//        List<List<String>> expected = new ArrayList<>();
//        expected.add(Arrays.asList("a","b","c"));
//        List<List<String>> actual = ob.partition(s);
//        assertEquals(expected, actual);
//    }
//}