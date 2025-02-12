class Solution {
    //function to calculate sum of no.
    public int digSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/= 10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) { 
        int l=nums.length;
        int r=-1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++){
            
            int diksum=digSum(nums[i]);
            if(map.containsKey(diksum)){
                r=Math.max(r,nums[i]+map.get(diksum));
            }
            map.put(diksum,Math.max(map.getOrDefault(diksum,0),nums[i]));

        }
        return r;
        
    }
}