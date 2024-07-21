//package leetcode.hashmap.q202;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.hashmap.q202.HappyNumber;
//
//public class HappyNumberTests {
//
//    /**
//     * Tests whether the isHappyNumber method correctly identifies happy numbers.
//     */
//    @Test
//    public void testIsHappyNumber() {
//        HappyNumber ob = new HappyNumber();
//
//        // Happy number: 19
//        assertTrue(ob.isHappyNumber(19));
//
//        // Happy number: 10
//        assertTrue(ob.isHappyNumber(10));
//
//        // Happy number: 7
//        assertTrue(ob.isHappyNumber(7));
//
//        // Happy number: 440
//        assertTrue(ob.isHappyNumber(440));
//    }
//
//    /**
//     * Tests whether the isHappyNumber method correctly identifies unhappy numbers.
//     * Includes edge cases and large numbers.
//     */
//    @Test
//    public void testIsNotHappyNumber() {
//        HappyNumber ob = new HappyNumber();
//
//        // Unhappy number: 0
//        assertFalse(ob.isHappyNumber(0));
//
//        // Unhappy number: 4
//        assertFalse(ob.isHappyNumber(4));
//
//        // Unhappy number: 100
//        assertFalse(ob.isHappyNumber(100));
//
//        // Unhappy number: 4999999
//        assertFalse(ob.isHappyNumber(4999999));
//    }
//
//    /**
//     * Tests whether the isHappyNumber method correctly handles negative numbers.
//     * Should throw an IllegalArgumentException.
//     */
//    @Test
//    public void testNegativeNumber() {
//        HappyNumber ob = new HappyNumber();
//
//        // Negative number: -7
//        assertThrows(IllegalArgumentException.class, () -> ob.isHappyNumber(-7));
//
//        // Negative number: -12
//        assertThrows(IllegalArgumentException.class, () -> ob.isHappyNumber(-12));
//    }
//
//    /**
//     * Tests whether the isHappyNumber method correctly handles max integer.
//     * Should throw an IllegalArgumentException.
//     */
//    @Test
//    public void testMaxInteger() {
//        HappyNumber ob = new HappyNumber();
//
//        // Max integer: Integer.MAX_VALUE (2147483647)
//        assertThrows(IllegalArgumentException.class, () -> ob.isHappyNumber(Integer.MAX_VALUE));
//    }
//}