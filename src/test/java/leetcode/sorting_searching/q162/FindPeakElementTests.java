//package leetcode.sorting_searching.q162;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.sorting_searching.q162.FindPeakElement;
//
//public class FindPeakElementTests {
//    @Test
//    public void testBasic() {
//        // Test input array with a single peak
//        FindPeakElement ob = new FindPeakElement();
//        int[] input1 = {1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2};
//        assertEquals(6, ob.findPeakElement(input1));
//
//        // Test input array with multiple peaks, should return the first peak
//        int[] input2 = {1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 5, 6, 7};
//        assertEquals(6, ob.findPeakElement(input2));
//
//        // Test input array with decreasing elements, should return the first element
//        int[] input3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        assertEquals(0, ob.findPeakElement(input3));
//
//        // Test input array with increasing elements, should return the last element
//        int[] input4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        assertEquals(9, ob.findPeakElement(input4));
//
//        // Test input array with two equal peaks, should return any one of them
//        int[] input5 = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1};
//        int result5 = ob.findPeakElement(input5);
//        assertTrue(result5 == 7 || result5 == 8);
//    }
//
//    @Test
//    public void testEmptyArray() {
//        // Test empty input array, should return -1 for no peak
//        FindPeakElement ob = new FindPeakElement();
//        int[] input = {};
//        assertEquals(-1, ob.findPeakElement(input));
//    }
//
//    @Test
//    public void testSingleElementArray() {
//        // Test input array with a single element, should return 0 as the peak
//        FindPeakElement ob = new FindPeakElement();
//        int[] input = {5};
//        assertEquals(0, ob.findPeakElement(input));
//    }
//
//    @Test
//    public void testPeakAtFirstAndLastElement() {
//        // Test input array with peak at first element
//        FindPeakElement ob = new FindPeakElement();
//        int[] input1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        assertEquals(0, ob.findPeakElement(input1));
//
//        // Test input array with peak at last element
//        int[] input2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        assertEquals(9, ob.findPeakElement(input2));
//    }
//
//    @Test
//    public void testEqualElementsArray() {
//        // Test input array with all equal elements, should return -1 for no peak
//        FindPeakElement ob = new FindPeakElement();
//        int[] input = {5, 5, 5, 5, 5, 5};
//        assertEquals(-1, ob.findPeakElement(input));
//    }
//}