package leetcode.graph_algorithms.q417;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.graph_algorithms.q417.PacificAtlanticWaterFlow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlowTests {
    @Test
    public void testSinglePointGrid() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = {{1}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,0));
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test single point grid
    }

    @Test
    public void testEmptyGrid() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = {};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test empty grid
    }
    
    @Test
    public void testGridWithOnlyOneRow() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = {{1,2,3,4,5}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,0));
        expected.add(Arrays.asList(0,1));
        expected.add(Arrays.asList(0,2));
        expected.add(Arrays.asList(0,3));
        expected.add(Arrays.asList(0,4));
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test grid with only one row
    }
    
    @Test
    public void testGridWithOnlyOneColumn() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = {{1},{2},{3},{4},{5}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,0));
        expected.add(Arrays.asList(1,0));
        expected.add(Arrays.asList(2,0));
        expected.add(Arrays.asList(3,0));
        expected.add(Arrays.asList(4,0));
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test grid with only one column
    }
    
    @Test
    public void testGridWithEqualPacificAtlanticPoints() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = {{5,5,5},{5,5,5},{5,5,5}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,0));
        expected.add(Arrays.asList(0,1));
        expected.add(Arrays.asList(0,2));
        expected.add(Arrays.asList(1,0));
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList(2,0));
        expected.add(Arrays.asList(2,1));
        expected.add(Arrays.asList(2,2));
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test grid with equal pacific and atlantic points
    }
    
    @Test
    public void testGridWithOneOuterRing() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = {{1,2,3,4,5},{6,7,8,9,6},{5,4,3,2,1}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,0));
        expected.add(Arrays.asList(0,1));
        expected.add(Arrays.asList(0,2));
        expected.add(Arrays.asList(0,3));
        expected.add(Arrays.asList(0,4));
        expected.add(Arrays.asList(1,0));
        expected.add(Arrays.asList(1,4));
        expected.add(Arrays.asList(2,0));
        expected.add(Arrays.asList(2,4));
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test grid with one outer ring (all points on the ring can reach both oceans)
    }
    
    @Test
    public void testGridWithOneInnerRing() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = {{1,2,3,4,5,6,7,8,9},
                        {2,2,2,2,2,2,2,2,2},
                        {9,8,7,6,5,4,3,2,1}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1,1));
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList(1,3));
        expected.add(Arrays.asList(1,4));
        expected.add(Arrays.asList(1,5));
        expected.add(Arrays.asList(1,6));
        expected.add(Arrays.asList(1,7));
        expected.add(Arrays.asList(1,8));
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test grid with one inner ring (all points on the inner ring can reach both oceans)
    }
    
    @Test
    public void testGridWithNoWaterFlowing() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = {{9,8,7,6,5},{9,9,7,6,6},{9,8,7,6,5}};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test grid with no water flowing
    }

    @Test
    public void testValidInputsOfDifferentSizes() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid1 = {{1,2,3},{2,3,4},{3,4,5}};
        int[][] grid2 = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};
        int[][] grid3 = {{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7},{4,5,6,7,8}};
        int[][] grid4 = {{1,2,3,4,5,6},{2,3,4,5,6,7},{3,4,5,6,7,8},{4,5,6,7,8,9}};
        List<List<Integer>> output1 = ob.pacificAtlantic(grid1);
        List<List<Integer>> output2 = ob.pacificAtlantic(grid2);
        List<List<Integer>> output3 = ob.pacificAtlantic(grid3);
        List<List<Integer>> output4 = ob.pacificAtlantic(grid4);
        // assert that the output is not null
        assertNotNull(output1);
        assertNotNull(output2);
        assertNotNull(output3);
        assertNotNull(output4);
        // assert that the outputs for different grid sizes are not the same
        assertNotEquals(output1, output2);
        assertNotEquals(output2, output3);
        assertNotEquals(output3, output4);
    }
    
    @Test
    public void testNullInput() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = null;
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test null input
    }
    
    @Test
    public void testGridWithNegativeValues() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = {{-1,2,3},{4,3,-2},{5,6,-10}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,0));
        expected.add(Arrays.asList(0,1));
        expected.add(Arrays.asList(1,0));
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test grid with negative values
    }
    
    @Test
    public void testGridWithLargeValues() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = {{1000,2000,3000},{4000,5000,6000},{7000,8000,9000}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,0));
        expected.add(Arrays.asList(1,0));
        expected.add(Arrays.asList(1,1));
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList(2,1));
        expected.add(Arrays.asList(2,2));
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test grid with large values
    }
    
    @Test
    public void testGridWithFloatingPointNumbers() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        double[][] grid = {{1.5,2.3,3.7},{2.6,3.1,4.9},{3.4,4.2,5.8}};
        // cast double array to int array
        int[][] intGrid = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                intGrid[i][j] = (int)grid[i][j];
            }
        }
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,0));
        expected.add(Arrays.asList(0,1));
        expected.add(Arrays.asList(0,2));
        expected.add(Arrays.asList(1,0));
        expected.add(Arrays.asList(1,1));
        expected.add(Arrays.asList(1,2));
        expected.add(Arrays.asList(2,1));
        expected.add(Arrays.asList(2,2));
        List<List<Integer>> output = ob.pacificAtlantic(intGrid);
        assertEquals(expected, output); // test grid with floating point numbers
    }
    
    @Test
    public void testGridWithRandomValues() {
        PacificAtlanticWaterFlow ob = new PacificAtlanticWaterFlow();
        int[][] grid = {{1,5,3,8,9,2,4},
                        {4,2,6,7,1,3,8},
                        {8,3,1,5,9,7,6},
                        {4,6,2,9,8,1,3},
                        {2,6,7,4,1,3,5}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(0,0));
        expected.add(Arrays.asList(1,4));
        expected.add(Arrays.asList(2,4));
        expected.add(Arrays.asList(3,1));
        expected.add(Arrays.asList(3,3));
        expected.add(Arrays.asList(3,6));
        expected.add(Arrays.asList(4,3));
        expected.add(Arrays.asList(4,5));
        List<List<Integer>> output = ob.pacificAtlantic(grid);
        assertEquals(expected, output); // test grid with random values
    }
}