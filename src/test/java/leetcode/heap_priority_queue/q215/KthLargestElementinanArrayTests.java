//1. Test for valid input array and k value
//Input: array = [3,1,5,4,2], k = 2
//Expected output: 4
//
//2. Test for empty array
//Input: array = [], k = 2
//Expected output: IllegalArgumentException
//
//3. Test for array with duplicate elements
//Input: array = [3,2,5,4,3], k = 3
//Expected output: 3
//
//4. Test for sorted array
//Input: array = [1,2,3,4,5], k = 2
//Expected output: 4
//
//5. Test for reversed sorted array
//Input: array = [5,4,3,2,1], k = 3
//Expected output: 3
//
//6. Test for array with negative numbers
//Input: array = [-3,1,-5,4,2], k = 2
//Expected output: 1
//
//7. Test for k exceeding array length
//Input: array = [3,1,5,4,2], k = 6
//Expected output: IllegalArgumentException
//
//8. Test for k = 1
//Input: array = [3,1,5,4,2], k = 1
//Expected output: 5
//
//9. Test for k = array length
//Input: array = [3,1,5,4,2], k = 5
//Expected output: 1
//
//10. Test for array with only 1 element
//Input: array = [3], k = 1
//Expected output: 3