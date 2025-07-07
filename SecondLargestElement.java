package Arrays;

public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largestElement){
                largestElement = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < largestElement && nums[i] > secondLargestElement){
                secondLargestElement = nums[i];
            }
        }
        if(secondLargestElement == Integer.MIN_VALUE){
            secondLargestElement = -1;
        }
        return secondLargestElement;
    }
    public static void main(String args[]){
        int[] nums = {8,8,7,6,5};
        SecondLargestElement sol = new SecondLargestElement();
        System.out.println(sol.secondLargestElement(nums));
    }
}