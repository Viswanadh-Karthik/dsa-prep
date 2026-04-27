package dsa;

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0;
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            
            if (map.containsKey(currentChar)) {
                left = Math.max(map.get(currentChar) + 1, left);
            }
            
            map.put(currentChar, right);
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String input = args.length > 0 ? args[0] : "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);

        System.out.println("Input: " + input);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }

}
