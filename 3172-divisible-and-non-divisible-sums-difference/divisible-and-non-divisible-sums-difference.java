class Solution {
    public int differenceOfSums(int n, int m) {
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%m!=0){
                 nums1.add(i);
            }
            else nums2.add(i);
        }
        int s1=0,s2=0;
        for(int num:nums1) s1+=num;
        for(int num:nums2) s2+=num;
        return s1-s2;   
    }
    
}