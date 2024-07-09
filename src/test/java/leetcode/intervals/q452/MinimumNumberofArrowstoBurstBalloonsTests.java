package leetcode.intervals.q452;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.intervals.q452.MinimumNumberofArrowstoBurstBalloons;

public class MinimumNumberofArrowstoBurstBalloonsTests {
    @Test
    public void testNoBalloons() {
        int[][] balloons = {};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 0;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
    
    @Test
    public void testOneBalloon() {
        int[][] balloons = {{2,3}};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 1;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
    
    @Test
    public void testSameEndPoints() {
        int[][] balloons = {{1,1},{2,2},{3,3}};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 3;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
    
    @Test
    public void testAllOverlapping() {
        int[][] balloons = {{1,5},{2,4},{3,3}};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 1;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
    
    @Test
    public void testNoOverlapping() {
        int[][] balloons = {{1,5},{6,10},{11,15}};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 3;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
    
    @Test
    public void testEmptyInterval() {
        int[][] balloons = {{1,4},{5,6},{8,12},{9,10},{13,15}};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 5;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
    
    @Test
    public void testNegativeCoordinates() {
        int[][] balloons = {{-3,-1},{-2,-1},{-1,3},{0,2},{1,6}};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 3;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
    
    @Test
    public void testLargeCoordinates() {
        int[][] balloons = {{999999999,1000000000},{1000000001,1000000002},{1000000003,1000000004},{1000000005,1000000006},{1000000007,1000000008}};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 5;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
    
    @Test
    public void testUnsortedIntervals() {
        int[][] balloons = {{10,16},{2,8},{1,6},{7,12}};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 2;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
    
    @Test
    public void testNegativeIntervalLength() {
        int[][] balloons = {{9,7},{6,8},{6,9},{3,9},{9,4}};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 3;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
    
    @Test
    public void testOverlappingAndEmptyIntervals() {
        int[][] balloons = {{2,6},{1,4},{7,9},{12,14}};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 2;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
    
    @Test
    public void testInvalidCoordinates() {
        int[][] balloons = {{-1,-3},{6,8},{10,5},{9,12}};
        MinimumNumberofArrowstoBurstBalloons ob = new MinimumNumberofArrowstoBurstBalloons();
        int expected = 2;
        int result = ob.findMinArrowShots(balloons);
        assertEquals(expected, result);
    }
}