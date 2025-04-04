class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int Sum=0;
        int sum=n*(n+1)/2;
        for(int num:nums){
            Sum+=num;
        }

        return sum-Sum;
    }
}