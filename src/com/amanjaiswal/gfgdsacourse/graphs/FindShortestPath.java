package com.amanjaiswal.gfgdsacourse.graphs;

import java.util.*;

public class FindShortestPath {

    void countShortestPath(ArrayList<ArrayList<Integer>> ar, int v, int source) {

        // Create an empty array of distance and mark the distance for all nodes as
        // infinite.
        int dist[] = new int[v];
        for (int i = 0; i < v; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        // Mark the distance for the source vertex as 0.
        dist[0] = 0;
        // Create an empty array for visited vertex and mark them initally as false.
        boolean visited[] = new boolean[v];

        // Create a new LikdList to insert the visited vertices in them.
        Queue<Integer> countQueue = new LinkedList<Integer>();

        visited[source] = true;
        countQueue.add(source);
        while (countQueue.isEmpty() == false) {
            int pop = countQueue.poll();
            for (int i : ar.get(pop)) {
                // Check if visited is false for the given node.
                if (visited[i] == false) {
                    // Add the distance for the ith node :- add 1 each time.
                    dist[i] = dist[pop] + 1;
                    visited[i] = true;
                    countQueue.add(i);
                }
            }
        }
        System.out.println("Distance :- " + Arrays.toString(dist));
    }

    public static void main(String[] args) {
        FindShortestPath fsp = new FindShortestPath();
        int v = 4;

        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>(v);

        // Iterate over the arraylist to create arraylist to get each node of the graph.
        for (int i = 0; i < v; i++) {
            ar.add(new ArrayList<Integer>());

        }
        GraphImplementation.addEdgeToGraph(ar, 0, 1);
        GraphImplementation.addEdgeToGraph(ar, 1, 2);
        GraphImplementation.addEdgeToGraph(ar, 2, 3);
        GraphImplementation.addEdgeToGraph(ar, 0, 2);
        GraphImplementation.addEdgeToGraph(ar, 1, 3);
        GraphImplementation.printGraph(ar);
        fsp.countShortestPath(ar, v, 0);
    }
}
