package Arrays.Easy;

import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int position = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[position++] = nums[i];
            }
        }
        while(position < nums.length){
            nums[position++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String args[]){
        int[] nums = {0,1,4,0,5,2};
        MoveZeroes sol = new MoveZeroes();
        sol.moveZeroes(nums);
    }
}
