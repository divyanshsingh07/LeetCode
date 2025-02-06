class Solution {
        public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }
        
        for (int val : productCount.values()) {
            if (val > 1) {
                count += val * (val - 1) / 2 * 8;
            }
        }
        
        return count;
    }
    
}