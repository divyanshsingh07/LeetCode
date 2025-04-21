/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        // Step 1: Find the peak index
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        int peak = left;

        // Step 2: Binary search on the increasing side
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;

        // Step 3: Binary search on the decreasing side
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    // Modified binary search for both increasing/decreasing sides
    private int binarySearch(MountainArray arr, int target, int start, int end, boolean ascending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);
            if (midVal == target) return mid;

            if (ascending) {
                if (target < midVal) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > midVal) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}