# Gas Station 
You are a driver who's embarked on a road trip and your car's fuel tank has a limited capacity. You have a route with  gas stations to refuel your car along the way. Given two integer arrays, "gas" and "cost", where gas[i] represents the amount of gas you can refuel at the ith gas station, and cost[i] represents the amount of gas it costs to travel to the next gas station from the ith station, return the starting gas station's index if you can travel around the route once in the clockwise direction, otherwise return -1.

Example 1:
Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
Output: 3
Explanation:
Start at station 3 (index 3) and fill up with 4 units of gas. Your tank = 0 + 4 = 4
Travel to station 4. Your tank = 4 - 1 + 5 = 8
Travel to station 0. Your tank = 8 - 2 + 1 = 7
Travel to station 1. Your tank = 7 - 3 + 2 = 6
Travel to station 2. Your tank = 6 - 4 + 3 = 5
Travel to station 3. The cost is not known. The tank has at least 4 - 3 + 4 = 5 units of gas, so starts at station 3.