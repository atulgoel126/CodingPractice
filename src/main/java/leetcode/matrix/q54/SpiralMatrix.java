package leetcode.matrix.q54;
public class SpiralMatrix {
    public int[] spiralOrder(int[][] input) {

        if (input.length == 0 || input[0].length == 0) {
            return new int[0];
        }

        Direction currentDirection = Direction.RIGHT;
        int i = 0;
        int j = 0;

        int n = input.length;
        int m = input[0].length;

        int leftEdge = 0;
        int rightEdge = m - 1;
        int topEdge = 0;
        int bottomEdge = n - 1;

        int[] result = new int[n * m];
        int index = 0;

        while (index < n * m) {
            result[index++] = input[i][j];

            if (currentDirection == Direction.RIGHT) {
                if (j < rightEdge) {
                    j++;
                } else {
                    currentDirection = Direction.DOWN;
                    topEdge++;
                    i++;
                }
            } else if (currentDirection == Direction.DOWN) {
                if (i < bottomEdge) {
                    i++;
                } else {
                    currentDirection = Direction.LEFT;
                    rightEdge--;
                    j--;
                }
            } else if (currentDirection == Direction.LEFT) {
                if (j > leftEdge) {
                    j--;
                } else {
                    currentDirection = Direction.UP;
                    bottomEdge--;
                    i--;
                }
            } else if (currentDirection == Direction.UP) {
                if (i > topEdge) {
                    i--;
                }  else {
                    currentDirection = Direction.RIGHT;
                    leftEdge++;
                    j++;
                }
            }
        }

        return result;
    }

    private enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
