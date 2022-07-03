package com.amanjaiswal.gfgdsacourse.graphs;

import java.util.*;

public class BreadthFirstSearch {

    // Create a method to take ArrayList of ArrayList, the total number of
    // edges(vertex) and the source vertex.

    // NOTE :-
    // *************
    // This method is called independently for connected graphs in bfs.
    // *************
    void bfs(ArrayList<ArrayList<Integer>> arlist, int v, int source) {

        // Create an array of booleans and mark all the vertices as false.
        boolean[] visited = new boolean[v + 1];

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

            for (int x : arlist.get(pop)) {
                // Mark the adjecent vertices as True if not already visited and add the vertex
                // into the queue.
                if (visited[x] == false) {
                    visited[x] = true;
                    q.add(x);
                }
            }
        }

    }


    public static void main(String[] args) {

        BreadthFirstSearch breadth = new BreadthFirstSearch();

        int v = 5;

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
        breadth.bfs(ar, v, 0);
    }

}
