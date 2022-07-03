package com.amanjaiswal.gfgdsacourse.graphs;

import java.util.*;

public class DepthFirstSearch {

    // Create a method to take ArrayList of ArrayList, the total number of
    // edges(vertex) and the source vertex.

    // NOTE :-
    // *************
    // This method is called independently for connected graphs in dfs.
    // *************
    void dfs(ArrayList<ArrayList<Integer>> ar, boolean visited[], int source) {
        // Mark the source vertex as true for the first iteration.
        visited[source] = true;

        System.out.println("Node removed :- " + source);

        // Iterate over the ArrayList and call the dfs recursievly for sub child of each
        // source we visit
        for (int i : ar.get(source)) {
            if (visited[i] == false) {
                // Call dfs recursievily and pass the i as the current source to it.
                dfs(ar, visited, i);
            }
        }
    }

    void bfsCaller(ArrayList<ArrayList<Integer>> arl, int v, int source) {

        // Create a queue of LinkedList to insert the visited vertices in them.
        boolean visited[] = new boolean[v + 1];

        for (int i = 0; i < v; i++) {
            visited[i] = false;
        }
        // Call dfs here
        dfs(arl, visited, source);
    }

    public static void main(String[] args) {
        DepthFirstSearch dFirstSearch = new DepthFirstSearch();
        int v = 7;

        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>(v);

        // Iterate over the arraylist to create arraylist to get each node of the graph.
        for (int i = 0; i < v; i++) {
            ar.add(new ArrayList<Integer>());

        }
        GraphImplementation.addEdgeToGraph(ar, 0, 1);
        GraphImplementation.addEdgeToGraph(ar, 0, 2);
        GraphImplementation.addEdgeToGraph(ar, 1, 2);
        GraphImplementation.addEdgeToGraph(ar, 2, 3);
        GraphImplementation.addEdgeToGraph(ar, 1, 3);
        GraphImplementation.addEdgeToGraph(ar, 3, 4);
        GraphImplementation.addEdgeToGraph(ar, 2, 4);
        GraphImplementation.printGraph(ar);
        dFirstSearch.bfsCaller(ar, v, 0);
    }

}
