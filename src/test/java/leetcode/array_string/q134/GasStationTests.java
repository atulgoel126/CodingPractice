package leetcode.array_string.q134;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import leetcode.array_string.q134.GasStation;

public class GasStationTests {
    
    // Test case for a simple, valid scenario
    @Test
    public void testValidScenario() {
        int[] gas = {2,3,4,5};
        int[] cost = {3,4,5,6};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(0, result);
    }
    
    // Test case for a scenario where no station can be completed
    @Test
    public void testNoSolution() {
        int[] gas = {2,4,6,8};
        int[] cost = {4,5,6,1};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);
    }
    
    // Test case for an empty array
    @Test
    public void testEmptyArray() {
        int[] gas = {};
        int[] cost = {};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);
    }
    
    // Test case for a single value in both arrays
    @Test
    public void testSingleValue() {
        int[] gas = {4};
        int[] cost = {3};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(0, result);
    }
    
    // Test case for an array with negative values
    @Test
    public void testNegativeValues() {
        int[] gas = {-2,-3,-4,-5};
        int[] cost = {-3,-4,-5,-6};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);
    }
    
    // Test case for a scenario where the starting station is not 0
    @Test
    public void testStartingStation() {
        int[] gas = {3,4,5,6};
        int[] cost = {4,5,6,7};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(2, result);
    }
    
    // Test case for a scenario where one station has a surplus and another has a deficit,
    // but overall can still complete the circuit
    @Test
    public void testSurplusAndDeficit() {
        int[] gas = {15,5};
        int[] cost = {6,20};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(1, result);
    }
    
    // Test case for a scenario where gas and cost arrays have different lengths
    @Test
    public void testDifferentLengthArrays() {
        int[] gas = {2,3,4};
        int[] cost = {4,3,2,1};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);
    }
    
    // Test case for a scenario where gas and cost arrays have different lengths
    // but can still complete the circuit
    @Test
    public void testDifferentLengthArraysValid() {
        int[] gas = {2,3,4};
        int[] cost = {2,3,4,1};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(0, result);
    }
    
    // Test case for a scenario where all stations have a surplus
    @Test
    public void testAllSurplus() {
        int[] gas = {10,20,30,40};
        int[] cost = {5,10,15,20};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(0, result);
    }
    
    // Test case for a scenario where all stations have a deficit
    @Test
    public void testAllDeficit() {
        int[] gas = {5,10,15,20};
        int[] cost = {10,15,20,25};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);
    }
    
    // Test case for a scenario where gas and cost arrays have different lengths
    // and the gas array has a negative value
    @Test
    public void testIncorrectGasValues() {
        int[] gas = {2,-3,4};
        int[] cost = {4,3,2,1};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);
    }
    
    // Test case for a scenario where gas and cost arrays have different lengths
    // and the cost array has a negative value
    @Test
    public void testIncorrectCostValues() {
        int[] gas = {2,3,4};
        int[] cost = {4,3,-2,1};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);
    }
    
    // Test case for a scenario where gas and cost arrays have different lengths
    // and the gas array has a larger sum than the cost array
    @Test
    public void testGasSumGreaterThanCostSum() {
        int[] gas = {15,20,25};
        int[] cost = {10,15,20,25};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(0, result);
    }
    
    // Test case for a scenario where gas and cost arrays have different lengths
    // and the cost array has a larger sum than the gas array
    @Test
    public void testCostSumGreaterThanGasSum() {
        int[] gas = {10,15,20,25};
        int[] cost = {15,20,25};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);
    }
    
    // Test case for a scenario where gas and cost arrays have different lengths
    // and both arrays have a surplus and overall can complete the circuit
    @Test
    public void testBothArraysSurplus() {
        int[] gas = {20,10,5};
        int[] cost = {15,5,10,1};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(1, result);
    }
    
    // Test case for a scenario where gas and cost arrays have different lengths
    // and both arrays have a deficit and overall cannot complete the circuit
    @Test
    public void testBothArraysDeficit() {
        int[] gas = {15,20,25};
        int[] cost = {20,25,15};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);
    }
    
    // Test case for a scenario where gas and cost arrays have different lengths
    // and both arrays have a mix of positive and negative values, but overall can still complete the circuit
    @Test
    public void testMixedValues() {
        int[] gas = {-5,10,5};
        int[] cost = {10,-5,20,25};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(2, result);
    }
    
    // Test case for a scenario where gas and cost arrays have different lengths
    // and both arrays have a mix of positive and negative values, but overall cannot complete the circuit
    @Test
    public void testMixedValuesNoSolution() {
        int[] gas = {-5,10,5};
        int[] cost = {10,-5,20,-25};
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);
    }
    
    // Test case for an extremely large input
    @Test
    public void testLargeInput() {
        int[] gas = new int[10000];
        int[] cost = new int[10000];
        for (int i = 0; i < 10000; i++) {
            gas[i] = 100;
            cost[i] = 50;
        }
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(0, result);
    }
    
    // Test case for an extremely large input with negative values
    @Test
    public void testLargeInputNegativeValues() {
        int[] gas = new int[10000];
        int[] cost = new int[10000];
        for (int i = 0; i < 10000; i++) {
            gas[i] = -50;
            cost[i] = -100;
        }
        GasStation ob = new GasStation();
        int result = ob.canCompleteCircuit(gas, cost);
        assertEquals(-1, result);
    }
}