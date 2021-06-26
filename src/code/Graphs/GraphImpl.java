package code.Graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphImpl {

    static Scanner sc = new Scanner(System.in);

    public static void main(String ar[]) {
        adjacency_list_implementation();
    }

    public static void adjacency_list_implementation() {
        System.out.println("Adjacency List Implementation");

        System.out.println("Enter the no of vertices/nodes: ");
        int vertices = sc.nextInt();
        System.out.println("Enter the no of edges: ");
        int edges = sc.nextInt();

        AdjacencyList adjListRep = new AdjacencyList(vertices);

        while (edges-- > 0) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            adjListRep.addEge(u, v, true, weight);
        }

        // Displaying the elements in graph!
        for(ArrayList<Pair<Integer,Integer>> i : adjListRep.graph) {
            // i->vector of pair
            if(i.size() == 0) {
                System.out.println("Empty!!!");
            }
            for(Pair<Integer,Integer> j : i) {
                // j is a pair
                System.out.println(j);
            }
            System.out.println();
        }

        // BFS 
        ArrayList<Integer> list = adjListRep.bfs(2, vertices);
        for (Integer n : list) {
            System.out.println(n);
        }
    }
}
