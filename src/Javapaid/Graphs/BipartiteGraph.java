package Javapaid.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph extends MyGraph{
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        //0-vertex
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
    }
    public static boolean isBipartite(ArrayList<Edge>[] graph ){
        int [] col = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] =-1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i]==-1){
                q.add(i);
                col[i]=0;
                while (!q.isEmpty()){
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j); //e.dest
                        if (col[e.dest]==-1){
                            int nextcol = col[curr] == 0 ?1:0;
                            col[e.dest] = nextcol;
                            q.add(e.dest);
                        } else if (col[e.dest]==col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v]; //null
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
