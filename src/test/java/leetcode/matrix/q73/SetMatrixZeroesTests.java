package leetcode.matrix.q73;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.matrix.q73.SetMatrixZeroes;

public class SetMatrixZeroesTests {
    
    @Test
    public void testEmptyMatrix() {
        int[][] matrix = {};
        int[][] expected = {};
        
        SetMatrixZeroes ob = new SetMatrixZeroes();
        ob.setZeroes(matrix);
        
        assertArrayEquals(expected, matrix);
    }
    
    @Test
    public void testSquareMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        int[][] expected = {{1, 0, 3}, {0, 0, 0}, {7, 0, 9}};
        
        SetMatrixZeroes ob = new SetMatrixZeroes();
        ob.setZeroes(matrix);
        
        assertArrayEquals(expected, matrix);
    }
    
    @Test
    public void testRectangularMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 0, 6}};
        int[][] expected = {{1, 0, 3}, {0, 0, 0}};
        
        SetMatrixZeroes ob = new SetMatrixZeroes();
        ob.setZeroes(matrix);
        
        assertArrayEquals(expected, matrix);
    }
    
    @Test
    public void testMatrixWithNoZeroes() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        SetMatrixZeroes ob = new SetMatrixZeroes();
        ob.setZeroes(matrix);
        
        assertArrayEquals(expected, matrix);
    }
    
    @Test
    public void testSingleElementMatrix() {
        int[][] matrix = {{0}};
        int[][] expected = {{0}};
        
        SetMatrixZeroes ob = new SetMatrixZeroes();
        ob.setZeroes(matrix);
        
        assertArrayEquals(expected, matrix);
    }
    
    @Test
    public void testMatrixWithAllZeroes() {
        int[][] matrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        
        SetMatrixZeroes ob = new SetMatrixZeroes();
        ob.setZeroes(matrix);
        
        assertArrayEquals(expected, matrix);
    }
    
    @Test
    public void testMatrixWithZeroesInFirstRowAndColumn() {
        int[][] matrix = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int[][] expected = {{0, 0, 0}, {0, 4, 5}, {0, 7, 8}};
        
        SetMatrixZeroes ob = new SetMatrixZeroes();
        ob.setZeroes(matrix);
        
        assertArrayEquals(expected, matrix);
    }
    
    @Test
    public void testMatrixWithZeroesInMiddleRowsAndColumns() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 0, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 0}};
        int[][] expected = {{1, 0, 3, 0}, {0, 0, 0, 0}, {8, 0, 10, 0}, {0, 0, 0, 0}};
        
        SetMatrixZeroes ob = new SetMatrixZeroes();
        ob.setZeroes(matrix);
        
        assertArrayEquals(expected, matrix);
    }
    
    @Test
    public void testMatrixWithNegativeNumbers() {
        int[][] matrix = {{1, -2, 3}, {-4, 0, 6}, {7, 8, -9}};
        int[][] expected = {{-4, 0, -9}, {0, 0, 0}, {-4, 0, -9}};
        
        SetMatrixZeroes ob = new SetMatrixZeroes();
        ob.setZeroes(matrix);
        
        assertArrayEquals(expected, matrix);
    }
    
    @Test
    public void testMatrixWithIntegerMaxValue() {
        int[][] matrix = {{1, Integer.MAX_VALUE, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, Integer.MAX_VALUE, 3}, {4, 5, 6}, {7, 8, 9}};
        
        SetMatrixZeroes ob = new SetMatrixZeroes();
        ob.setZeroes(matrix);
        
        assertArrayEquals(expected, matrix);
    }
    
    @Test
    public void testMatrixWithIntegerMinValue() {
        int[][] matrix = {{1, Integer.MIN_VALUE, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, Integer.MIN_VALUE, 3}, {4, 5, 6}, {7, 8, 9}};
        
        SetMatrixZeroes ob = new SetMatrixZeroes();
        ob.setZeroes(matrix);
        
        assertArrayEquals(expected, matrix);
    }
}