public class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        // Create a DP table with (m+1) rows and (n+1) columns
        int[][] dp = new int[m + 1][n + 1];
        
        // Base cases: converting from an empty string
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // m deletions to make word1 empty
        }
        
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // j insertions to make word2
        }
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // No change needed if characters match
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], // Replace
                                                 dp[i][j - 1]),    // Insert
                                                 dp[i - 1][j]) + 1; // Delete
                }
            }
        }
        
        // The answer is in the bottom-right cell of the DP table
        return dp[m][n];
    }
}