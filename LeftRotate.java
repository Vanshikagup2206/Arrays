package Arrays;

import java.util.Arrays;

public class LeftRotate {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            temp[i] = nums[((i+k)%n)];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5};
        LeftRotate sol = new LeftRotate();
        sol.rotateArray(nums,3);
    }
}