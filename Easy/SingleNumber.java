package Arrays.Easy;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
    }
    public static void main(String args[]){
        int[] nums = {1, 2, 2, 4, 3, 1, 4};
        SingleNumber sol = new SingleNumber();
        System.out.println(sol.singleNumber(nums));
    }
}
