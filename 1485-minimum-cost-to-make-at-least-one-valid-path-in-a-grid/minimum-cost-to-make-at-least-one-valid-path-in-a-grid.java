class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Directions: Right, Left, Down, Up
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        int[][] cost = new int[m][n];
        for (int[] row : cost) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // Queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 0}); // Start at (0, 0) with cost 0
        cost[0][0] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int i = current[0], j = current[1], currCost = current[2];

            // Explore all four directions
            for (int dir = 0; dir < 4; dir++) {
                int ni = i + directions[dir][0];
                int nj = j + directions[dir][1];

                // Boundary check
                if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                    int newCost = (grid[i][j] == dir + 1) ? currCost : currCost + 1;

                    // If this path is cheaper, update and add to queue
                    if (newCost < cost[ni][nj]) {
                        cost[ni][nj] = newCost;
                        queue.offer(new int[]{ni, nj, newCost});
                    }
                }
            }
        }

        return cost[m - 1][n - 1];
    }
}