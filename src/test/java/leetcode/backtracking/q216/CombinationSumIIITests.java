//package leetcode.backtracking.q216;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//
///**
// * Test class for CombinationSumIII class.
// */
//public class CombinationSumIIITests {
//
//    /**
//     * Test the case when k is 0. This should return an empty list.
//     */
//    @Test
//    public void testKZero() {
//        CombinationSumIII ob = new CombinationSumIII();
//        int k = 0;
//        int n = 5;
//        assertEquals(0, ob.combinationSum3(k, n).size());
//    }
//
//    /**
//     * Test the case when k is greater than n. This should return an empty list.
//     */
//    @Test
//    public void testKGreaterThanN() {
//        CombinationSumIII ob = new CombinationSumIII();
//        int k = 4;
//        int n = 2;
//        assertEquals(0, ob.combinationSum3(k, n).size());
//    }
//
//    /**
//     * Test the case when k is equal to n. This should return a list with one element: [1,2,3,4].
//     */
//    @Test
//    public void testKEqualToN() {
//        CombinationSumIII ob = new CombinationSumIII();
//        int k = 4;
//        int n = 4;
//        assertEquals(1, ob.combinationSum3(k, n).size());
//        assertEquals("[1,2,3,4]", ob.combinationSum3(k, n).toString());
//    }
//
//    /**
//     * Test the case when k is equal to 9 and n is equal to 45. This should return a list with one element: [1,2,3,4,5,6,7,8,9].
//     */
//    @Test
//    public void testKEqualToNineAndNEqualToFortyFive() {
//        CombinationSumIII ob = new CombinationSumIII();
//        int k = 9;
//        int n = 45;
//        assertEquals(1, ob.combinationSum3(k, n).size());
//        assertEquals("[1,2,3,4,5,6,7,8,9]", ob.combinationSum3(k, n).toString());
//    }
//
//    /**
//     * Test the case when k is equal to 3 and n is equal to 9. This should return a list with three elements: [1,2,6],[1,3,5],[2,3,4].
//     */
//    @Test
//    public void testKEqualToThreeAndNEqualToNine() {
//        CombinationSumIII ob = new CombinationSumIII();
//        int k = 3;
//        int n = 9;
//        assertEquals(3, ob.combinationSum3(k, n).size());
//        assertEquals("[1,2,6],[1,3,5],[2,3,4]", ob.combinationSum3(k, n).toString());
//    }
//
//    /**
//     * Test the case when k is equal to 4 and n is equal to 20. This should return a list with four elements: [1,2,8,9],[1,3,7,9],[2,4,7,8],[3,4,6,7].
//     */
//    @Test
//    public void testKEqualToFourAndNEqualToTwenty() {
//        CombinationSumIII ob = new CombinationSumIII();
//        int k = 4;
//        int n = 20;
//        assertEquals(4, ob.combinationSum3(k, n).size());
//        assertEquals("[1,2,8,9],[1,3,7,9],[2,4,7,8],[3,4,6,7]", ob.combinationSum3(k, n).toString());
//    }
//
//    /**
//     * Test the case when k is equal to 9 and n is equal to 45. This should return a list with 84 combinations.
//     */
//    @Test
//    public void testKEqualToNineAndNEqualToFortyFive() {
//        CombinationSumIII ob = new CombinationSumIII();
//        int k = 9;
//        int n = 45;
//        assertEquals(84, ob.combinationSum3(k, n).size());
//    }
//
//    /**
//     * Test the case when k is the maximum allowed value of 9 and n is equal to 45. This should return a list with 84 combinations.
//     */
//    @Test
//    public void testKMaxValueAndNEqualToFortyFive() {
//        CombinationSumIII ob = new CombinationSumIII();
//        int k = 9;
//        int n = 45;
//        assertEquals(84, ob.combinationSum3(k, n).size());
//    }
//
//    /**
//     * Test the case when k is equal to 8 and n is the maximum allowed value of 45. This should return a list with 28 combinations.
//     */
//    @Test
//    public void testKEqualToEightAndNMaxValue() {
//        CombinationSumIII ob = new CombinationSumIII();
//        int k = 8;
//        int n = 45;
//        assertEquals(28, ob.combinationSum3(k, n).size());
//    }
//}