## Question Description: K Closest Points to Origin

Given an array of points `points` where `points[i] = [xi, yi]` represents a point on the **X-Y** plane, and an integer `k`, return the `k` closest points to the origin `(0, 0)`.

The distance between two points on the **X-Y** plane is the Euclidean distance (i.e., `√(x2 - x1)^2 + (y2 - y1)^2`).

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).

**Example 1:**

Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation: The distance between (1, 3) and (0, 0) is √(1^2 + 3^2) = √10 ≈ 3.1623,
The distance between (-2, 2) and (0, 0) is √((-2)^2 + 2^2) = √8 ≈ 2.8284.
Since ⌊1.1623⌋ = 2 and ⌊2.8284⌋ = 2, then the array [[-2, 2]] is the answer.

**Example 2:**

Input: points = [[3,3],[5,-1],[-2,4]], k = 2
Output: [[3,3],[-2,4]]
Explanation: ([3,3] and [-2,4]) is the only pair with distance less than 2.82842, (the distance between [3,3] and [0,0]). The int square root of 2.82842 is 1.41421 which is less than or equal to 1.41421, so square root ten and square root 8 are the close distances to zero.

**Constraints:**

- `1 <= k <= points.length <= 104`
- `-104 < xi, yi < 104`