package Arrays;

import java.util.ArrayList;

public class CheckSorted {
    public boolean isSorted(ArrayList<Integer> nums) {
        for(int i = 0; i < nums.size() - 1; i++){
            if(nums.get(i) > nums.get(i+1))
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(4);
        nums.add(5);
        CheckSorted sol = new CheckSorted();
        System.out.println(sol.isSorted(nums));
    }
}
