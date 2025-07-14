package Arrays.Medium;

import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLength = 0;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int num: set){
            if(!set.contains(num - 1)){
                int curNum = num;
                int length = 1;
                while(set.contains(curNum + 1)){
                    curNum++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
    public static void main(String args[]){
        int[] nums = {100, 4, 200, 1, 3, 2};
        LongestConsecutive sol = new LongestConsecutive();
        System.out.println(sol.longestConsecutive(nums));
    }
}