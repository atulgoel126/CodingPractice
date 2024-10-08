# Question description: "Cheapest Flights Within K Stops"

## Problem Description
Given a set of flights, represented as an array of [source, destination, price], and a limit on the number of stops k, find the cheapest price to reach the destination within exactly k stops. If no such path exists, return -1.

## Example
**input:**
`n = 3, src = 0, dst = 2, k = 1`
```
connections = [[0,1,100],[1,2,100],[0,2,500]]
```

**output:** `200`

**explanation:** The cheapest route from city 0 to city 2 with at most 1 stop costs 200.



## Explanation
In this question, you will be given an array of flights, each represented as [source, destination, price]. You will also be given the source, destination, and a limit on the number of stops k. Your task is to find the cheapest price to reach the destination from the source within exactly k stops. If there is no such path, the function should return -1.

## Leetcode Link
https://leetcode.com/problems/cheapest-flights-within-k-stops/