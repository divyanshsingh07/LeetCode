import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> rs = new ArrayList<>();

        // Sort the array to easily handle duplicates and use two-pointer approach
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate elements for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int s = nums[i] + nums[l] + nums[r];

                if (s == 0) {
                    // Correctly add the triplet
                    rs.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // Skip duplicate elements for the second and third numbers
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    // Move pointers after finding a valid triplet
                    l++;
                    r--;
                } else if (s < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return rs;
    }
}