package leetcode.two_pointers.q167;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.two_pointers.q167.TwoSumIIInputArrayIsSorted;

public class TwoSumIIInputArrayIsSortedTests {

    @Test
    public void testTwoSum() {
        TwoSumIIInputArrayIsSorted ob = new TwoSumIIInputArrayIsSorted();

        // Test empty input array
        int[] emptyArray = new int[0];
        int[] emptyResult = ob.twoSum(emptyArray, 9);
        assertNull(emptyResult);

        // Test single element input array
        int[] singleArray = {4};
        int[] singleResult = ob.twoSum(singleArray, 4);
        assertNull(singleResult);

        // Test input array with negative numbers
        int[] negativeArray = {-2, -1, 1, 3, 5};
        int[] negativeResult = ob.twoSum(negativeArray, 0);
        assertArrayEquals(new int[]{1, 3}, negativeResult);

        // Test input array with duplicate numbers
        int[] duplicateArray = {2, 2, 3, 4, 5};
        int[] duplicateResult = ob.twoSum(duplicateArray, 4);
        assertArrayEquals(new int[]{1, 2}, duplicateResult);

        // Test input array with multiple solutions
        int[] multipleArray = {1, 2, 3, 4, 5, 6};
        int[] multipleResult = ob.twoSum(multipleArray, 8);
        assertArrayEquals(new int[]{2, 6}, multipleResult);

        // Test input array with all numbers being the target value
        int[] allTargetArray = {4, 4, 4};
        int[] allTargetResult = ob.twoSum(allTargetArray, 8);
        assertArrayEquals(new int[]{1, 3}, allTargetResult);
    }

    @Test
    public void testInvalidInput() {
        TwoSumIIInputArrayIsSorted ob = new TwoSumIIInputArrayIsSorted();

        // Test null input array
        int[] nullArray = null;
        int[] nullResult = ob.twoSum(nullArray, 9);
        assertNull(nullResult);

        // Test target value is smaller than smallest number in input array
        int[] smallerTargetArray = {5, 6, 7};
        int[] smallerTargetResult = ob.twoSum(smallerTargetArray, 4);
        assertNull(smallerTargetResult);

        // Test target value is larger than largest number in input array
        int[] largerTargetArray = {1, 2, 3};
        int[] largerTargetResult = ob.twoSum(largerTargetArray, 9);
        assertNull(largerTargetResult);
    }
}