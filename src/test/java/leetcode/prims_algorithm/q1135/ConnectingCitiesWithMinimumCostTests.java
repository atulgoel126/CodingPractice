//public class ConnectingCitiesWithMinimumCostTests {
//    1. Test for minimum cost with a simple graph
//    Input:
//    n = 3 (number of cities)
//    connections = [[1,2,5],[1,3,6],[2,3,1]]
//    Expected Output:
//    Minimum cost = 6
//
//2. Test for minimum cost with a disconnected graph
//    Input:
//    n = 4 (number of cities)
//    connections = [[1,2,3],[3,4,4]]
//    Expected Output:
//    Can't connect all cities
//
//            3. Test for minimum cost with negative cost
//    Input:
//    n = 4 (number of cities)
//    connections = [[1,2,-3],[3,4,4]]
//    Expected Output:
//    Minimum cost = 1
//
//4. Test for minimum cost with duplicate connections
//    Input:
//    n = 4 (number of cities)
//    connections = [[1,2,3],[2,3,1],[1,2,1]]
//    Expected Output:
//    Minimum cost = 4
//
//5. Test for minimum cost with all cities already connected
//    Input:
//    n = 4 (number of cities)
//    connections = [[1,2,3],[1,4,2],[2,3,1],[2,4,5],[3,4,4]]
//    Expected Output:
//    No additional cost needed, minimum cost = 0
//
//            6. Test for minimum cost with a large number of cities
//    Input:
//    n = 1000 (number of cities)
//    connections = [[1,2,5],[1,3,6],[2,3,1],...,[999,1000,2]]
//    Expected Output:
//    Minimum cost = 1 + 2 + ... + 999 = 499500
//
//            7. Test for minimum cost with only one city
//    Input:
//    n = 1 (number of cities)
//    connections = []
//    Expected Output:
//    No cost needed, minimum cost = 0
//
//8. Test for minimum cost with zero cost connections
//    Input:
//    n = 3 (number of cities)
//    connections = [[1,2,0],[2,3,0],[1,3,0]]
//    Expected Output:
//    Minimum cost = 0
//
//9. Test for minimum cost with negative number of cities
//    Input:
//    n = -4 (number of cities)
//    connections = []
//    Expected Output:
//    Invalid input, can't have a negative number of cities.
//
//            10. Test for minimum cost with empty connection list
//    Input:
//    n = 5 (number of cities)
//    connections = []
//    Expected Output:
//    No connections, can't connect all cities.
//}