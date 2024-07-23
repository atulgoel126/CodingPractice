package leetcode.matrix.q48;
public class RotateImage {
    public void rotate(int[][] matrix) {

        if (matrix == null || matrix.length <= 1|| matrix[0].length <= 1) {
            return;
        }

        // invert the matrix where matrix[i][j] -> matrix[j][i]
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j <= i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // invert the entire rows where rows[0] becomes rows[matrix.length - 1]
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                int temp = matrix[i][j];
                int replacementIndex = matrix.length - 1 - j;
                matrix[i][j] = matrix[i][replacementIndex];
                matrix[i][replacementIndex] = temp;
            }
        }
    }
}
