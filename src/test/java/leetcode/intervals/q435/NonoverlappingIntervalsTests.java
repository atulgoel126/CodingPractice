//package leetcode.intervals.q435;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.intervals.q435.NonoverlappingIntervals;
//import java.util.Arrays;
//
//public class NonoverlappingIntervalsTests {
//    @Test
//    public void testOverlap() {
//        int[][] intervals = {{1, 3}, {2, 4}, {5, 7}, {6, 8}};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(2, ob.eraseOverlapIntervals(intervals));
//    }
//
//    @Test
//    public void testNoOverlap() {
//        int[][] intervals = {{1, 3}, {4, 6}, {7, 9}, {10, 12}};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(0, ob.eraseOverlapIntervals(intervals));
//    }
//
//    @Test
//    public void testDuplicateIntervals() {
//        int[][] intervals = {{1, 3}, {1, 3}, {4, 6}, {7, 9}};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(2, ob.eraseOverlapIntervals(intervals));
//    }
//
//    @Test
//    public void testEdgeCases() {
//        int[][] intervals1 = null;
//        int[][] intervals2 = {{}};
//        int[][] intervals3 = {{1, 3}};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(0, ob.eraseOverlapIntervals(intervals1));
//        assertEquals(0, ob.eraseOverlapIntervals(intervals2));
//        assertEquals(0, ob.eraseOverlapIntervals(intervals3));
//    }
//
//    @Test
//    public void testSortedByStart() {
//        int[][] intervals = {{1, 3}, {4, 6}, {7, 9}, {10, 12}, {13, 15}};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(0, ob.eraseOverlapIntervals(intervals));
//
//    }
//
//    @Test
//    public void testEmptyIntervals() {
//        int[][] intervals = {};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(0, ob.eraseOverlapIntervals(intervals));
//
//    }
//
//    @Test
//    public void testSingleInterval() {
//        int[][] intervals = {{1, 3}};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(0, ob.eraseOverlapIntervals(intervals));
//
//    }
//
//    @Test
//    public void testNegativeIntervals() {
//        int[][] intervals = {{-3, -1}, {-2, 0}, {-5, -4}, {-6, -7}};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(2, ob.eraseOverlapIntervals(intervals));
//    }
//
//    @Test
//    public void testMixedIntervals() {
//        int[][] intervals = {{-3, -1}, {0, 2}, {3, 5}, {-2, 6}};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(1, ob.eraseOverlapIntervals(intervals));
//    }
//
//    @Test
//    public void testReverseSorted() {
//        int[][] intervals = {{5, 7}, {3, 4}, {2, 6}, {1, 3}};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(3, ob.eraseOverlapIntervals(intervals));
//    }
//
//    @Test
//    public void testLargeRange() {
//        int[][] intervals = {{-1000, 1000}, {-500, 500}, {0, 100}};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(2, ob.eraseOverlapIntervals(intervals));
//    }
//
//    @Test
//    public void testRandomIntervals() {
//        int[][] intervals = {{1, 3}, {3, 6}, {7, 8}, {12, 13}, {2, 5}, {9, 11}, {14, 15}};
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(3, ob.eraseOverlapIntervals(intervals));
//    }
//
//    @Test
//    public void testLargeIntervalArray() {
//        int[][] intervals = new int[10000][2];
//        for (int i = 0; i < 10000; i++) {
//            intervals[i] = new int[]{i, (i+1)*3};
//        }
//        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
//        NonoverlappingIntervals ob = new NonoverlappingIntervals();
//        assertEquals(6667, ob.eraseOverlapIntervals(intervals));
//    }
//}