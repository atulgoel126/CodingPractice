package leetcode.q162;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.q162.PeakElement;

public class PeakElementTests {

    @Test
    public void testSinglePeak() {
        PeakElement ob = new PeakElement();
        int[] nums = {1, 2, 3, 1};
        int expected = 2;
        assertEquals(expected, ob.findPeakElement(nums));
    }

    @Test
    public void testMultiplePeaks() {
        PeakElement ob = new PeakElement();
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int result = ob.findPeakElement(nums);
        assertTrue(result == 1 || result == 5); // Can be either index 1 or 5
    }

    @Test
    public void testSingleElementArray() {
        PeakElement ob = new PeakElement();
        int[] nums = {1};
        int expected = 0;
        assertEquals(expected, ob.findPeakElement(nums));
    }

    @Test
    public void testTwoElementArray() {
        PeakElement ob = new PeakElement();
        int[] nums = {1, 2};
        int expected = 1;
        assertEquals(expected, ob.findPeakElement(nums));
    }

    @Test
    public void testDecreasingArray() {
        PeakElement ob = new PeakElement();
        int[] nums = {3, 2, 1};
        int expected = 0;
        assertEquals(expected, ob.findPeakElement(nums));
    }

    @Test
    public void testIncreasingArray() {
        PeakElement ob = new PeakElement();
        int[] nums = {1, 2, 3};
        int expected = 2;
        assertEquals(expected, ob.findPeakElement(nums));
    }

    @Test
    public void testPerformanceLargeInput() {
        PeakElement ob = new PeakElement();
        int[] nums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i; // Strictly increasing
        }
        int expected = 999;

        long startTime = System.currentTimeMillis();
        assertEquals(expected, ob.findPeakElement(nums));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        assertTrue(duration < 1000, "Test took too long to complete.");
    }

    @Test
    public void testPerformanceMultiplePeaks() {
        PeakElement ob = new PeakElement();
        int[] nums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i % 2 == 0) ? i : i - 1; // Creating multiple peaks
        }
        int result = ob.findPeakElement(nums);

        long startTime = System.currentTimeMillis();
        assertTrue(result % 2 == 0); // Result index should be even (peak)
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        assertTrue(duration < 1000, "Test took too long to complete.");
    }
}
