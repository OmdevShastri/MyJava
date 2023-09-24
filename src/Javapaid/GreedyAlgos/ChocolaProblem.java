package Javapaid.GreedyAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n=4, m=6;
        Integer [] costVert ={2,1,3,1,4}; //m-1
        Integer [] costHorz = {4,1,2}; //n-1

        Arrays.sort(costVert, Collections.reverseOrder());
        Arrays.sort(costHorz, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost =0;

        while (h<costHorz.length && v<costVert.length){
            //vertical cost < horz cost
            if (costVert[v]<=costHorz[h]){//horizontal cut
                cost +=(costHorz[h]*vp);
                hp++;
                h++;
            }else {//vertical cut
                cost+=(costVert[v]*hp);
                vp++;
                v++;
            }
        }
        while (h<costHorz.length){
            cost+=(costHorz[h]*vp);
            hp++;
            h++;
        }
        while (v<costVert.length){
            cost+=(costVert[v]*hp);
            vp++;
            v++;
        }

        System.out.println(cost);
    }
}
