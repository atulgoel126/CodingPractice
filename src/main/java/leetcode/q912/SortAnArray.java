package leetcode.q912;
public class SortAnArray {
    public int[] sortArray(int[] nums) {

        if (nums == null || nums.length == 0) {
            return nums;
        }

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int size = max - min + 1;

        int[] count = new int[size];

        for (int num : nums) {
            count[num - min]++;
        }

        int[] sortedArray = new int[nums.length];

        // nums = {-2, 0, 0, 1, 1, 2}
        // count= { 1, 0, 2, 2, 1}

        // -2-> 1
        // 0 -> 2
        // 1 -> 2
        // 2- > 1
        int counter = 0;
        for (int i = 0; i < count.length; i++) {
            int c = count[i];
            while (c-- > 0) {
                sortedArray[counter++] = min;
            }
            min++;
        }
        return sortedArray;

    }
}
