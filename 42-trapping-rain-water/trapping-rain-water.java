class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int i = 0;
        int j = n - 1;
        int max = 0;
        while (i < j) {
            if (height[i] <= height[j]) {
                max = Math.max(max, height[i]);
                ans -= height[i];
                i++;
            }
            else {
                max = Math.max(max, height[j]);
                ans -= height[j];
                j--;
            }
            ans += max;
        }
        return ans;
    }
}