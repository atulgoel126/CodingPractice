//1. Test a complete binary tree
//Input:
//          1
//       /     \
//      2       3
//     / \     / \
//    4   5   6   7
//Output: true
//
//2. Test a binary tree with missing nodes on right side
//Input:
//          1
//       /     \
//      2       3
//     / \     /
//    4   5   6
//Output: false
//
//3. Test a binary tree with missing nodes on left side
//Input:
//          1
//       /     \
//      2       3
//    /   \    /
//   4     5   6
//Output: false
//
//4. Test a binary tree with only one node
//Input: 1
//Output: true
//
//5. Test a binary tree with only one node and a missing left node
//Input: 1
//Output: false
//
//6. Test a binary tree with only one node and a missing right node
//Input: 1
//Output: false
//
//7. Test a binary tree with multiple levels and missing nodes
//Input:
//          1
//       /     \
//      2       3
//     / \       \
//    4   5       7
//   /   / \     /
//  8   6   9   10
//Output: false
//
//8. Test a binary tree with multiple levels and missing nodes on each level
//Input:
//          1
//       /     \
//      2       3
//     /         \
//    4           5
//   /             \
//  8               10
//Output: false
//
//9. Test a binary tree with duplicate nodes
//Input:
//          1
//       /     \
//      2       3
//     / \     / \
//    4   5   6   7
//          / \
//         8   8
//Output: false
//
//10. Test a binary tree with negative numbers
//Input:
//          1
//       /     \
//     -2       3
//     / \     / \
//   -4   5   -6  -7
//Output: true