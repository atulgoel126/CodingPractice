import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import leetcode.array_string.q135.Candy;

public class CandyTests {
//
//    private Candy candy;
//
//    @BeforeEach
//    public void setUp() {
//        candy = new Candy();
//    }
//
//    @Test
//    public void testEmptyInput() {
//        assertEquals(0, candy.candy(new int[] {}));
//    }
//
//    @Test
//    public void testSingleInput() {
//        assertEquals(1, candy.candy(new int[] { 1 }));
//    }
//
//    @Test
//    public void testSameRatings() {
//        assertEquals(3, candy.candy(new int[] { 1, 1, 1 }));
//    }
//
//    @Test
//    public void testAscendingRatings() {
//        assertEquals(6, candy.candy(new int[] { 1, 2, 3 }));
//    }
//
//    @Test
//    public void testDescendingRatings() {
//        assertEquals(6, candy.candy(new int[] { 3, 2, 1 }));
//    }
//
//    @Test
//    public void testEqualMiddleRatings() {
//        assertEquals(6, candy.candy(new int[] { 1, 2, 2, 2, 3, 4 }));
//    }
//
//    @Test
//    public void testEqualFirstAndLastRatings() {
//        assertEquals(7, candy.candy(new int[] { 3, 2, 2, 2, 3, 4 }));
//    }
//
//    @Test
//    public void testEqualFirstAndLastRatingsWithMoreUnequalRatings() {
//        assertEquals(10, candy.candy(new int[] { 5, 6, 3, 4, 3, 3, 2, 2, 3, 2, 5, 6, 6, 7, 1 }));
//    }
//
//    @Test
//    public void testEqualFirstAndLastRatingsWithOnlyTwoUnequalRatings() {
//        assertEquals(8, candy.candy(new int[] { 3, 2, 2, 2, 2, 2, 3 }));
//    }
//
//    @Test
//    public void testNegativeRatings() {
//        assertEquals(13, candy.candy(new int[] { -6, 5, -7, -5, 6, 2, 6, -4 }));
//    }
//
//    @Test
//    public void testRepeatedNegativeRatings() {
//        assertEquals(20, candy.candy(new int[] { -4, -4, -4, -4, -4, -4, -4, -4, -2, -1, 0, 1, 2, 4, 5, -3, -5 }));
//    }
//
//    @Test
//    public void testLargeInput() {
//        int[] ratings = new int[10000];
//        for (int i = 0; i < ratings.length; i++) {
//            ratings[i] = i * 2;
//        }
//
//        assertEquals(49995000, candy.candy(ratings));
//    }
}