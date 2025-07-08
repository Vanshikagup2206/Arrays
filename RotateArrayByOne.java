package Arrays;

import java.util.Arrays;

public class RotateArrayByOne {
    public void rotateArrayByOne(int[] nums) {
        int n = nums.length;
        int first = nums[0];
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[((i+1)%n)];
        }
        nums[n - 1] = first;
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5};
        RotateArrayByOne sol = new RotateArrayByOne();
        sol.rotateArrayByOne(nums);
    }
}