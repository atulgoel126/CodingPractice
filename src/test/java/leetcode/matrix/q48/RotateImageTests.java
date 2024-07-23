package leetcode.matrix.q48;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RotateImageTests {

    private RotateImage ob;

    @BeforeEach
    public void setUp() {
        ob = new RotateImage();
    }

    @Test
    public void testEmptyMatrix() {
        int[][] matrix = {};
        ob.rotate(matrix);
        int[][] expected = {};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testSingleElementMatrix() {
        int[][] matrix = {{1}};
        ob.rotate(matrix);
        int[][] expected = {{1}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testOddSizeMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ob.rotate(matrix);
        int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testEvenSizeMatrix() {
        int[][] matrix = {{1, 2}, {3, 4}};
        ob.rotate(matrix);
        int[][] expected = {{3, 1}, {4, 2}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testLargeSizeMatrix() {
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        ob.rotate(matrix);
        int[][] expected = {{21, 16, 11, 6, 1}, {22, 17, 12, 7, 2}, {23, 18, 13, 8, 3}, {24, 19, 14, 9, 4}, {25, 20, 15, 10, 5}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testMatrixWithDuplicateElements() {
        int[][] matrix = {{1, 1, 3}, {4, 5, 6}, {7, 8, 9}};
        ob.rotate(matrix);
        int[][] expected = {{7, 4, 1}, {8, 5, 1}, {9, 6, 3}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testMatrixWithNegativeElements() {
        int[][] matrix = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        ob.rotate(matrix);
        int[][] expected = {{-7, -4, -1}, {-8, -5, -2}, {-9, -6, -3}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testMatrixWithZeroElements() {
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        ob.rotate(matrix);
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertArrayEquals(expected, matrix);
    }

    @Test
    public void testMatrixWithMixedElements() {
        int[][] matrix = {{1, -2, 3}, {4, 0, -6}, {7, 8, 0}};
        ob.rotate(matrix);
        int[][] expected = {{7, 4, 1}, {8, 0, -2}, {0, -6, 3}};
        assertArrayEquals(expected, matrix);
    }
}