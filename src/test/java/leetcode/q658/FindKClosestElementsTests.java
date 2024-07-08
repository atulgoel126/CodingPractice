package leetcode.q658;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class FindKClosestElementsTests {

    @Test
    public void testExample1() {
        FindKClosestElementsUnsorted unsorted = new FindKClosestElementsUnsorted();
        FindKClosestElementsSorted sorted = new FindKClosestElementsSorted();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, unsorted.findClosestElements(arr, k, x));
        assertEquals(expected, sorted.findClosestElements(arr, k, x));
    }

    @Test
    public void testExample2() {
        FindKClosestElementsUnsorted unsorted = new FindKClosestElementsUnsorted();
        FindKClosestElementsSorted sorted = new FindKClosestElementsSorted();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = -1;
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertEquals(expected, unsorted.findClosestElements(arr, k, x));
        assertEquals(expected, sorted.findClosestElements(arr, k, x));
    }

    @Test
    public void testSingleElementArray() {
        FindKClosestElementsUnsorted unsorted = new FindKClosestElementsUnsorted();
        FindKClosestElementsSorted sorted = new FindKClosestElementsSorted();
        int[] arr = {1};
        int k = 1;
        int x = 1;
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, unsorted.findClosestElements(arr, k, x));
        assertEquals(expected, sorted.findClosestElements(arr, k, x));
    }

    @Test
    public void testKEqualsLength() {
        FindKClosestElementsUnsorted unsorted = new FindKClosestElementsUnsorted();
        FindKClosestElementsSorted sorted = new FindKClosestElementsSorted();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        int x = 3;
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, unsorted.findClosestElements(arr, k, x));
        assertEquals(expected, sorted.findClosestElements(arr, k, x));
    }

    @Test
    public void testXGreaterThanAll() {
        FindKClosestElementsUnsorted unsorted = new FindKClosestElementsUnsorted();
        FindKClosestElementsSorted sorted = new FindKClosestElementsSorted();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int x = 10;
        List<Integer> expected = Arrays.asList(4, 5);
        assertEquals(expected, unsorted.findClosestElements(arr, k, x));
        assertEquals(expected, sorted.findClosestElements(arr, k, x));
    }

    @Test
    public void testXLessThanAll() {
        FindKClosestElementsUnsorted unsorted = new FindKClosestElementsUnsorted();
        FindKClosestElementsSorted sorted = new FindKClosestElementsSorted();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int x = -10;
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, unsorted.findClosestElements(arr, k, x));
        assertEquals(expected, sorted.findClosestElements(arr, k, x));
    }

    @Test
    public void testNegativeNumbers() {
        FindKClosestElementsUnsorted unsorted = new FindKClosestElementsUnsorted();
        FindKClosestElementsSorted sorted = new FindKClosestElementsSorted();
        int[] arr = {-10, -5, -2, -1, 0, 3, 5};
        int k = 4;
        int x = -3;
        List<Integer> expected = Arrays.asList(-5, -2, -1, 0);
        assertEquals(expected, unsorted.findClosestElements(arr, k, x));
        assertEquals(expected, sorted.findClosestElements(arr, k, x));
    }

    @Test
    public void testPerformance() {
        FindKClosestElementsUnsorted unsorted = new FindKClosestElementsUnsorted();
        FindKClosestElementsSorted sorted = new FindKClosestElementsSorted();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int k = 5;
        int x = 5000;

        long startTimeUnsorted = System.currentTimeMillis();
        List<Integer> resultUnsorted = unsorted.findClosestElements(arr, k, x);
        long endTimeUnsorted = System.currentTimeMillis();
        long durationUnsorted = endTimeUnsorted - startTimeUnsorted;
        assertTrue(durationUnsorted < 1000, "Test took too long to complete.");
        assertEquals(Arrays.asList(4998, 4999, 5000, 5001, 5002), resultUnsorted);

        long startTimeSorted = System.currentTimeMillis();
        List<Integer> resultSorted = sorted.findClosestElements(arr, k, x);
        long endTimeSorted = System.currentTimeMillis();
        long durationSorted = endTimeSorted - startTimeSorted;

        assertTrue(durationSorted < 200, "Test took too long to complete.");
        assertEquals(Arrays.asList(4998, 4999, 5000, 5001, 5002), resultSorted);
    }

    @Test
    public void testEdgeCaseLargeNumbers() {
        FindKClosestElementsSorted sorted = new FindKClosestElementsSorted();
        FindKClosestElementsUnsorted unsorted = new FindKClosestElementsUnsorted();
        int[] arr = {10000, 10001, 10002, 10003, 10004};
        int k = 3;
        int x = 10000;
        List<Integer> expected = Arrays.asList(10000, 10001, 10002);
        assertEquals(expected, unsorted.findClosestElements(arr, k, x));
        assertEquals(expected, sorted.findClosestElements(arr, k, x));
    }

    @Test
    public void testDuplicateLargeNumbers() {
        FindKClosestElementsSorted sorted = new FindKClosestElementsSorted();
        FindKClosestElementsUnsorted unsorted = new FindKClosestElementsUnsorted();
        int[] arr = {0,1,1,1,2,3,6,7,8,9};
        int k = 9;
        int x = 4;
        List<Integer> expected = Arrays.asList(0,1,1,1,2,3,6,7,8);
        assertEquals(expected, unsorted.findClosestElements(arr, k, x));
        assertEquals(expected, sorted.findClosestElements(arr, k, x));
    }
}
