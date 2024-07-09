package leetcode.intervals.q57;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import leetcode.intervals.q57.InsertInterval;

public class InsertIntervalTests {

    @Test
    public void testStandardInsert() {
        int[][] intervals = {{1,3}, {6,9}};
        int[] newInterval = {2,5};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{1,5}, {6,9}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testInsertAtBeginning() {
        int[][] intervals = {{6,9}};
        int[] newInterval = {1,3};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{1,3}, {6,9}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testInsertAtEnd() {
        int[][] intervals = {{1,3}, {6,9}};
        int[] newInterval = {10,15};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{1,3}, {6,9}, {10,15}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testMergeOverlappingInterval() {
        int[][] intervals = {{1,3}, {6,9}};
        int[] newInterval = {2,7};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{1,9}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testMergeMultipleOverlap() {
        int[][] intervals = {{1,2}, {3,5}, {6,7}, {8,10}, {12,16}};
        int[] newInterval = {4,9};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{1,2}, {3,10}, {12,16}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testEmptyIntervals() {
        int[][] intervals = {};
        int[] newInterval = {4,9};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{4,9}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testEmptyNewInterval() {
        int[][] intervals = {{1,3}, {6,9}};
        int[] newInterval = {};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{1,3}, {6,9}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testNullIntervals() {
        int[][] intervals = null;
        int[] newInterval = {4,9};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{4,9}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testNullNewInterval() {
        int[][] intervals = {{1,3}, {6,9}};
        int[] newInterval = null;
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{1,3}, {6,9}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testNonOverlap() {
        int[][] intervals = {{1,3}, {6,9}};
        int[] newInterval = {4,5};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{1,3}, {4,5}, {6,9}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testNegativeOverlap() {
        int[][] intervals = {{-5,-2}, {0,2}, {3,7}, {9,10}, {12,16}};
        int[] newInterval = {4,9};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{-5,-2}, {0,2}, {3,10}, {12,16}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testLargeIntervals() {
        int[][] intervals = {{100,1000}, {2000,3000}, {4000,5000}, {6000,7000}};
        int[] newInterval = {1500,5500};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{100,5555}, {6000,7000}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testEqualStartEnd() {
        int[][] intervals = {{1,1}, {2,2}, {6,6}, {8,8}, {11,11}};
        int[] newInterval = {5,5};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{1,1}, {2,2}, {5,5}, {6,6}, {8,8}, {11,11}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test
    public void testOverlappingExistingStart() {
        // This behavior is not explicitly mentioned in the problem statement, but it is expected to be handled. 
        int[][] intervals = {{3,6}, {9,12}};
        int[] newInterval = {3,5};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{3,6}, {9,12}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

    @Test 
    public void testOverlappingExistingEnd() {
        // This behavior is not explicitly mentioned in the problem statement, but it is expected to be handled. 
        int[][] intervals = {{3,6}, {9,12}};
        int[] newInterval = {7,12};
        InsertInterval ob = new InsertInterval();
        int[][] expected = {{3,6}, {7,12}};
        assertArrayEquals(expected, ob.insert(intervals, newInterval));
    }

}