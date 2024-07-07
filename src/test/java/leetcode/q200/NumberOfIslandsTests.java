package leetcode.q200;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfIslandsTests {

    @Test
    public void testEmptyGrid() {
        NumberOfIslands solution = new NumberOfIslands();
        char[][] grid = {};
        assertEquals(0, solution.numIslands(grid));
    }

    @Test
    public void testNullGrid() {
        NumberOfIslands solution = new NumberOfIslands();
        char[][] grid = null;
        assertEquals(0, solution.numIslands(grid));
    }

    @Test
    public void testSingleElementGrid() {
        NumberOfIslands solution = new NumberOfIslands();
        char[][] grid1 = {{'1'}};
        assertEquals(1, solution.numIslands(grid1));
        char[][] grid2 = {{'0'}};
        assertEquals(0, solution.numIslands(grid2));
    }

    @Test
    public void testSmallGrid() {
        NumberOfIslands solution = new NumberOfIslands();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, solution.numIslands(grid));
    }

    @Test
    public void testLargeGrid() {
        NumberOfIslands solution = new NumberOfIslands();
        char[][] grid = new char[1000][1000];
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    grid[i][j] = '1';
                } else {
                    grid[i][j] = '0';
                }
            }
        }
        assertEquals(250000, solution.numIslands(grid));
    }

    @Test
    public void testComplexGrid() {
        NumberOfIslands solution = new NumberOfIslands();
        char[][] grid = {
                {'1', '1', '0', '0', '0', '1'},
                {'1', '0', '0', '1', '1', '1'},
                {'0', '0', '1', '1', '0', '0'},
                {'1', '1', '0', '1', '0', '1'},
                {'0', '1', '1', '0', '1', '0'}
        };
        assertEquals(5, solution.numIslands(grid));
    }

    @Test
    public void testEdgeCases() {
        NumberOfIslands solution = new NumberOfIslands();
        char[][] grid1 = {
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'}
        };
        assertEquals(1, solution.numIslands(grid1));

        char[][] grid2 = {
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(0, solution.numIslands(grid2));
    }

    @Test
    public void testPerformance() {
        NumberOfIslands solution = new NumberOfIslands();
        int n = 2000;
        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = (i + j) % 2 == 0 ? '1' : '0';
            }
        }

        long startTime = System.nanoTime();
        int result = solution.numIslands(grid);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000; // convert to milliseconds

        System.out.println("NumberOfIslandsTests Performance test duration: " + duration + " ms");
        assertEquals(2000000, result); // Expecting 2,000,000 islands
    }
}
