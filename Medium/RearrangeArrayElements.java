package Arrays.Medium;

import java.util.Arrays;

public class RearrangeArrayElements {
    public int[] rearrangeArray(int[] nums) {
        int posiPos = 0, negPosition = 1;
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                result[negPosition] = nums[i];
                negPosition += 2;
            }else{
                result[posiPos] = nums[i];
                posiPos += 2;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int[] nums = {2, 4, 5, -1, -3, -4};
        RearrangeArrayElements sol = new RearrangeArrayElements();
        System.out.println(Arrays.toString(sol.rearrangeArray(nums)));
    }
}
