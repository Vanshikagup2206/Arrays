package Arrays;

import java.util.Arrays;

public class RightRotate {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            temp[((i+k)%n)] = nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5};
        RightRotate sol = new RightRotate();
        sol.rotate(nums,3);
    }
}
