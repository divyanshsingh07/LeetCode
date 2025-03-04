class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> inner = new ArrayList<>();
            int num = 1;
            inner.add(num);
            for (int j = 1; j < i; j++) {
                num = (num * (i - j)) / j;
                inner.add(num);
            }
            result.add(inner);
        }
        return result;
    }
}