package leetcode.dynamic_programming.q198;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberTests {
    @Test
    public void testEmptyArray() {
        HouseRobber ob = new HouseRobber();
        assertEquals(0, ob.rob(new int[]{}));
    }

    @Test
    public void testSingleHouse() {
        HouseRobber ob = new HouseRobber();
        assertEquals(5, ob.rob(new int[]{5}));
    }

    @Test
    public void testTwoAdjacentHouses() {
        HouseRobber ob = new HouseRobber();
        assertEquals(6, ob.rob(new int[]{3, 3, 1, 3}));
    }

    @Test
    public void testTwoNonAdjacentHouses() {
        HouseRobber ob = new HouseRobber();
        assertEquals(7, ob.rob(new int[]{5, 2, 2}));
    }

    @Test
    public void testThreeHouses() {
        HouseRobber ob = new HouseRobber();
        assertEquals(3, ob.rob(new int[]{2, 3, 1}));
    }

    @Test
    public void testAllHousesRobbed() {
        HouseRobber ob = new HouseRobber();
        assertEquals(24, ob.rob(new int[]{5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void testNoHousesRobbed() {
        HouseRobber ob = new HouseRobber();
        assertEquals(0, ob.rob(new int[]{0, 0, 0}));
    }

    @Test
    public void testChallengingSequence() {
        HouseRobber ob = new HouseRobber();
        int[] houses = {0, 2, 7, 9, 3, 1, 5, 8, 4, 6, 10, 2, 1, 7, 3, 9};
        assertEquals(46, ob.rob(houses));
    }
}