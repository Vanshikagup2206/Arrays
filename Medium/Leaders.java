package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = nums[nums.length - 1];
        leaders.add(max);
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] > max){
                max = nums[i];
                leaders.add(max);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
    public static void main(String args[]){
        int[] nums = {1, 2, 5, 3, 1, 2};
        Leaders sol = new Leaders();
        System.out.println(sol.leaders(nums));
    }
}
