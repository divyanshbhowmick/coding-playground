package code.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * AdjacencyList
 */
public class AdjacencyList {

    ArrayList<ArrayList<Pair<Integer, Integer>>> graph;

    public AdjacencyList(int v) {
        graph = new ArrayList<ArrayList<Pair<Integer, Integer>>>(v);
        while (v-- > 0)
            graph.add(new ArrayList<Pair<Integer, Integer>>());
        System.out.println(graph.size());
    }

    public void addEge(int u, int v, boolean bidr, int wt) {

        graph.get(u).add(new Pair<Integer, Integer>(v, wt));

        // graph.get(u).add(new Pair<Integer, Integer>(v, wt));
        if (bidr == true) {
            graph.get(v).add(new Pair<Integer, Integer>(u, wt));
        }
    }

    public ArrayList<Integer> bfs(int src, int vertices) {
        PriorityQueue<Integer> qu = new PriorityQueue<>(vertices);
        boolean visited[] = new boolean[vertices];
        ArrayList<Integer> result = new ArrayList<>();
        qu.add(src);
        visited[src] = true;
        while (!qu.isEmpty()) {
            // Get the first node and remove the element from the queue.
            int currentNode = qu.poll();
            result.add(currentNode);
            for (Pair<Integer, Integer> neighbour : graph.get(currentNode)) {
                if (!visited[neighbour.first]) {
                    qu.add(neighbour.first);
                    visited[neighbour.first] = true;
                }
            }
        }
        return result;
    }
}