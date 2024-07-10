# Leetcode - Min Cost to Connect All Points

Given an array `points` representing coordinates of `N` points on a 2D plane, where `points[i] = [x_i, y_i]`, return the minimum cost to connect all the points.

Each pair of points are connected by a straight line and the cost to connect two points is the Euclidean distance between them.

Example 1:

Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
Output: 20
Explanation:
We can connect the points as shown above to get the minimum cost of 20.90000.
Notice that there are multiple paths that can be taken and the distance is calculated as the sum of the distances between consecutive points.

Example 2:

Input: points = [[3,12],[-2,5],[-4,1]]
Output: 18

Example 3:

Input: points = [[0,0],[1,1],[1,0],[-1,1]]
Output: 4

Constraints:

- `1 <= points.length <= 1000`
- `-10^6 <= x_i, y_i <= 10^6`
- All pairs `(x_i, y_i)` are distinct.