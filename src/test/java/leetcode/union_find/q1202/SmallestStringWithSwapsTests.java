//package leetcode.union_find.q1202;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.union_find.q1202.SmallestStringWithSwaps;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class SmallestStringWithSwapsTests {
//    @Test
//    public void testExample1() {
//        SmallestStringWithSwaps ob = new SmallestStringWithSwaps();
//        String s = "dcab";
//        List<List<Integer>> pairs = new ArrayList<>();
//        pairs.add(Arrays.asList(0, 3));
//        pairs.add(Arrays.asList(1, 2));
//        assertEquals("bacd", ob.smallestStringWithSwaps(s, pairs));
//    }
//
//    @Test
//    public void testExample2() {
//        SmallestStringWithSwaps ob = new SmallestStringWithSwaps();
//        String s = "dcab";
//        List<List<Integer>> pairs = new ArrayList<>();
//        pairs.add(Arrays.asList(0, 3));
//        pairs.add(Arrays.asList(1, 2));
//        pairs.add(Arrays.asList(0, 1));
//        assertEquals("acdb", ob.smallestStringWithSwaps(s, pairs));
//    }
//
//    @Test
//    public void testExample3() {
//        SmallestStringWithSwaps ob = new SmallestStringWithSwaps();
//        String s = "cba";
//        List<List<Integer>> pairs = new ArrayList<>();
//        pairs.add(Arrays.asList(0, 1));
//        pairs.add(Arrays.asList(1, 2));
//        assertEquals("abc", ob.smallestStringWithSwaps(s, pairs));
//    }
//
//    @Test
//    public void testEmptyString() {
//        SmallestStringWithSwaps ob = new SmallestStringWithSwaps();
//        String s = "";
//        List<List<Integer>> pairs = new ArrayList<>();
//        assertEquals("", ob.smallestStringWithSwaps(s, pairs));
//    }
//
//    @Test
//    public void testEmptyPairsList() {
//        SmallestStringWithSwaps ob = new SmallestStringWithSwaps();
//        String s = "abc";
//        List<List<Integer>> pairs = new ArrayList<>();
//        assertEquals("abc", ob.smallestStringWithSwaps(s, pairs));
//    }
//
//    @Test
//    public void testInvalidPair() {
//        SmallestStringWithSwaps ob = new SmallestStringWithSwaps();
//        String s = "abc";
//        List<List<Integer>> pairs = new ArrayList<>();
//        pairs.add(Arrays.asList(0, 4));
//        assertEquals("abc", ob.smallestStringWithSwaps(s, pairs));
//    }
//
//    @Test
//    public void testRepeatedPairs() {
//        SmallestStringWithSwaps ob = new SmallestStringWithSwaps();
//        String s = "abc";
//        List<List<Integer>> pairs = new ArrayList<>();
//        pairs.add(Arrays.asList(0, 1));
//        pairs.add(Arrays.asList(0, 1));
//        assertEquals("abc", ob.smallestStringWithSwaps(s, pairs));
//    }
//}