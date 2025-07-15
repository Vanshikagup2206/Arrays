package Arrays.Medium;

public class PrintMaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        int start = 0, end = 0, tempStart = 0;
        for(int i = 1; i < nums.length; i++){
            if(sum + nums[i] < nums[i]){
                sum = nums[i];
                tempStart = i;
            }else{
                sum += nums[i];
            }
            if(sum > maxSum){
                maxSum = sum;
                start = tempStart;
                end = i;
            }
        }
        for(int i = start; i <= end; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return maxSum;
    }
    public static void main(String args[]){
        int[] nums = {2, 3, 5, -2, 7, -4};
        PrintMaxSubArray sol = new PrintMaxSubArray();
        System.out.println("Sum :" + sol.maxSubArray(nums));
    }
}
