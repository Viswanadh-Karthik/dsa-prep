package dsa;

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) {
                return true;
            }
            set.add(n);
        }    
        return false;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};

        System.out.println(obj.containsDuplicate(nums1)); // false
        System.out.println(obj.containsDuplicate(nums2)); // true
    }
}