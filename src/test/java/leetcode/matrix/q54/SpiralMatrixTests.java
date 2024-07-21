//package leetcode.matrix.q54;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import leetcode.matrix.q54.SpiralMatrix;
//
//public class SpiralMatrixTests {
//
//	private SpiralMatrix spiralMatrix;
//
//	@BeforeEach
//	public void setUp() {
//		spiralMatrix = new SpiralMatrix();
//	}
//
//	@Test
//    public void testEmptyMatrix() {
//        int[][] input = {};
//        int[] expected = {};
//        int[] actual = spiralMatrix.spiralOrder(input);
//        assertArrayEquals(expected, actual);
//    }
//
//	@Test
//    public void testSingleElementMatrix() {
//        int[][] input = {{1}};
//        int[] expected = {1};
//        int[] actual = spiralMatrix.spiralOrder(input);
//        assertArrayEquals(expected, actual);
//    }
//
//	@Test
//    public void testSingleRowMatrix() {
//        int[][] input = {{1,2,3,4}};
//        int[] expected = {1,2,3,4};
//        int[] actual = spiralMatrix.spiralOrder(input);
//        assertArrayEquals(expected, actual);
//    }
//
//	@Test
//    public void testSingleColumnMatrix() {
//        int[][] input = {
//        		{1},
//        		{2},
//        		{3},
//        		{4}
//        };
//        int[] expected = {1,2,3,4};
//        int[] actual = spiralMatrix.spiralOrder(input);
//        assertArrayEquals(expected, actual);
//    }
//
//	@Test
//    public void testSquareMatrix() {
//        int[][] input = {
//        		{1,2,3},
//        		{4,5,6},
//        		{7,8,9}
//        };
//        int[] expected = {1,2,3,6,9,8,7,4,5};
//        int[] actual = spiralMatrix.spiralOrder(input);
//        assertArrayEquals(expected, actual);
//    }
//
//	@Test
//    public void testRectangleMatrix() {
//        int[][] input = {
//        		{1,2,3,4},
//        		{5,6,7,8}
//        };
//        int[] expected = {1,2,3,4,8,7,6,5};
//        int[] actual = spiralMatrix.spiralOrder(input);
//        assertArrayEquals(expected, actual);
//    }
//
//	@Test
//    public void testMatrixWithDuplicateValues() {
//        int[][] input = {
//        		{1,2},
//        		{2,2}
//        };
//        int[] expected = {1,2,2,2};
//        int[] actual = spiralMatrix.spiralOrder(input);
//        assertArrayEquals(expected, actual);
//    }
//
//	@Test
//    public void testMatrixWithNegativeValues() {
//        int[][] input = {
//        		{-1,-2,-3},
//        		{-4,-5,-6},
//        		{-7,-8,-9}
//        };
//        int[] expected = {-1,-2,-3,-6,-9,-8,-7,-4,-5};
//        int[] actual = spiralMatrix.spiralOrder(input);
//        assertArrayEquals(expected, actual);
//    }
//
//	@Test
//    public void testMatrixWithAllNegativeValues() {
//        int[][] input = {
//        		{-1,-2,-3},
//        		{-4,-5,-6},
//        		{-7,-8,-9}
//        };
//        int[] expected = {-1,-2,-3,-6,-9,-8,-7,-4,-5};
//        int[] actual = spiralMatrix.spiralOrder(input);
//        assertArrayEquals(expected, actual);
//    }
//
//	@Test
//    public void testMatrixWithOnlyOneValue() {
//        int[][] input = {
//        		{-1}
//        };
//        int[] expected = {-1};
//        int[] actual = spiralMatrix.spiralOrder(input);
//        assertArrayEquals(expected, actual);
//    }
//
//	@Test
//    public void testMatrixWithMultipleEmptyRows() {
//        int[][] input = {
//        		{1,2},
//        		{},
//        		{7,8}
//        };
//        int[] expected = {1,2,8,7};
//        int[] actual = spiralMatrix.spiralOrder(input);
//        assertArrayEquals(expected, actual);
//    }
//
//}