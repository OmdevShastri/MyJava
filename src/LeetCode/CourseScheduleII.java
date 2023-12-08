package LeetCode;

import java.util.*;

public class CourseScheduleII {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            Map<Integer,List<Integer>> adjList = new HashMap<>();
            int[] indegree = new int[numCourses];
            int[] topologicalOrder = new int[numCourses];

            //creating adjacent list
            for (int i = 0; i < prerequisites.length; i++) {
                int post = prerequisites[i][0];
                int pre = prerequisites[i][1];
                List<Integer> list = adjList.getOrDefault(pre, new ArrayList<Integer>());
                list.add(post);
                adjList.put(pre,list);

                indegree[post]+=1;
            }
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < numCourses; i++) {
                if (indegree[i]==0){
                    q.add(i);
                }
            }
            int i=0;
            while (!q.isEmpty()){
                int node = q.remove();
                topologicalOrder[i++] =node;

                if (adjList.containsKey(node)){
                    for (Integer neighbor :
                            adjList.get(node)) {
                        indegree[neighbor]--;
                        if (indegree[neighbor]==0){
                            q.add(neighbor);
                        }
                    }
                }
            }
            if (i==numCourses){
                return topologicalOrder;
            }
            return new int[0];
        }
    }

}
