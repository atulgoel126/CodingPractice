//1. Test case for empty intervals list:
//Intervals: []
//Expected output: []
//
//2. Test case for intervals with no overlapping:
//Intervals: [[1,2], [3,4], [5,6]]
//Expected output: [[1,2], [3,4], [5,6]]
//
//3. Test case for intervals with one overlapping:
//Intervals: [[1,3], [2,4], [5,6]]
//Expected output: [[1,4], [5,6]]
//
//4. Test case for intervals with multiple overlapping:
//Intervals: [[1,3], [2,6], [8,10], [15,18]]
//Expected output: [[1,6], [8,10], [15,18]]
//
//5. Test case for intervals with multiple overlapping and merged intervals:
//Intervals: [[1,2], [2,6], [8,10], [9,18]]
//Expected output: [[1,6], [8,18]]
//
//6. Test case for intervals with overlapping at start:
//Intervals: [[1,3], [0,2], [4,6]]
//Expected output: [[0,3], [4,6]]
//
//7. Test case for intervals with overlapping at end:
//Intervals: [[1,3], [6,9], [4,7]]
//Expected output: [[1,3], [4,9]]
//
//8. Test case for intervals with same start and end time:
//Intervals: [[1,2], [1,2], [4,5]]
//Expected output: [[1,2], [4,5]]
//
//9. Test case for intervals with empty intervals:
//Intervals: [[]]
//Expected output: [[]]
//
//10. Test case for intervals with negative values:
//Intervals: [[-2,5], [-3,0], [1,3]]
//Expected output: [[-3,5]]
//
//11. Test case for intervals with duplicate intervals:
//Intervals: [[1,3], [1,3], [3,6], [5,8]]
//Expected output: [[1,3], [3,8]]
//
//12. Test case for intervals with intervals in descending order:
//Intervals: [[6,8], [4,6], [2,4], [1,2]]
//Expected output: [[1,8]]
//
//13. Test case for intervals with intervals in reverse order:
//Intervals: [[8,6], [6,4], [4,2], [2,1]]
//Expected output: [[1,8]]
//
//14. Test case for intervals with intervals with negative values:
//Intervals: [[-2,-1], [-5,-3], [-6,-4]]
//Expected output: [[-6,-1]]