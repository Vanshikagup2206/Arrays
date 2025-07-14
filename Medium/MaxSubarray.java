package Arrays.Medium;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int[] nums = {2, 3, 5, -2, 7, -4};
        MaxSubarray sol = new MaxSubarray();
        System.out.println(sol.maxSubArray(nums));
    }
}
