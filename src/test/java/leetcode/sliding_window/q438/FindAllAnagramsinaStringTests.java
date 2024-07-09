//package leetcode.sliding_window.q438;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class FindAllAnagramsinaStringTests {
//    @Test
//    public void testEmptyString() {
//        FindAllAnagramsinaString ob = new FindAllAnagramsinaString();
//        List<Integer> result = ob.findAnagrams("", "a");
//        assertTrue(result.isEmpty());
//    }
//
//    @Test
//    public void testEmptyPattern() {
//        FindAllAnagramsinaString ob = new FindAllAnagramsinaString();
//        List<Integer> result = ob.findAnagrams("cbaebabacd", "");
//        assertTrue(result.isEmpty());
//    }
//
//    @Test
//    public void testSameCharacterString() {
//        FindAllAnagramsinaString ob = new FindAllAnagramsinaString();
//        List<Integer> result = ob.findAnagrams("aaaaa", "a");
//        assertEquals(Arrays.asList(0,1,2,3,4), result);
//    }
//
//    @Test
//    public void testSameCharacterPattern() {
//        FindAllAnagramsinaString ob = new FindAllAnagramsinaString();
//        List<Integer> result = ob.findAnagrams("abcdcba", "aaaaa");
//        assertTrue(result.isEmpty());
//    }
//
//    @Test
//    public void testPatternLongerThanString() {
//        FindAllAnagramsinaString ob = new FindAllAnagramsinaString();
//        List<Integer> result = ob.findAnagrams("abc", "abcdcba");
//        assertTrue(result.isEmpty());
//    }
//
//    @Test
//    public void testNoAnagramsFound() {
//        FindAllAnagramsinaString ob = new FindAllAnagramsinaString();
//        List<Integer> result = ob.findAnagrams("abcd", "efgh");
//        assertTrue(result.isEmpty());
//    }
//
//    @Test
//    public void testMultipleAnagramsFound() {
//        FindAllAnagramsinaString ob = new FindAllAnagramsinaString();
//        List<Integer> result = ob.findAnagrams("cbaebabacd", "abc");
//        assertEquals(Arrays.asList(0, 6), result);
//    }
//
//    @Test
//    public void testAnagramAtBeginningOfString() {
//        FindAllAnagramsinaString ob = new FindAllAnagramsinaString();
//        List<Integer> result = ob.findAnagrams("cbaebabacd", "cba");
//        assertEquals(Arrays.asList(0), result);
//    }
//
//    @Test
//    public void testAnagramAtEndOfString() {
//        FindAllAnagramsinaString ob = new FindAllAnagramsinaString();
//        List<Integer> result = ob.findAnagrams("cbaebabacd", "bacd");
//        assertEquals(Arrays.asList(6), result);
//    }
//
//    @Test
//    public void testRepeatedAnagrams() {
//        FindAllAnagramsinaString ob = new FindAllAnagramsinaString();
//        List<Integer> result = ob.findAnagrams("abab", "ab");
//        assertEquals(Arrays.asList(0,1,2), result);
//    }
//
//    @Test
//    public void testLargeStringAndPattern() {
//        FindAllAnagramsinaString ob = new FindAllAnagramsinaString();
//        List<Integer> result = ob.findAnagrams("abababaabababaababa", "ababa");
//        assertEquals(Arrays.asList(0,1,2,3,5,6,10,11,12,13,15,16,20), result);
//    }
//}