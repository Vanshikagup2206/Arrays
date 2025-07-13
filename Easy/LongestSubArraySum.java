package Arrays.Easy;

// Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k.
//  If no such sub-array exists, return 0.

public class LongestSubArraySum {
  public int longestSubarray(int[] nums, int k) {
    int maxLength = 0;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        if (sum == k) {
          maxLength = Math.max(maxLength, j - i + 1);
        }
      }
    }
    return maxLength;
  }
  public static void main(String args[]){
    int[] nums = {10, 5, 2, 7, 1, 9};
    LongestSubArraySum sol = new LongestSubArraySum();
    System.out.println(sol.longestSubarray(nums,15));
  }
}