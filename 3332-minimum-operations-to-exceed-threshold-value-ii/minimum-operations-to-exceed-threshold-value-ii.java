class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        for(int i: nums){heap.add((long)i);}
        int count = 0;
        while(heap.peek() < k){
            long left = heap.poll();
            long right = heap.poll();
            heap.add(Math.min(left, right) *2   + Math.max(left, right));
            count++;
        }
        return count;
    }
}