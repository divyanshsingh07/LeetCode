class Solution {
    public String longestPrefix(String s) {
        long prefixHash = 0, suffixHash = 0;
        int best = 0;
        long base = 31, mod = 1_000_000_007, power = 1;
        int n = s.length();

        for (int i = 0; i < n - 1; i++) {
            int leftChar = s.charAt(i) - 'a' + 1;
            int rightChar = s.charAt(n - 1 - i) - 'a' + 1;

            prefixHash = (prefixHash * base + leftChar) % mod;
            suffixHash = (suffixHash + power * rightChar) % mod;

            if (prefixHash == suffixHash) {
                best = i + 1;
            }

            power = (power * base) % mod;
        }

        return s.substring(0, best);
    }
}