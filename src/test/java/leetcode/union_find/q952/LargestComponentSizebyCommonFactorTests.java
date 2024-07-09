package leetcode.union_find.q952;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.union_find.q952.LargestComponentSizebyCommonFactor;

public class LargestComponentSizebyCommonFactorTests {

    /**
     * Tests that the largest component size is correctly calculated for a valid input.
     */
    @Test
    public void testValidInput() {
        int[] A = {4,6,15,35};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(4, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated for an input with duplicate elements.
     */
    @Test
    public void testDuplicateElements() {
        int[] A = {2,2,3,4,4,6,6};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(6, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated for an input with negative numbers.
     */
    @Test
    public void testNegativeNumbers() {
        int[] A = {-2,3,4,5,-10,12};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(5, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated for an input with only one element.
     */
    @Test
    public void testSingleElement() {
        int[] A = {5};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(1, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated for an empty input.
     */
    @Test
    public void testEmptyInput() {
        int[] A = {};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(0, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated for an input with all numbers being the same.
     */
    @Test
    public void testAllSameNumbers() {
        int[] A = {6,6,6,6,6};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(5, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated for an input with a mix of positive and negative numbers.
     */
    @Test
    public void testMixOfPositiveAndNegativeNumbers() {
        int[] A = {2,3,4,-5,-6,-2,6};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(6, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated for an input with a very large number.
     */
    @Test
    public void testLargeNumber() {
        int[] A = {2,3,4,5,6,10000000};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(6, ob.largestComponentSize(A));
    }

    /**
     * Tests that the largest component size is correctly calculated when all numbers are co-prime.
     */
    @Test
    public void testCoprimeNumbers() {
        int[] A = {3,5,7,9,11};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(1, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated when all numbers have a common factor greater than 1.
     */
    @Test
    public void testNumbersWithCommonFactor() {
        int[] A = {10,20,30,40};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(4, ob.largestComponentSize(A));
    }
    
     /**
     * Tests that the largest component size is correctly calculated when the input contains 0.
     */
    @Test
    public void testInputWithZero() {
        int[] A = {0,2,4,6,0};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(5, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated when the input contains 1.
     */
    @Test
    public void testInputWithOne() {
        int[] A = {1,2,3,4,5,6};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(6, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated when the input contains both 0 and 1.
     */
    @Test
    public void testInputWithZeroAndOne() {
        int[] A = {1,0,2,0,3,4};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(6, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated when the input contains only 0s and 1s.
     */
    @Test
    public void testInputWithOnlyZeroesAndOnes() {
        int[] A = {0,1,0,1,0,1};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(6, ob.largestComponentSize(A));
    }
    
    /**
     * Tests that the largest component size is correctly calculated when the input contains a mix of numbers and non-numbers.
     */
    @Test
    public void testMixOfNumbersAndNonNumbers() {
        int[] A = {3,4,5,6,7,8,9};
        LargestComponentSizebyCommonFactor ob = new LargestComponentSizebyCommonFactor();
        assertEquals(1, ob.largestComponentSize(A));
    }
    
}