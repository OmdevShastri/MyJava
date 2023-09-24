package Javapaid.GreedyAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JobSequencing {
    public static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id =i;
            profit = p;
            deadline = d;
        }
    }
    public static void main(String[] args) {
        int [][] jobsInfo = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> job = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            job.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(job, (a,b)->b.profit- a.profit); //descending

        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;
        for (int i = 0; i < job.size(); i++) {
            Job curr = job.get(i);
            if (curr.deadline>time) {
                seq.add(curr.id);
                time++;
            }
        }

        System.out.println("max jobs "+ seq.size());
        System.out.println(seq);
    }
}
