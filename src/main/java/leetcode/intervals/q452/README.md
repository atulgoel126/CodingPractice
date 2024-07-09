# Minimum Number of Arrows to Burst Balloons

Given a list of balloons in a 2D plane, each balloon is represented by a pair of integers (x, y) where x represents the start position of the balloon and y represents the end position of the balloon. The goal is to find the minimum number of arrows that must be shot to burst all the balloons.

Note:
- An arrow cannot be shot diagonally, it must be shot in a straight vertical direction.
- The position of the arrows can be considered as a horizontal line in the coordinate axis.
- If an arrow passes through a balloon's start or end position, the balloon will burst.

Examples:
- Input: [[10,16],[2,8],[1,6],[7,12]]
  Output: 2
  Explanation: One way to burst all balloons is to shoot one arrow for balloon [2,8] and another arrow for balloon [7,12].
- Input: [[1,2],[2,3],[3,4],[4,5]]
  Output: 2
  Explanation: Shooting one arrow to destroy balloons [1,2] and [3,4] and one arrow for balloon [4,5].