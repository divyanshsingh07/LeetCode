class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        // Visit every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Found land
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j); // mark this island
                }
            }
        }

        return count;
    }
      private void dfs(char[][] grid, int i, int j) {
        // Out of bounds or water
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        // Mark as visited
        grid[i][j] = '0';

        // Explore 4 directions
        dfs(grid, i + 1, j); // down
        dfs(grid, i - 1, j); // up
        dfs(grid, i, j + 1); // right
        dfs(grid, i, j - 1); // left
    }
}