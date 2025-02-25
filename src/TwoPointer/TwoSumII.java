package TwoPointer;

import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int cur = numbers[left] + numbers[right];
            if (cur == target) {
                return new int[]{left+1, right+1};
            }
            else if (cur > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 4, 2, 5, 4};
        System.out.println(Arrays.toString(twoSum(nums, 8)));
    }
}
