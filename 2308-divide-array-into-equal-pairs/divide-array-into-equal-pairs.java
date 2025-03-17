class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> fq=new HashMap<>();
        for (int n : nums) {
            fq.put(n, fq.getOrDefault(n, 0) + 1);
        }

        for (int c : fq.values()) {
            if (c % 2 != 0) { 
                return false;
            }
        }
        
        return true;
        
    }
}