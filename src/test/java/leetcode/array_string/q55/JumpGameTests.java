package leetcode.array_string.q55;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.array_string.q55.JumpGame;

public class JumpGameTests {

    @Test
    public void testPositiveNumbers() {
        JumpGame ob = new JumpGame();

        // Positive numbers
        int[] nums = {2, 3, 1, 1, 4};

        assertEquals(true, ob.canJump(nums));
    }

    @Test
    public void testNegativeNumbers() {
        JumpGame ob = new JumpGame();

        // Negative numbers
        int[] nums = {-1, -2, -3, -4, -5};

        assertEquals(false, ob.canJump(nums));
    }

    @Test
    public void testEmptyArray() {
        JumpGame ob = new JumpGame();

        // Empty array
        int[] nums = {};

        assertEquals(false, ob.canJump(nums));
    }

    @Test
    public void testSingleElementArray() {
        JumpGame ob = new JumpGame();

        // Single element array
        int[] nums = {0};

        assertEquals(true, ob.canJump(nums));
    }

    @Test
    public void testAllZerosExceptLastElement() {
        JumpGame ob = new JumpGame();

        // All zeros except last element
        int[] nums = {0, 0, 0, 0, 0, 1};

        assertEquals(false, ob.canJump(nums));
    }

    @Test
    public void testAllZeros() {
        JumpGame ob = new JumpGame();

        // All zeros
        int[] nums = {0, 0, 0, 0, 0};

        assertEquals(true, ob.canJump(nums));
    }

    @Test
    public void testJumpToSameIndex() {
        JumpGame ob = new JumpGame();

        // Can jump to the same index
        int[] nums = {0, 1, 1, 1};

        assertEquals(true, ob.canJump(nums));
    }

    @Test
    public void testNegativeJumpValue() {
        JumpGame ob = new JumpGame();

        // Negative jump value
        int[] nums = {2, 3, -1, -1, 4};

        assertThrows(IllegalArgumentException.class, () -> ob.canJump(nums));
    }

    @Test
    public void testJumpOutOfRange() {
        JumpGame ob = new JumpGame();

        // Jump value out of range
        int[] nums = {2, 3, 6, 1, 4};

        assertEquals(false, ob.canJump(nums));
    }

}