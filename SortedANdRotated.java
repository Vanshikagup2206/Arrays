package Arrays;

public class SortedANdRotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[(i+1) % n])
            count++;
        }
        return count <= 1;
    }
    public static void main(String args[]){
        int[] nums = {3,4,5,1,2};
        SortedANdRotated sol = new SortedANdRotated();
        System.out.println(sol.check(nums));
    }
}