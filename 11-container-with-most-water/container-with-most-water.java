class Solution {
    public int maxArea(int[] height) {
        int n = height.length; 
        int i = 0; 
        int j = n-1; 
        int maxWater = 0; 
        while(i < j){
            int length = j - i; 
            int eh = Math.min(height[i], height[j]); 
            maxWater = Math.max(maxWater, length * eh); 
            if(height[i] < height[j]){
                i++; 
            }else if(height[i] > height[j]){
                j--; 
            }else{
                i++; 
                j--; 
            }
        }
        return maxWater; 
    }
}