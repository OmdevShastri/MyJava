package Javapaid.Graphs;

import java.util.ArrayList;

public class CycleDetectionUndirectedDFS extends MyGraph{
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        //0-vertex
        graph[0].add(new Edge(0,1,1));
//        graph[0].add(new Edge(0,2,1));
        graph[0].add(new Edge(0,3,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,1));

//        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,1,1));

        graph[3].add(new Edge(3,0,1));
        graph[3].add(new Edge(3,4,1));

        graph[4].add(new Edge(4,3,1));
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]){
                if (detectCycleUtil(graph,vis, i, -1)){
                    return true;
                    //cycle exists in one of the parts
                }
            }
        }
        return false;
    }

    private static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            //case 3
            if (!vis[e.dest]){
                if (detectCycleUtil(graph,vis,e.dest,curr))
                    return true;
            }
            //case 1
            else if (vis[e.dest]&&e.dest!=par) {
                return true;
            }
            //case 2: continue-> do nothing

        }
        return false;
    }

    public static void main(String[] args) {
        int v =5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);

        System.out.println( detectCycle(graph));

    }
}
