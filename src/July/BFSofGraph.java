package July;
import java.util.*;

public class BFSofGraph {
    static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] vis = new int[V];
        Arrays.fill(vis, 0);
        q.add(0);
        vis[0] = 1;
        while (!q.isEmpty()) {
            int curr = q.poll();
            // vis[curr] = 1;
            bfs.add(curr);
            for (int it : adj.get(curr)) {
                if (vis[it] == 0) {
                    q.add(it);
                    vis[it] = 1;
                }
            }
        }
        return bfs;
    }
}
