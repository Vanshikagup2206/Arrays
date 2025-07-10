package Arrays;

import java.util.*;

public class TwoSumUsingHash {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(hp.containsKey(complement)){
                result[0] = hp.get(complement);
                result[1] = i;
                break;
            }
            hp.put(nums[i], i);
        }
        return result;
    }
    public static void main(String args[]){
        int[] nums = {1, 6, 2, 10, 3};
        TwoSumUsingHash sol = new TwoSumUsingHash();
        System.out.println(Arrays.toString(sol.twoSum(nums, 7)));
    }
}