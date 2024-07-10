package leetcode.array_string.q80;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.array_string.q80.RemoveDuplicatesfromSortedArrayII;

public class RemoveDuplicatesfromSortedArrayIITests {
    
    @Test
    public void testEmptyArray() {
        int[] input = new int[0];
        int expectedLength = 0;
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testNoDuplicates() {
        int[] input = {1, 2, 3, 4};
        int expectedLength = input.length;
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testAllDuplicates() {
        int[] input = {1, 1, 1, 1};
        int expectedLength = 2; //since we are allowing maximum 2 duplicates
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testDuplicatesAtEnd() {
        int[] input = {1, 2, 3, 3, 3, 4};
        int expectedLength = 5; //since 3 is allowed only twice
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testDuplicatesAtStart() {
        int[] input = {1, 1, 1, 2, 3, 4};
        int expectedLength = 4; //since 1 is allowed only twice
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testDuplicatesInMiddle() {
        int[] input = {1, 2, 3, 3, 3, 4, 4};
        int expectedLength = 6; //since both 3 and 4 are allowed only twice
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testNegatives() {
        int[] input = {-1, -1, 0, 0, 1, 2, 3};
        int expectedLength = 5; //since -1 and 0 are allowed only twice
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testMixed() {
        int[] input = {1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 8, 8, 9};
        int expectedLength = 11; //since 1 and 4 are allowed only twice
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testExtremeCase() {
        int[] input = {Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        int expectedLength = 3; //since Integer.MAX_VALUE is allowed only twice
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testNegativeLength() {
        int[] input = {-3, -2, -1, 0};
        int expectedLength = -1; //since length cannot be negative
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testNullInput() {
        int[] input = null;
        int expectedLength = -1; //since input is null
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
    @Test
    public void testDuplicatesEqualAllowedCount() {
        int[] input = {1, 1, 1, 2, 2, 2, 3, 3, 3};
        int expectedLength = 9; //since all duplicates are allowed exactly twice
        
        RemoveDuplicatesfromSortedArrayII ob = new RemoveDuplicatesfromSortedArrayII();
        int actualLength = ob.removeDuplicates(input);
        
        assertEquals(expectedLength, actualLength);
    }
    
}