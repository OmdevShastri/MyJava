package Javapaid.GreedyAlgos;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int [] val = {60,100,120};
        int[] wt = {10,20,30};
        int W = 50;

        double [][] ratio = new double[val.length][2];
        //0th col = idx; 1st col = ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] =val[i]/(double)wt[i];
        }

        //ascending
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int cap = W;
        int finalVal = 0;
        for (int i = ratio.length-1; i >=0; i--) {
            int idx = (int) ratio[i][0];
            if (cap >= wt[idx]){
                finalVal += val[idx];
                cap -= wt[idx];
            }else {
                //include fractional
                finalVal += (ratio[i][1] * cap);
                cap=0;
                break;
            }
        }
        System.out.println(finalVal);
    }
}
