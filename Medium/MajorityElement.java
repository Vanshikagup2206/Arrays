package Arrays.Medium;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                    count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String args[]){
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        MajorityElement sol = new MajorityElement();
        System.out.println(sol.majorityElement(nums));
    }
}