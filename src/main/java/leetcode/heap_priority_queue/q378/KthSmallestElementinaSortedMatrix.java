package leetcode.heap_priority_queue.q378;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElementinaSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {

        if (k <= 0) {
            return -1;
        }

        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        int n = matrix.length;
        int[] index = new int[n];
        Arrays.fill(index, 0);

        PriorityQueue<Element> heap = new PriorityQueue<Element>(
                new Comparator<Element>() {
                    @Override
                    public int compare(Element a, Element b) {
                        return a.val - b.val;
                    }
                }
        );

        for(int i = 0; i < n; i++) {
            Element e = new Element(matrix[i][0], i, 0);
            heap.add(e);
        }
        while (k > 1) {
            Element curr = heap.poll();
            int nextCol = curr.c + 1;
            if (nextCol < n) {
                Element next = new Element(matrix[curr.r][nextCol], curr.r, nextCol);
                heap.add(next);
            }
            k--;
        }

        return heap.poll().val;
    }

    private class Element {
        public int val;
        public int r;
        public int c;
        public Element(int val, int r, int c) {
            this.val = val;
            this.c = c;
            this.r = r;
        }

        @Override
        public String toString() {
            return String.format("val %d, r: %d, c: %d\n", val, r, c);
        }
    }}
