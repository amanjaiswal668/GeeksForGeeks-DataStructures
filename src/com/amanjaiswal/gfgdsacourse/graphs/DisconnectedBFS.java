package com.amanjaiswal.gfgdsacourse.graphs;

import java.util.*;

public class DisconnectedBFS {

    // For disconnected graph.

    // NOTE :-
    // *************
    // This method is to be called by DisconnectedBfs for disconnected graphs.
    // *************
    void disconnected(ArrayList<ArrayList<Integer>> al, int source, boolean[] visited) {

        // Create a queue of LinkedList to insert the visited vertices in them.
        Queue<Integer> q = new LinkedList<Integer>();

        // Mark the source vertex as true for the first iteration and insert it in the
        // queue.
        visited[source] = true;

        q.add(source);

        // Iterate over the queue till it is not empty.
        while (q.isEmpty() == false) {

            // Print the vertex from the queue and then check for the adjecent vertices of
            // it.
            int pop = q.poll();
            System.out.println("Node removed :- " + pop);

            for (int x : al.get(pop)) {
                // Mark the adjecent vertices as True if not already visited and add the vertex
                // into the queue.
                if (visited[x] == false) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
    }

    void DisconnectedBfs(ArrayList<ArrayList<Integer>> arlist, int v) {

        // Create an array of booleans and mark all the vertices as false.
        boolean[] visited = new boolean[v];

        // Iterate over the ArrayList of ArrayList and call the disconnected method for
        // each node if it is not already visited.
        for (int i = 0; i < v; i++) {

            if (visited[i] == false) {
                disconnected(arlist, i, visited);
            }
        }
    }

    public static void main(String[] args) {

        DisconnectedBFS dBfs = new DisconnectedBFS();
        int v = 7;

        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>(v);

        // Iterate over the arraylist to create arraylist to get each node of the graph.
        for (int i = 0; i < v; i++) {
            ar.add(new ArrayList<Integer>());

        }
        GraphImplementation.addEdgeToGraph(ar, 0, 1);
        GraphImplementation.addEdgeToGraph(ar, 0, 2);
        GraphImplementation.addEdgeToGraph(ar, 2, 3);
        GraphImplementation.addEdgeToGraph(ar, 1, 3);
        GraphImplementation.addEdgeToGraph(ar, 4, 5);
        GraphImplementation.addEdgeToGraph(ar, 5, 6);
        GraphImplementation.addEdgeToGraph(ar, 4, 6);
        GraphImplementation.printGraph(ar);
        dBfs.DisconnectedBfs(ar, v);
    }
}
