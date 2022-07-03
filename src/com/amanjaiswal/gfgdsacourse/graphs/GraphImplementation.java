package com.amanjaiswal.gfgdsacourse.graphs;

import java.util.*;

public class GraphImplementation {

    // Adjancey list implemetation of Graph.

    // Take ArrayList of ArrayList. => It will have all the nodes in it as a
    // secondary ArrayList.

    // Create a Graph.

    public static void addEdgeToGraph(ArrayList<ArrayList<Integer>> arlist, int u, int v) {

        // Input u and v are the edges and hence the function adds the edge from u to v
        // and (v to u)as it a undirected graph.
        arlist.get(u).add(v);
        arlist.get(v).add(u);
    }

    // Print all the nodes of the graph.
    public static void printGraph(ArrayList<ArrayList<Integer>> arl) {
        for (int i = 0; i < arl.size(); i++) {
            for (int j = 0; j < arl.get(i).size(); j++) {
                System.out.print(arl.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int v = 4;

        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>(v);

        // Iterate over the arraylist to create arraylist to get each node of the graph.
        for (int i = 0; i < v; i++) {
            ar.add(new ArrayList<Integer>());

        }
        addEdgeToGraph(ar, 0, 1);
        addEdgeToGraph(ar, 0, 2);
        addEdgeToGraph(ar, 1, 2);
        addEdgeToGraph(ar, 1, 3);
        printGraph(ar);
    }
}
