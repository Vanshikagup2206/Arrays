package Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int total = n*(n+1)/2;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        return total - sum;
    }
    public static void main(String args[]){
        int[] nums = {0, 1, 2, 4, 5, 6};
        MissingNumber sol = new MissingNumber();
        System.out.println(sol.missingNumber(nums));
    }
}