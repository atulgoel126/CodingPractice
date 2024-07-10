import leetcode.array_string.q27.RemoveElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTests {
//    1. Test case for empty array input
    @Test
    public void testEmptyArrayInput() {
        int[] arr = new int[0];
        RemoveElement ob = new RemoveElement();
        int result = ob.removeElement(arr, 3);
        assertEquals(0, result);
    }

//2. Test case for removing element that does not exist in the array
    @Test
    public void testRemoveNonexistentElement() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        RemoveElement ob = new RemoveElement();
        int result = ob.removeElement(arr, 6);
        assertEquals(5, result);
    }

//3. Test case for removing all elements in the array
    @Test
    public void testRemoveAllElements() {
        int[] arr = new int[]{5, 5, 5, 5, 5};
        RemoveElement ob = new RemoveElement();
        int result = ob.removeElement(arr, 5);
        assertEquals(0, result);
    }

//4. Test case for removing element at index 0
    @Test
    public void testRemoveFirstElement() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        RemoveElement ob = new RemoveElement();
        int result = ob.removeElement(arr, 1);
        assertEquals(4, result);
    }

//5. Test case for removing element at the last index
    @Test
    public void testRemoveLastElement() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        RemoveElement ob = new RemoveElement();
        int result = ob.removeElement(arr, 5);
        assertEquals(4, result);
    }

//6. Test case for removing multiple instances of the element
    @Test
    public void testRemoveMultipleElements() {
        int[] arr = new int[]{1, 2, 3, 3, 5, 3, 7};
        RemoveElement ob = new RemoveElement();
        int result = ob.removeElement(arr, 3);
        assertEquals(4, result);
    }

//7. Test case for removing element from an array with duplicates
    @Test
    public void testRemoveElementWithDuplicates() {
        int[] arr = new int[]{1, 1, 2, 3, 3, 4, 5};
        RemoveElement ob = new RemoveElement();
        int result = ob.removeElement(arr, 3);
        assertEquals(5, result);
    }

//8. Test case for removing element from a large array
    @Test
    public void testRemoveElementFromLargeArray() {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        RemoveElement ob = new RemoveElement();
        int result = ob.removeElement(arr, 5000);
        assertEquals(9999, result);
    }

//9. Test case for removing element from an array with negative numbers
    @Test
    public void testRemoveElementWithNegativeNumbers() {
        int[] arr = new int[]{-1, 2, -6, 0, 5, -3, 7};
        RemoveElement ob = new RemoveElement();
        int result = ob.removeElement(arr, -6);
        assertEquals(6, result);
    }
}