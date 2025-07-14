class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        subset(0, nums, new ArrayList<>(), result);
        return result;
    }

    public void subset(int i, int[] arr, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // Add current subset

        for (int j = i; j < arr.length; j++) {
            current.add(arr[j]);                      // Choose
            subset(j + 1, arr, current, result);       // Explore
            current.remove(current.size() - 1);        // Un-choose (backtrack)
        }
    }
}