class Solution {
 
    long totalFuel = 0;

    public long minimumFuelCost(int[][] roads, int seats) {
        int n = roads.length + 1; // since n-1 roads
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] road : roads) {
            graph.get(road[0]).add(road[1]);
            graph.get(road[1]).add(road[0]);
        }

        dfs(0, -1, graph, seats);
        return totalFuel;
    }

    private long dfs(int node, int parent, List<List<Integer>> graph, int seats) {
        long people = 1; // one representative at this node

        for (int neighbor : graph.get(node)) {
            if (neighbor != parent) {
                people += dfs(neighbor, node, graph, seats);
            }
        }

        if (node != 0) {
            // ceil(people / seats) = number of cars needed
            totalFuel += (people + seats - 1) / seats;
        }

        return people;
    }
}
 