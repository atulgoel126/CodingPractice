package leetcode.heap_priority_queue.q378;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestElementinaSortedMatrixTests {

    // Test input matrix
    private int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};

    @Test
    public void testKthSmallest() {
        KthSmallestElementinaSortedMatrix ob = new KthSmallestElementinaSortedMatrix();

        // Basic test case
        int k = 8;
        int expected = 13;
        int actual = ob.kthSmallest(matrix, k);
        assertEquals(expected, actual);

        // Edge case: k = 1 (smallest element)
        k = 1;
        expected = 1;
        actual = ob.kthSmallest(matrix, k);
        assertEquals(expected, actual);

        // Edge case: k = total elements in matrix (largest element)
        k = matrix.length * matrix[0].length;
        expected = 15;
        actual = ob.kthSmallest(matrix, k);
        assertEquals(expected, actual);

        // Edge case: k = 0
        k = 0;
        expected = -1; // Expected to return -1 if k = 0
        actual = ob.kthSmallest(matrix, k);
        assertEquals(expected, actual);

        // Edge case: k = negative value
        k = -5;
        expected = -1; // Expected to return -1 if k is negative
        actual = ob.kthSmallest(matrix, k);
        assertEquals(expected, actual);

        // Potential issue: Empty matrix
        int[][] emptyMatrix = {};
        k = 5;
        expected = -1; // Expected to return -1 if matrix is empty
        actual = ob.kthSmallest(emptyMatrix, k);
        assertEquals(expected, actual);

        // Potential issue: Matrix with rows of unequal length
        int[][] unequalMatrix = {{1, 5, 9}, {10, 11, 13, 14}, {12, 13, 15, 16}};
        k = 4;
        expected = 10;
        actual = ob.kthSmallest(unequalMatrix, k);
        assertEquals(expected, actual);

        // Potential issue: Duplicate elements in matrix
        int[][] duplicateMatrix = {{1, 1, 3}, {2, 3, 4}, {5, 5, 6}};
        k = 5;
        expected = 3;
        actual = ob.kthSmallest(duplicateMatrix, k);
        assertEquals(expected, actual);
    }
}