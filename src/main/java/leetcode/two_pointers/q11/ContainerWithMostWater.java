package leetcode.two_pointers.q11;
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, getArea(left, right, height));
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }

    private int getArea(int start, int end, int[] height) {
        return Math.min(height[start], height[end]) * (end - start);
    }
}
