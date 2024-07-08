package leetcode.q912;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.q912.SortAnArray;
import java.util.Arrays;
import java.util.Random;

public class SortAnArrayTests {

    @Test
    public void testExample1() {
        SortAnArray ob = new SortAnArray();
        int[] nums = {5, 2, 3, 1};
        int[] expected = {1, 2, 3, 5};
        assertArrayEquals(expected, ob.sortArray(nums));
    }

    @Test
    public void testExample2() {
        SortAnArray ob = new SortAnArray();
        int[] nums = {5, 1, 1, 2, 0, 0};
        int[] expected = {0, 0, 1, 1, 2, 5};
        assertArrayEquals(expected, ob.sortArray(nums));
    }

    @Test
    public void testSingleElement() {
        SortAnArray ob = new SortAnArray();
        int[] nums = {1};
        int[] expected = {1};
        assertArrayEquals(expected, ob.sortArray(nums));
    }

    @Test
    public void testEmptyArray() {
        SortAnArray ob = new SortAnArray();
        int[] nums = {};
        int[] expected = {};
        assertArrayEquals(expected, ob.sortArray(nums));
    }

    @Test
    public void testAlreadySorted() {
        SortAnArray ob = new SortAnArray();
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, ob.sortArray(nums));
    }

    @Test
    public void testReverseSorted() {
        SortAnArray ob = new SortAnArray();
        int[] nums = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, ob.sortArray(nums));
    }

    @Test
    public void testLargeArray() {
        SortAnArray ob = new SortAnArray();
        Random random = new Random();
        int size = 100000;
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = random.nextInt(100000) - 50000;
        }
        int[] expected = Arrays.copyOf(nums, nums.length);
        Arrays.sort(expected);
        assertArrayEquals(expected, ob.sortArray(nums));
    }
}