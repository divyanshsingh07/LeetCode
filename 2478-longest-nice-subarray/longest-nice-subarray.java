class Solution {
    public int longestNiceSubarray(int[] nums) {
         int maxLen = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int r = 0;  
            for (int j = i; j < n; j++) {
                if ((r & nums[j]) != 0) { 
                    break;
                }
                r |= nums[j]; 
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
        
    }
}