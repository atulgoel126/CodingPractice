//package leetcode.minimum_spanning_tree.q1168;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.minimum_spanning_tree.q1168.OptimizeWaterDistributioninaVillage;
//
//public class OptimizeWaterDistributioninaVillageTests {
//
//    // Test case to check if constructor is correctly creating an instance of the class
//    @Test
//    public void constructOptimizeWaterDistributioninaVillage() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        assertNotNull(ob);
//    }
//
//    // Test case to check if correct value is returned for a simple graph with two houses and one well
//    @Test
//    public void optimizeWaterDistribution_SimpleGraph() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        int[] wells = {2};
//        int[][] pipes = {{1,2,1}};
//        int result = ob.optimizeWaterDistribution(2, wells, pipes);
//        assertEquals(1, result);
//    }
//
//    // Test case to check if correct value is returned for a complex graph with multiple wells and houses
//    @Test
//    public void optimizeWaterDistribution_ComplexGraph() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        int[] wells = {1,2,2,3,4};
//        int[][] pipes = {{1,2,1},{2,3,3},{1,3,2},{3,4,5},{2,4,2}};
//        int result = ob.optimizeWaterDistribution(4, wells, pipes);
//        assertEquals(8, result);
//    }
//
//    // Test case to check if correct value is returned when all houses are connected to the well through pipes
//    @Test
//    public void optimizeWaterDistribution_AllConnectedGraph() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        int[] wells = {1};
//        int[][] pipes = {{1,2,1},{1,3,2},{1,4,3},{1,5,4}};
//        int result = ob.optimizeWaterDistribution(5, wells, pipes);
//        assertEquals(10, result);
//    }
//
//    // Test case to check if correct value is returned for a graph with no wells
//    @Test
//    public void optimizeWaterDistribution_NoWellsGraph() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        int[] wells = {};
//        int[][] pipes = {{1,2,1},{2,3,3},{3,4,5}};
//        int result = ob.optimizeWaterDistribution(4, wells, pipes);
//        assertEquals(0, result);
//    }
//
//    // Test case to check if correct value is returned when the same house is listed as a well and a house
//    @Test
//    public void optimizeWaterDistribution_DuplicateWells() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        int[] wells = {1,1};
//        int[][] pipes = {{1,2,1},{1,3,2},{1,4,3},{1,5,4}};
//        int result = ob.optimizeWaterDistribution(5, wells, pipes);
//        assertEquals(10, result);
//    }
//
//    // Test case to check if correct value is returned when the same pipe is listed multiple times
//    @Test
//    public void optimizeWaterDistribution_DuplicatePipes() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        int[] wells = {1};
//        int[][] pipes = {{1,2,1},{1,2,1},{1,2,1}};
//        int result = ob.optimizeWaterDistribution(2, wells, pipes);
//        assertEquals(2, result);
//    }
//
//    // Test case to check if correct value is returned when there are no houses in the graph
//    @Test
//    public void optimizeWaterDistribution_NoHouses() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        int[] wells = {1,2};
//        int[][] pipes = {};
//        int result = ob.optimizeWaterDistribution(0, wells, pipes);
//        assertEquals(0, result);
//    }
//
//    // Test case to check if correct value is returned when negative values are given for wells
//    @Test
//    public void optimizeWaterDistribution_NegativeWells() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        int[] wells = {-1,-2,-3};
//        int[][] pipes = {{1,2,1},{2,3,3},{3,4,5}};
//        assertThrows(Exception.class, ()->{ob.optimizeWaterDistribution(4, wells, pipes);});
//    }
//
//    // Test case to check if correct value is returned when negative values are given for pipes
//    @Test
//    public void optimizeWaterDistribution_NegativePipes() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        int[] wells = {1,2,3};
//        int[][] pipes = {{-1,2,-1},{-2,-3,3},{1,-4,-5},{-2,4,-2}};
//        assertThrows(Exception.class, ()->{ob.optimizeWaterDistribution(4, wells, pipes);});
//    }
//
//    // Test case to check if correct value is returned for a graph with only one house and one well
//    @Test
//    public void optimizeWaterDistribution_OneHouseGraph() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        int[] wells = {1};
//        int[][] pipes = {};
//        int result = ob.optimizeWaterDistribution(1, wells, pipes);
//        assertEquals(1, result);
//    }
//
//    // Test case to check if correct value is returned for a graph with no pipes
//    @Test
//    public void optimizeWaterDistribution_NoPipesGraph() {
//        OptimizeWaterDistributioninaVillage ob = new OptimizeWaterDistributioninaVillage();
//        int[] wells = {1,2};
//        int[][] pipes = {};
//        int result = ob.optimizeWaterDistribution(2, wells, pipes);
//        assertEquals(0, result);
//    }
//
//}