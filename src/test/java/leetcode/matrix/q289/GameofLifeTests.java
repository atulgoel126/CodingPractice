//package leetcode.matrix.q289;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.matrix.q289.GameofLife;
//
//public class GameofLifeTests {
//    @Test
//    public void testSingleCellAlive() {
//        //Initial state
//        int[][] board = {{1}};
//
//        //Expected result after one iteration
//        int[][] expected = {{0}};
//
//        GameofLife game = new GameofLife();
//
//        //Perform one iteration
//        game.gameOfLife(board);
//
//        //Check if expected result is achieved
//        assertArrayEquals(expected, board);
//    }
//
//    @Test
//    public void testSingleCellDead() {
//        //Initial state
//        int[][] board = {{0}};
//
//        //Expected result after one iteration
//        int[][] expected = {{0}};
//
//        GameofLife game = new GameofLife();
//
//        //Perform one iteration
//        game.gameOfLife(board);
//
//        //Check if expected result is achieved
//        assertArrayEquals(expected, board);
//    }
//
//    @Test
//    public void testAllCellsDead() {
//        //Initial state
//        int[][] board = {
//                {0, 0, 0},
//                {0, 0, 0},
//                {0, 0, 0}
//        };
//
//        //Expected result after one iteration
//        int[][] expected = {
//                {0, 0, 0},
//                {0, 0, 0},
//                {0, 0, 0}
//        };
//
//        GameofLife game = new GameofLife();
//
//        //Perform one iteration
//        game.gameOfLife(board);
//
//        //Check if expected result is achieved
//        assertArrayEquals(expected, board);
//    }
//
//    @Test
//    public void testAllCellsAlive() {
//        //Initial state
//        int[][] board = {
//                {1, 1, 1},
//                {1, 1, 1},
//                {1, 1, 1}
//        };
//
//        //Expected result after one iteration
//        int[][] expected = {
//                {1, 0, 1},
//                {0, 0, 0},
//                {1, 0, 1}
//        };
//
//        GameofLife game = new GameofLife();
//
//        //Perform one iteration
//        game.gameOfLife(board);
//
//        //Check if expected result is achieved
//        assertArrayEquals(expected, board);
//    }
//
//    @Test
//    public void testMixedCells() {
//        //Initial state
//        int[][] board = {
//                {1, 1, 1},
//                {0, 1, 0},
//                {0, 1, 0}
//        };
//
//        //Expected result after one iteration
//        int[][] expected = {
//                {1, 1, 1},
//                {1, 0, 1},
//                {1, 0, 1}
//        };
//
//        GameofLife game = new GameofLife();
//
//        //Perform one iteration
//        game.gameOfLife(board);
//
//        //Check if expected result is achieved
//        assertArrayEquals(expected, board);
//    }
//
//    @Test
//    public void testEdgeCases() {
//        //Initial state
//        int[][] board = {
//                {1, 0, 0},
//                {0, 0, 1},
//                {0, 1, 1}
//        };
//
//        //Expected result after one iteration
//        int[][] expected = {
//                {0, 1, 0},
//                {1, 0, 0},
//                {1, 0, 1}
//        };
//
//        GameofLife game = new GameofLife();
//
//        //Perform one iteration
//        game.gameOfLife(board);
//
//        //Check if expected result is achieved
//        assertArrayEquals(expected, board);
//    }
//
//    @Test
//    public void testEmptyBoard() {
//        //Initial state
//        int[][] board = {};
//
//        //Expected result after one iteration
//        int[][] expected = {};
//
//        GameofLife game = new GameofLife();
//
//        //Perform one iteration
//        game.gameOfLife(board);
//
//        //Check if expected result is achieved
//        assertArrayEquals(expected, board);
//    }
//
//    @Test
//    public void testNullBoard() {
//
//        GameofLife game = new GameofLife();
//
//        //Perform one iteration
//        game.gameOfLife(null);
//
//        //Check if expected result is achieved
//        assertNull(null);
//    }
//}