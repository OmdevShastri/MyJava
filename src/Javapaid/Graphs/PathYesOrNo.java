package Javapaid.Graphs;

import java.util.ArrayList;

public class PathYesOrNo extends MyGraph {
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis){
        if (src ==dest){
            return true;
        }
        vis[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            //e.dest = neighbor
            if (!vis[e.dest]&& hasPath(graph,e.dest,dest,vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v =7;
        ArrayList<Edge>[] graph =new ArrayList[v];
        createGraph(graph);
        System.out.println(hasPath(graph,0,7,new boolean[v]));
    }
}
