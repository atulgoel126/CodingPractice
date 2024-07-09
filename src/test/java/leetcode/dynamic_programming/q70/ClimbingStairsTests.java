package leetcode.dynamic_programming.q70;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.dynamic_programming.q70.ClimbingStairs;

public class ClimbingStairsTests {

    @Test
    public void testStairsWithOneStep() {
        ClimbingStairs cs = new ClimbingStairs();
        assertEquals(1, cs.climbStairs(1));
    }

    @Test
    public void testStairsWithTwoSteps() {
        ClimbingStairs cs = new ClimbingStairs();
        assertEquals(2, cs.climbStairs(2));
    }

    @Test
    public void testStairsWithThreeSteps() {
        ClimbingStairs cs = new ClimbingStairs();
        assertEquals(3, cs.climbStairs(3));
    }

    @Test
    public void testStairsWithLargeNumber() {
        ClimbingStairs cs = new ClimbingStairs();
        assertEquals(1134903170, cs.climbStairs(45));
    }

    @Test
    public void testStairsWithNegativeNumber() {
        ClimbingStairs cs = new ClimbingStairs();
        assertEquals(0, cs.climbStairs(-1));
    }

    @Test
    public void testStairsWithZeroSteps() {
        ClimbingStairs cs = new ClimbingStairs();
        assertEquals(0, cs.climbStairs(0));
    }

//    @Test
//    public void testStairsWithOneStepAndLoop() {
//        ClimbingStairs cs = new ClimbingStairs();
//        assertEquals(1, cs.climbStairsWithLoop(1));
//    }
//
//    @Test
//    public void testStairsWithTwoStepsAndLoop() {
//        ClimbingStairs cs = new ClimbingStairs();
//        assertEquals(2, cs.climbStairsWithLoop(2));
//    }
//
//    @Test
//    public void testStairsWithThreeStepsAndLoop() {
//        ClimbingStairs cs = new ClimbingStairs();
//        assertEquals(3, cs.climbStairsWithLoop(3));
//    }
//
//    @Test
//    public void testStairsWithLargeNumberAndLoop() {
//        ClimbingStairs cs = new ClimbingStairs();
//        assertEquals(1134903170, cs.climbStairsWithLoop(45));
//    }
//
//    @Test
//    public void testStairsWithNegativeNumberAndLoop() {
//        ClimbingStairs cs = new ClimbingStairs();
//        assertEquals(0, cs.climbStairsWithLoop(-1));
//    }
//
//    @Test
//    public void testStairsWithZeroStepsAndLoop() {
//        ClimbingStairs cs = new ClimbingStairs();
//        assertEquals(0, cs.climbStairsWithLoop(0));
//    }
//
//    @Test
//    public void testLargeNumberOverflow() {
//        ClimbingStairs cs = new ClimbingStairs();
//        assertThrows(StackOverflowError.class, () -> cs.climbStairs(Integer.MAX_VALUE));
//    }
//
//    @Test
//    public void testInvalidInputForRecursiveSolution() {
//        ClimbingStairs cs = new ClimbingStairs();
//        assertThrows(IllegalArgumentException.class, () -> cs.climbStairsRecursive(-1));
//    }
//
//    @Test
//    public void testInvalidInputForLoopSolution() {
//        ClimbingStairs cs = new ClimbingStairs();
//        assertThrows(IllegalArgumentException.class, () -> cs.climbStairsWithLoop(-1));
//    }

}