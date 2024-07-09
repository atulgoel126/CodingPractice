package leetcode.misc_questions.q200;
public class NumberOfIslands {
    private static final char LAND = '1';
    private static final char WATER = '0';

    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == LAND) {
                    counter++;
                    markNeighbors(grid, i, j);
                }
            }
        }
        return counter;
    }

    private static void markNeighbors(char[][] grid, int row, int column) {

        if (row < 0 || column < 0) {
            return;
        }
        if (row >= grid.length || column >= grid[0].length) {
            return;
        }
        if (grid[row][column] == WATER) {
            return;
        }
        grid[row][column] = WATER;
        markNeighbors(grid, row + 1, column);
        markNeighbors(grid, row, column + 1);
        markNeighbors(grid, row - 1, column);
        markNeighbors(grid, row, column - 1);
    }
}
