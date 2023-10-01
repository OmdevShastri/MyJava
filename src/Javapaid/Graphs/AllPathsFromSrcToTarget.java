package Javapaid.Graphs;

import java.util.ArrayList;

public class AllPathsFromSrcToTarget extends MyGraph{
    protected static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[1].add(new Edge(0, 3, 1));

        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));
    }

    public static void prtAllPaths(ArrayList<Edge>[] graph, int src, int des, String path){
        if (src ==des){
            System.out.println(path+des);
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            prtAllPaths(graph,e.dest,des,path+src);
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v]; //null
        createGraph(graph);
        int src =5,des =1;
        prtAllPaths(graph,src,des,"");
    }
}
