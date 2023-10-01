package Javapaid.Graphs;

import java.util.ArrayList;

public class CycleDetectionDirectedDFS extends MyGraph{
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        //0-vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v]; //null
        createGraph(graph);
    }
}
