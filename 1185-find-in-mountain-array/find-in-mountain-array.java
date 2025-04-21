/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
public class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        
        int index = binarySearchInc(mountainArr, target, 0, peak);
        if (index != -1) return index;
        
        return binarySearchDec(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    private int findPeak(MountainArray arr) {
        int left = 0, right = arr.length() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int binarySearchInc(MountainArray arr, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;
            else if (val < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    private int binarySearchDec(MountainArray arr, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;
            int val = arr.get(mid);
            if (val == target) return mid;
            else if (val > target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}