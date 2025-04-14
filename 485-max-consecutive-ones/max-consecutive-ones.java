class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int mxc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }
            else{
                c=0;
            }
            mxc=Math.max(mxc,c);
        }
        return mxc;
    }
}