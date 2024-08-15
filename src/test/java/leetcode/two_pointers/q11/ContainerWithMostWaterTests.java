package leetcode.two_pointers.q11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ContainerWithMostWaterTests {
    @Test
    public void testValidInput() {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater ob = new ContainerWithMostWater();
        assertEquals(49, ob.maxArea(heights));
    }

    @Test
    public void testEmptyInput() {
    	int[] heights = {};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertEquals(0, ob.maxArea(heights));
    }

    @Test
    public void testSingleElementInput() {
    	int[] heights = {5};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertEquals(0, ob.maxArea(heights));
    }

    @Test
    public void testRepeatedInput() {
    	int[] heights = {1,1,1,1,1};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertEquals(4, ob.maxArea(heights));
    }

    @Test
    public void testIncreasingInput() {
    	int[] heights = {1,2,3,4,5,6,7,8,9};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertEquals(20, ob.maxArea(heights));
    }

    @Test
    public void testDecreasingInput() {
    	int[] heights = {9,8,7,6,5,4,3,2,1};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertEquals(20, ob.maxArea(heights));
    }

    @Test
    public void testInputWithZeroElements() {
    	int[] heights = {0,0,0,0,0};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertEquals(0, ob.maxArea(heights));
    }

    @Test
    public void testInputWithDuplicateMaxHeight() {
    	int[] heights = {2,3,4,5,6,7,8,9,9,9,9,9};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertEquals(42, ob.maxArea(heights));
    }

    @Test
    public void testInputWithOneNegativeAndOneZero() {
    	int[] heights = {-5,0};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertEquals(0, ob.maxArea(heights));
    }

    @Test
    public void testInputWithAllNegativeElements() {
    	int[] heights = {-1,-2,-3,-4,-5,-6,-7,-8,-9};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertEquals(0, ob.maxArea(heights));
    }

    @Test
    public void testInputWithLargeValues() {
    	int[] heights = {1000000,2000000,3000000,4000000,5000000,6000000,7000000,8000000,9000000};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertEquals(20000000, ob.maxArea(heights));
    }

    @Test
    public void testInputWithLargeNegativeValues() {
    	int[] heights = {-1000000,-2000000,-3000000,-4000000,-5000000,-6000000,-7000000,-8000000,-9000000};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertEquals(0, ob.maxArea(heights));
    }

    @Test
    public void testIncorrectOutput() {
    	int[] heights = {1,8,6,2,5,4,8,3,7};
    	ContainerWithMostWater ob = new ContainerWithMostWater();
    	assertNotEquals(40, ob.maxArea(heights));
    }
}