package Arrays.Medium;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int dipIndex = -1;

        // Step 1: Find the dip index
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                dipIndex = i;
                break;
            }
        }

        // Step 2: If no dip, reverse the whole array
        if (dipIndex == -1) {
            // reverse entire array
            for (int start = 0, end = n - 1; start < end; start++, end--) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }
            return;
        }

        // Step 3: Find just greater element and swap
        for (int i = n - 1; i > dipIndex; i--) {
            if (nums[i] > nums[dipIndex]) {
                int temp = nums[i];
                nums[i] = nums[dipIndex];
                nums[dipIndex] = temp;
                break;
            }
        }

        // Step 4: Reverse from dipIndex + 1 to end
        for (int start = dipIndex + 1, end = n - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }

    public static void main(String args[]) {
        int[] nums = {1, 3, 5, 4, 2};
        NextPermutation sol = new NextPermutation();
        sol.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));  // Output: [1, 4, 2, 3, 5]
    }
}
