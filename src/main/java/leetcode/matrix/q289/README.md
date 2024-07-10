# Game of Life

## Description

The Game of Life is a popular cellular automaton invented by mathematician John Conway. It is played on a grid, with each cell having one of two states: alive or dead. The game progresses in rounds, and the state of each cell in the next round is determined by a set of rules involving the current state of the cell and its immediate neighbors.

The Game of Life has been studied extensively for its interesting patterns and behavior, and is also used as a model for various real-life systems.

## Question

Given an initial state of the game represented by a grid of cells, simulate the game for an arbitrary number of rounds and return the final state of the game. The rules for determining the state of each cell in the next round are as follows:

- Any live cell with two or three live neighbors remains alive.
- Any dead cell with three live neighbors becomes alive.
- All other live cells with more than three live neighbors die.
- All other dead cells with less than three live neighbors stay dead.

Note that the game is played on an infinite grid with finite number of live cells at any given moment. Therefore, any cells that fall off the grid due to these rules are not observed.

### Example:

```
Input:
[
  [0,1,0],
  [0,0,1],
  [1,1,1],
  [0,0,0]
]

Output:
[
  [0,0,0],
  [1,0,1],
  [0,1,1],
  [0,1,0]
]
```

## Constraints:

- The initial grid will be at least 1x1 in size.
- The grid will only contain 0s (dead cells) and 1s (alive cells).
- You may assume that round 0 represents the initial state of the game.