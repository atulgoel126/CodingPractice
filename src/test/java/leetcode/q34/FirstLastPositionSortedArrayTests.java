package leetcode.q34;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.q34.FirstLastPositionSortedArray;

public class FirstLastPositionSortedArrayTests {

    @Test
    public void testTargetPresentMultipleTimes() {
        FirstLastPositionSortedArray ob = new FirstLastPositionSortedArray();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        assertArrayEquals(expected, ob.searchRange(nums, target));
    }

    @Test
    public void testTargetNotPresent() {
        FirstLastPositionSortedArray ob = new FirstLastPositionSortedArray();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, ob.searchRange(nums, target));
    }

    @Test
    public void testEmptyArray() {
        FirstLastPositionSortedArray ob = new FirstLastPositionSortedArray();
        int[] nums = {};
        int target = 0;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, ob.searchRange(nums, target));
    }

    @Test
    public void testSingleElementArrayTargetPresent() {
        FirstLastPositionSortedArray ob = new FirstLastPositionSortedArray();
        int[] nums = {1};
        int target = 1;
        int[] expected = {0, 0};
        assertArrayEquals(expected, ob.searchRange(nums, target));
    }

    @Test
    public void testSingleElementArrayTargetNotPresent() {
        FirstLastPositionSortedArray ob = new FirstLastPositionSortedArray();
        int[] nums = {1};
        int target = 0;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, ob.searchRange(nums, target));
    }

    @Test
    public void testAllElementsSameAsTarget() {
        FirstLastPositionSortedArray ob = new FirstLastPositionSortedArray();
        int[] nums = {2, 2, 2, 2, 2};
        int target = 2;
        int[] expected = {0, 4};
        assertArrayEquals(expected, ob.searchRange(nums, target));
    }

    @Test
    public void testTargetAtStart() {
        FirstLastPositionSortedArray ob = new FirstLastPositionSortedArray();
        int[] nums = {2, 3, 3, 3, 4};
        int target = 2;
        int[] expected = {0, 0};
        assertArrayEquals(expected, ob.searchRange(nums, target));
    }

    @Test
    public void testTargetAtEnd() {
        FirstLastPositionSortedArray ob = new FirstLastPositionSortedArray();
        int[] nums = {1, 1, 1, 1, 2};
        int target = 2;
        int[] expected = {4, 4};
        assertArrayEquals(expected, ob.searchRange(nums, target));
    }

    @Test
    public void testPerformanceLargeInput() {
        FirstLastPositionSortedArray ob = new FirstLastPositionSortedArray();
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i; // Sorted array with unique elements
        }
        nums[50000] = 50000; // Ensure the target is in the middle
        int target = 50000;
        int[] expected = {50000, 50000};

        long startTime = System.currentTimeMillis();
        assertArrayEquals(expected, ob.searchRange(nums, target));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        assertTrue(duration < 1000, "Test took too long to complete.");
    }

    @Test
    public void testPerformanceLargeInputMultipleTargets() {
        FirstLastPositionSortedArray ob = new FirstLastPositionSortedArray();
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i / 2; // Sorted array with multiple instances of the same target
        }
        int target = 25000;
        int[] expected = {50000, 50001}; // The first 25000 is at index 50000 and the last at 50001

        long startTime = System.currentTimeMillis();
        assertArrayEquals(expected, ob.searchRange(nums, target));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        assertTrue(duration < 1000, "Test took too long to complete.");
    }
}
