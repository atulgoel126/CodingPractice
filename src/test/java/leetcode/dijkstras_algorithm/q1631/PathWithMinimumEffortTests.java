//package leetcode.dijkstras_algorithm.q1631;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import java.util.Arrays;
//import org.junit.jupiter.api.Test;
//import leetcode.dijkstras_algorithm.q1631.PathWithMinimumEffort;
//
//public class PathWithMinimumEffortTests {
//
//	PathWithMinimumEffort ob = new PathWithMinimumEffort();
//
//	@Test
//	public void testSimplePath() {
//		int[][] heights = {{1,2,2},{3,8,2},{5,3,5}};
//		int expected = 2;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithNegativeEdge() {
//		int[][] heights = {{1,2,-3},{-3,8,2},{5,-1,5}};
//		int expected = 8;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithAllNegativeEdges() {
//		int[][] heights = {{-1,-2,-3},{-4,-5,-6},{-7,-8,-9}};
//		int expected = 8;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testSingleElementMatrix() {
//		int[][] heights = {{5}};
//		int expected = 0;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testEmptyMatrix() {
//		int[][] heights = {};
//		int expected = 0;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testLargeMatrix() {
//		int[][] heights = {{8,7,9,5},{6,4,9,8},{3,5,6,9},{9,8,7,6}};
//		int expected = 3;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithZeroEffort() {
//		int[][] heights = {{1,2,3},{1,0,2},{2,1,3}};
//		int expected = 0;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithMaxEffort() {
//		int[][] heights = {{1,2,3},{1,8,2},{3,5,6}};
//		int expected = 9;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithAllEqualHeight() {
//		int[][] heights = {{4,4,4},{4,4,4},{4,4,4}};
//		int expected = 0;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithNegativeEffort() {
//		int[][] heights = {{-4,-3,-2},{-6,-5,-4},{-7,-4,-3}};
//		int expected = 5;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithLargeRangeOfValues() {
//		int[][] heights = {{3,200,6},{5,4,8},{9,0,2}};
//		int expected = 197;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithEqualEffort() {
//		int[][] heights = {{1,2,2},{2,3,1},{3,2,1}};
//		int expected = 0;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithMultiplePathsOfEqualEffort() {
//		int[][] heights = {{1,2,3,4},{2,2,3,6},{2,3,3,4},{3,4,5,6}};
//		int expected = 1;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithStaircasePattern() {
//		int[][] heights = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//		int expected = 2;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithEmptyRows() {
//		int[][] heights = {{1,2,3}, {}, {4,5,6}, {}};
//		int expected = 0;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithEmptyColumns() {
//		int[][] heights = {{1,2,3}, {4}, {5,6}, {7}};
//		int expected = 0;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testEmptyPath() {
//		int[][] heights = {{}};
//		int expected = 0;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//
//	@Test
//	public void testPathWithNullMatrix() {
//		int[][] heights = null;
//		int expected = 0;
//		assertEquals(expected, ob.minimumEffortPath(heights));
//	}
//}