//1. Test case: Empty input array
//Input: []
//Expected Output: []
//
//2. Test case: Single value in input array
//Input: [5]
//Expected Output: ["5"]
//
//3. Test case: Sorted input array
//Input: [1,2,3,4,5]
//Expected Output: ["1->5"]
//
//4. Test case: Unsorted input array
//Input: [2,1,4,5,3]
//Expected Output: ["1->5"]
//
//5. Test case: Input array with duplicate values
//Input: [1,2,2,3,4,4,4,5]
//Expected Output: ["1->5"]
//
//6. Test case: Input array with negative values
//Input: [-5,-4,-3,1,2]
//Expected Output: ["-5->-3", "1->2"]
//
//7. Test case: Input array with all negative values
//Input: [-10,-20,-30,-40,-50]
//Expected Output: ["-50->-10"]
//
//8. Test case: Input array with all positive values
//Input: [10,20,30,40,50]
//Expected Output: ["10->50"]
//
//9. Test case: Input array with single interval
//Input: [1,2]
//Expected Output: ["1->2"]
//
//10. Test case: Input array with overlapping intervals
//Input: [1,2,3,4,5,6,8,9,10]
//Expected Output: ["1->6", "8->10"]
//
//11. Test case: Input array with unconnected intervals
//Input: [1,3,5,7,9]
//Expected Output: ["1", "3", "5", "7", "9"]
//
//12. Test case: Input array with negative and positive values and overlapping intervals
//Input: [-10,-5,-3,1,2,4,6]
//Expected Output: ["-10->-3", "1->2", "4->4", "6->6"]
//
//13. Test case: Input array with duplicate intervals
//Input: [1,2,3,3,4,5]
//Expected Output: ["1->5"]