//package leetcode.heap_priority_queue.q846;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.heap_priority_queue.q846.HandofStraights;
//
//public class HandofStraightsTests {
//    @Test
//    public void testValidHand() {
//        // Create a new instance of HandofStraights and test with a valid hand of cards
//        HandofStraights ob = new HandofStraights();
//        int[] hand = {1,2,3,4,5,6};
//        int w = 2; // width of each set
//        assertTrue(ob.isNStraightHand(hand, w), "The hand is valid and should return true.");
//    }
//
//    @Test
//    public void testInvalidHand() {
//        // Create a new instance of HandofStraights and test with an invalid hand of cards
//        HandofStraights ob = new HandofStraights();
//        int[] hand = {1,2,3,4,5,7};
//        int w = 2; // width of each set
//        assertFalse(ob.isNStraightHand(hand, w), "The hand is not valid and should return false.");
//    }
//
//    @Test
//    public void testEmptyHand() {
//        // Create a new instance of HandofStraights and test with an empty hand of cards
//        HandofStraights ob = new HandofStraights();
//        int[] hand = {};
//        int w = 2; // width of each set
//        assertFalse(ob.isNStraightHand(hand, w), "The hand is empty and should return false.");
//    }
//
//    @Test
//    public void testSingleCardHand() {
//        // Create a new instance of HandofStraights and test with a hand of only one card
//        HandofStraights ob = new HandofStraights();
//        int[] hand = {1};
//        int w = 2; // width of each set
//        assertFalse(ob.isNStraightHand(hand, w), "The hand has only one card and should return false.");
//    }
//
//    @Test
//    public void testInvalidWidth() {
//        // Create a new instance of HandofStraights and test with an invalid width
//        HandofStraights ob = new HandofStraights();
//        int[] hand = {1,2,3,4,5,6};
//        int w = 3; // invalid width because there are only even numbers in the hand
//        assertFalse(ob.isNStraightHand(hand, w), "The width is invalid and should return false.");
//    }
//
//    @Test
//    public void testNegativeNumbers() {
//        // Create a new instance of HandofStraights and test with a hand of negative numbers
//        HandofStraights ob = new HandofStraights();
//        int[] hand = {-1,-2,-3,-4,-5,-6};
//        int w = 2; // width of each set
//        assertFalse(ob.isNStraightHand(hand, w), "The hand has negative numbers and should return false.");
//    }
//
//    @Test
//    public void testRepeatedCards() {
//        // Create a new instance of HandofStraights and test with a hand of repeated cards
//        HandofStraights ob = new HandofStraights();
//        int[] hand = {1,1,2,2,3,3};
//        int w = 2; // width of each set
//        assertFalse(ob.isNStraightHand(hand, w), "The hand has repeated cards and should return false.");
//    }
//
//    @Test
//    public void testLargeNumbers() {
//        // Create a new instance of HandofStraights and test with a hand of large numbers
//        HandofStraights ob = new HandofStraights();
//        int[] hand = {100000,200000,300000,400000,500000};
//        int w = 2; // width of each set
//        assertTrue(ob.isNStraightHand(hand, w), "The hand has large numbers and should still return true.");
//    }
//
//    @Test
//    public void testMixedNumbers() {
//        // Create a new instance of HandofStraights and test with a hand of mixed numbers
//        HandofStraights ob = new HandofStraights();
//        int[] hand = {1,-2,3,4,-5,6};
//        int w = 2; // width of each set
//        assertFalse(ob.isNStraightHand(hand, w), "The hand has mixed numbers and should return false.");
//    }
//}