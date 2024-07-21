//package leetcode.union_find.q684;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.union_find.q684.RedundantConnection;
//
//public class RedundantConnectionTests {
//    @Test
//    public void testFindRedundantConnection1() {
//        int[][] edges = {{1,2},{1,3},{2,3}};
//        int[] expected = {2,3};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindRedundantConnection2() {
//        int[][] edges = {{1,2},{2,3},{3,4},{1,4},{1,5}};
//        int[] expected = {1,4};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindRedundantConnection3() {
//        int[][] edges = {{1,2},{2,3},{3,1}};
//        int[] expected = {3,1};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindRedundantConnection4() {
//        int[][] edges = {{1,2},{1,3},{3,4},{4,5},{5,6},{6,3}};
//        int[] expected = {6,3};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindRedundantConnection5() {
//        int[][] edges = {{1,2},{2,3},{2,4},{4,5},{4,6},{1,6}};
//        int[] expected = {1,6};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindRedundantConnection6() {
//        int[][] edges = {{1,2},{2,3},{3,4},{1,4}};
//        int[] expected = {3,4};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindRedundantConnection7() {
//        int[][] edges = {{1,2},{2,3}};
//        int[] expected = {1,2};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindRedundantConnection8() {
//        int[][] edges = {{1,2},{2,3},{3,1}};
//        int[] expected = {3,1};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindRedundantConnection9() {
//        int[][] edges = {{1,1},{1,2},{2,2}};
//        int[] expected = {2,2};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindRedundantConnection10() {
//        int[][] edges = {{1,2},{2,3},{3,4},{4,5},{1,5}};
//        int[] expected = {1,5};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindRedundantConnection11() {
//        int[][] edges = {{1,2},{2,3},{3,1},{4,5}};
//        int[] expected = {3,1};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindRedundantConnection12() {
//        int[][] edges = {{1,2},{1,3},{2,3}};
//        int[] expected = {2,3};
//
//        RedundantConnection rc = new RedundantConnection();
//        int[] actual = rc.findRedundantConnection(edges);
//
//        assertArrayEquals(expected, actual);
//    }
//}