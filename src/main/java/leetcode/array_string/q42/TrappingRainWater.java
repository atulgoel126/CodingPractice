package leetcode.array_string.q42;
public class TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;

        if (n == 0)
            return 0;

        int waterTrapped = 0;

        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > leftMax) {
                    leftMax = height[left];
                }
                waterTrapped = waterTrapped + leftMax - height[left];
                left++;
            } else {
                if (height[right] > rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrapped = waterTrapped + rightMax - height[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }
}
