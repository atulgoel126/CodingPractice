//Since the ProductofArrayExceptSelf class does not have any public methods, all of the tests will be done using the constructor and private methods.
//
//1. Test a simple array with all positive numbers:
//Input: [1, 2, 3, 4]
//Output: [24, 12, 8, 6]
//
//2. Test an array with one zero value:
//Input: [1, 2, 3, 0]
//Output: [0, 0, 0, 6]
//
//3. Test an array with multiple zero values:
//Input: [0, 1, 2, 3, 0]
//Output: [0, 0, 0, 0, 0]
//
//4. Test an array with all negative numbers:
//Input: [-1, -2, -3, -4]
//Output: [-24, -12, -8, -6]
//
//5. Test an array with both positive and negative numbers:
//Input: [1, -2, 3, -4]
//Output: [24, -12, 8, -6]
//
//6. Test an array with only one element:
//Input: [5]
//Output: [1]
//
//7. Test an empty array:
//Input: []
//Output: []
//
//8. Test an array with duplicate numbers:
//Input: [1, 2, 3, 2, 1]
//Output: [12, 6, 4, 6, 12]
//
//9. Test an array with very large numbers:
//Input: [999999, 999999, 999999, 999999]
//Output: [999999000000000, 999999000000000, 999999000000000, 999999000000000]
//
//10. Test an array with very small numbers:
//Input: [0.00001, 0.0001, 0.001, 0.01]
//Output: [0.000000000001, 0.00000000001, 0.0000000001, 0.000000001]
//
//11. Test an array with mixed decimal and whole numbers:
//Input: [0.1, 1, 10, 100]
//Output: [10000, 1000, 100, 10]
//
//12. Test an array with a large number of elements:
//Input: [1, 2, 3, 4, ..., 99, 100]
//Output: [100!, 50!, 33!, 25!, ..., 0!, 0!]
//
//13. Test an array with negative and zero values:
//Input: [-1, 0, 1, -2, 0, 2]
//Output: [0, 0, 0, 0, 0, 0]
//
//14. Test an array with duplicate elements and zeros:
//Input: [0, 0, 1, 2, 3, 4, 0, 0, 5]
//Output: [0, 0, 0, 0, 0, 0, 0, 0, 0]
//
//15. Test an array with only one element repeated multiple times:
//Input: [5, 5, 5, 5]
//Output: [625, 625, 625, 625]
//
//16. Test an array with large negative numbers:
//Input: [-999999, -999999, -999999]
//Output: [-999999000000000, -999999000000000, -999999000000000]
//
//17. Test an array with a mix of positive, negative, and zero values:
//Input: [1, 2, -3, 4, 0, -5, 6, 0]
//Output: [0, 0, 0, 0, 0, 0, 0, 0]
//
//18. Test an array with only negative numbers:
//Input: [-5, -10, -15]
//Output: [-150, -75, -50]
//
//19. Test an array with only zero values:
//Input: [0, 0, 0, 0, 0]
//Output: [0, 0, 0, 0, 0]
//
//20. Test an array with negative zero values:
//Input: [-0, -0, -0, -0]
//Output: [0, 0, 0, 0]