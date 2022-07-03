package com.amanjaiswal.gfgdsacourse.graphs;

import java.util.*;

public class CycleDetectionUndirectedGraph {

    void detectCycleUsingBFS(ArrayList<ArrayList<Integer>> ar, int v, boolean visited[], int source, int parent) {

        visited[source] = true;

        Queue<Integer> cyclicQueue = new LinkedList<Integer>();

        while (cyclicQueue.isEmpty() == false) {

            int pop = cyclicQueue.poll();
            System.out.println("pop is :- " + pop);

            for (int i : ar.get(pop)) {
               
                if (visited[i] == false) {
                    i = parent;
                    visited[i] = true;
                    cyclicQueue.add(i);
                    
                }
                else if(i == parent){
                    System.out.println("Cycle exists");
                }
            }
        }
    }

    void BfsCycleCaller(ArrayList<ArrayList<Integer>> a, int v, int source) {

        boolean[] visited = new boolean[v + 1];

        detectCycleUsingBFS(a, v, visited, source, -1);
    }

    public static void main(String[] args) {
        int v = 6;

        CycleDetectionUndirectedGraph cdug = new CycleDetectionUndirectedGraph();

        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>(v);

        // Iterate over the arraylist to create arraylist to get each node of the graph.
        for (int i = 0; i < v; i++) {
            ar.add(new ArrayList<Integer>());

        }
        GraphImplementation.addEdgeToGraph(ar, 0, 1);
        GraphImplementation.addEdgeToGraph(ar, 1, 2);
        GraphImplementation.addEdgeToGraph(ar, 2, 4);
        GraphImplementation.addEdgeToGraph(ar, 4, 5);
        GraphImplementation.addEdgeToGraph(ar, 1, 3);
        GraphImplementation.addEdgeToGraph(ar, 2, 3);
        GraphImplementation.printGraph(ar);
        cdug.BfsCycleCaller(ar, v, 0);
    }

}
