package leetcode.dijkstras_algorithm.q787;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheapestFlightsWithinKStopsTests {
    
    // Test empty input
    @Test
    public void testEmptyInput() {
        CheapestFlightsWithinKStops ob = new CheapestFlightsWithinKStops();
        int[][] flights = {};
        int src = 0;
        int dest = 1;
        int k = 1;
        
        assertEquals(-1, ob.findCheapestPrice(0, flights, src, dest, k));
    }
    
    // Test unreachable destination
    @Test
    public void testUnreachableDestination() {
        CheapestFlightsWithinKStops ob = new CheapestFlightsWithinKStops();
        int[][] flights = {{0, 1, 100}, {1, 2, 200}, {2, 3, 300}};
        int src = 0;
        int dest = 4;
        int k = 2;
        
        assertEquals(-1, ob.findCheapestPrice(4, flights, src, dest, k));
    }
    
    // Test overlapping flights
    @Test
    public void testOverlappingFlights() {
        CheapestFlightsWithinKStops ob = new CheapestFlightsWithinKStops();
        int[][] flights = {{0, 1, 100}, {0, 2, 50}, {1, 2, 50}, {1, 3, 150}, {2, 3, 100}};
        int src = 0;
        int dest = 3;
        int k = 1;
        
        assertEquals(200, ob.findCheapestPrice(4, flights, src, dest, k));
    }
    
    // Test valid input
    @Test
    public void testValidInput() {
        CheapestFlightsWithinKStops ob = new CheapestFlightsWithinKStops();
        int[][] flights = {{0, 1, 100}, {1, 2, 200}, {0, 2, 500}};
        int src = 0;
        int dest = 2;
        int k = 1;
        
        assertEquals(300, ob.findCheapestPrice(3, flights, src, dest, k));
    }
    
    // Test maximum number of stops
    @Test
    public void testMaxStops() {
        CheapestFlightsWithinKStops ob = new CheapestFlightsWithinKStops();
        int[][] flights = {{0, 1, 100}, {1, 2, 200}, {2, 3, 300}, {3, 4, 400}, {4, 5, 500}};
        int src = 0;
        int dest = 5;
        int k = 4;
        
        assertEquals(1400, ob.findCheapestPrice(6, flights, src, dest, k));
    }
}