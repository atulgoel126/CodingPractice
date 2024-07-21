//package leetcode.array_string.q42;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.array_string.q42.TrappingRainWater;
//
//public class TrappingRainWaterTests {
//
//    @Test
//    public void testEmptyArray() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {};
//        int result = ob.trap(height);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testSingleElementArray() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {5};
//        int result = ob.trap(height);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testTwoElementArray() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {5, 4};
//        int result = ob.trap(height);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testDescendingArray() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {5, 4, 3, 2, 1};
//        int result = ob.trap(height);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testAscendingArray() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {1, 2, 3, 4, 5};
//        int result = ob.trap(height);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testEqualElementsArray() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {3, 3, 3, 3, 3};
//        int result = ob.trap(height);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testNegativeElementsArray() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {-3, -2, -5, -4, -1};
//        int result = ob.trap(height);
//        assertEquals(5, result);
//    }
//
//    @Test
//    public void testMixedElementsArray() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {0, 2, 1, 3, 0, 5};
//        int result = ob.trap(height);
//        assertEquals(6, result);
//    }
//
//    @Test
//    public void testLargeArray() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {7, 9, 2, 3, 7, 9, 1, 4, 6, 8, 2, 5, 7, 9, 2, 3, 7};
//        int result = ob.trap(height);
//        assertEquals(40, result);
//    }
//
//    @Test
//    public void testArrayWithZeroTrap() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {5, 3, 2, 4, 6};
//        int result = ob.trap(height);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testArrayWithAllTrap() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {3, 2, 1, 2, 3};
//        int result = ob.trap(height);
//        assertEquals(4, result);
//    }
//
//    @Test
//    public void testArrayWithEqualHeights() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {4, 4, 4, 4, 4, 4, 4};
//        int result = ob.trap(height);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testArrayWithNegativeTrap() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {6, -2, 4, -3, 7, -5, 3};
//        int result = ob.trap(height);
//        assertEquals(16, result);
//    }
//
//    @Test
//    public void testArrayWithLargeHeights() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {100, 200, 300, 400, 500, 600};
//        int result = ob.trap(height);
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testArrayWithLargeTraps() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {4, 6, 8, 10, 12};
//        int result = ob.trap(height);
//        assertEquals(10, result);
//    }
//
//    @Test
//    public void testArrayWithNegativeHeights() {
//        TrappingRainWater ob = new TrappingRainWater();
//
//        int[] height = {-1, -2, -3, -4, -5};
//        assertThrows(IllegalArgumentException.class, () -> ob.trap(height));
//    }
//
//    @Test
//    public void testNullArray() {
//        TrappingRainWater ob = new TrappingRainWater();
//        int[] height = null;
//        assertThrows(NullPointerException.class, () -> ob.trap(height));
//    }
//}