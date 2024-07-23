package leetcode.matrix.q36;
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }

        if (board.length != 9 || board[0].length != 9) {
            return false;
        }

        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] subgrids = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '1';
                int subgridIndex = getSubgridIndex(i, j);
                if (rows[i][num] || cols[j][num] || subgrids[subgridIndex][num]) {
                    return false;
                }
                rows[i][num] = true;
                cols[j][num] = true;
                subgrids[subgridIndex][num] = true;
            }
        }
        return true;
    }

    private int getSubgridIndex(int i, int j) {
        return ((i / 3) * 3) + (j / 3);
    }
}
