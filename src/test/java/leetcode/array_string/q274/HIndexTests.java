//package leetcode.array_string.q274;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.array_string.q274.HIndex;
//
//public class HIndexTests {
//    @Test
//    public void testBasicHIndex() {
//        HIndex ob = new HIndex();
//        int[] citations = {3,0,6,1,5};
//        int result = ob.hIndex(citations);
//        assertEquals(result, 3);
//    }
//
//    @Test
//    public void testEmptyArray() {
//        HIndex ob = new HIndex();
//        int[] citations = {};
//        int result = ob.hIndex(citations);
//        assertEquals(result, 0);
//    }
//
//    @Test
//    public void testHindexWithNegativeValues() {
//        HIndex ob = new HIndex();
//        int[] citations = {-3, 0, -6, 1, 5};
//        int result = ob.hIndex(citations);
//        assertEquals(result, 1);
//    }
//
//    @Test
//    public void testHindexWithAllZeroes() {
//        HIndex ob = new HIndex();
//        int[] citations = {0, 0, 0, 0};
//        int result = ob.hIndex(citations);
//        assertEquals(result, 0);
//    }
//
//    @Test
//    public void testHindexWithAllSameValue() {
//        HIndex ob = new HIndex();
//        int[] citations = {8, 8, 8, 8};
//        int result = ob.hIndex(citations);
//        assertEquals(result, 4);
//    }
//
//    @Test
//    public void testHindexWithLargeValues() {
//        HIndex ob = new HIndex();
//        int[] citations = {100, 200, 300, 400, 500};
//        int result = ob.hIndex(citations);
//        assertEquals(result, 3);
//    }
//
//    @Test
//    public void testHindexWithSingleValue() {
//        HIndex ob = new HIndex();
//        int[] citations = {4};
//        int result = ob.hIndex(citations);
//        assertEquals(result, 1);
//    }
//
//    @Test
//    public void testHindexWithDuplicateValues() {
//        HIndex ob = new HIndex();
//        int[] citations = {5,3,3,1,0};
//        int result = ob.hIndex(citations);
//        assertEquals(result, 3);
//    }
//
//    @Test
//    public void testHindexWithLargeInputSize() {
//        HIndex ob = new HIndex();
//        int[] citations = new int[1000000];
//        for(int i = 0; i < 1000000; i++) {
//            citations[i] = i + 1;
//        }
//        int result = ob.hIndex(citations);
//        assertEquals(result, 500000);
//    }
//
//    @Test
//    public void testHindexWithNegativeInputSize() {
//        HIndex ob = new HIndex();
//        int[] citations = new int[-10];
//        int result = ob.hIndex(citations);
//        assertEquals(result, 0);
//    }
//
//    @Test
//    public void testHindexWithNullInput() {
//        HIndex ob = new HIndex();
//        int[] citations = null;
//        int result = ob.hIndex(citations);
//        assertEquals(result, 0);
//    }
//
//    @Test
//    public void testHindexWithSingleElementArray() {
//        HIndex ob = new HIndex();
//        int[] citations = {1};
//        int result = ob.hIndex(citations);
//        assertEquals(result, 1);
//    }
//}