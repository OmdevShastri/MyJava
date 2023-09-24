package Javapaid.GreedyAlgos;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLenChainPairs {
    public static void main(String[] args) {
        int [][] pair = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pair, Comparator.comparingDouble(o ->o[1]));

        int chainLen =1;
        int chainEnd = pair[0][1]; //last selected
        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0]>chainEnd){
                chainLen++;
                chainEnd = pair[i][1];
            }
        }
        System.out.println(chainLen);
    }
}
