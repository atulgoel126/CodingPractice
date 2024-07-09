# Hand of Straights 

Given an array of integers `hand` and a positive integer `W`, determine if it is possible to divide the hand into `W` groups of `W` consecutive numbers.

Note: This question is adapted from the problem "Hand of Straights" on LeetCode.


### Example 1:
- Input: `hand = [1,2,3,6,2,3,4,7,8], W = 3`
- Output: `true`
Explanation: Hand of 3 consecutive cards are `[1,2,3]`,`[2,3,4]` and `[6,7,8]`.

### Example 2:
- Input: `hand = [1,2,3,4,5], W = 4`
- Output: `false`
Explanation: Hand of 4 consecutive cards is `[1,2,3,4]` but the second group of 4 cards `[2,3,4,5]` is not consecutive.

### Constraints:
- `1 <= hand.length <= 10^4`
- `0 <= hand[i] <= 10^9`
- `1 <= W <= hand.length`

Note: This question is intended to be answered in the most efficient way possible, therefore, the time limit for this question is 2 seconds.