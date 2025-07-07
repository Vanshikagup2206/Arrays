package Arrays;

public class LargestElement {
    public int largestElement(int[] nums) {
        int largestElement = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largestElement){
                largestElement = nums[i];
            }
        }
        return largestElement;
    }
    public static void main(String args[]){
        int[] nums = {3,3,6,1};
        LargestElement sol = new LargestElement();
        System.out.println(sol.largestElement(nums));
    }
}
