package Arrays;

import java.util.Arrays;

public class SortZeroOneTwo {
    public void sortZeroOneTwo(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String args[]){
        int[] nums = {1,0,2,1,0};
        SortZeroOneTwo sol = new SortZeroOneTwo();
        sol.sortZeroOneTwo(nums);
    }
}
