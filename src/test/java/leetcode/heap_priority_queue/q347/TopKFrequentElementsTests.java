package leetcode.heap_priority_queue.q347;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class TopKFrequentElementsTests {

    @Test
    public void testExample1() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> expected = Arrays.asList(1, 2);
        List<Integer> result = ob.topKFrequent(nums, k);
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testExample2() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5};
        int k = 3;
        List<Integer> expected = Arrays.asList(4, 2, 3);
        List<Integer> result = ob.topKFrequent(nums, k);
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testSingleElement() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {1};
        int k = 1;
        List<Integer> expected = Arrays.asList(1);
        List<Integer> result = ob.topKFrequent(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void testAllElementsSame() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {2, 2, 2, 2, 2};
        int k = 1;
        List<Integer> expected = Arrays.asList(2);
        List<Integer> result = ob.topKFrequent(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void testNegativeNumbers() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {-1, -1, -2, -2, -3};
        int k = 2;
        List<Integer> expected = Arrays.asList(-1, -2);
        List<Integer> result = ob.topKFrequent(nums, k);
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testMixedNumbers() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {3, -1, 2, 0, 5, -2, -1, 3, 2, 2};
        int k = 3;
        List<Integer> expected = Arrays.asList(2, -1, 3);
        List<Integer> result = ob.topKFrequent(nums, k);
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testKGreaterThanUniqueElements() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {1, 1, 2, 2, 3};
        int k = 4;
        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> result = ob.topKFrequent(nums, k);
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testEmptyArray() {
        TopKFrequentElements ob = new TopKFrequentElements();
        int[] nums = {};
        int k = 1;
        assertThrows(IllegalArgumentException.class, () -> {
            ob.topKFrequent(nums, k);
        });
    }

    // Helper method to create a list from an array
    private List<Integer> createList(int[] values) {
        return Arrays.stream(values).boxed().collect(java.util.stream.Collectors.toList());
    }
}
