package Arrays.Easy;

import java.util.*;

public class Union {
    public int[] unionArray(int[] nums1, int[] nums2) {
        TreeSet<Integer> union = new TreeSet<>();
        for(int i = 0; i < nums1.length; i++){
            union.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            union.add(nums2[i]);
        }
        int[] result = new int[union.size()];
        int i = 0;
        for (int num : union) {
            result[i++] = num;
        }
        return result;
    }
    public static void main(String args[]){
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        Union sol = new Union();
        System.out.println(Arrays.toString(sol.unionArray(nums1, nums2)));
    }
}
