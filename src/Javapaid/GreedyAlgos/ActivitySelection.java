package Javapaid.GreedyAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int [] st = new int[]{1,3,0,5,8,5};
        int [] en = new int[]{2,4,6,7,9,9};

        //sorting
        int [][] activities = new int[st.length][3];
        for (int i = 0; i < st.length; i++) {
            activities[i][0] = i;
            activities[i][1]= st[i];
            activities[i][2] = en[i];
        }

        //lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o ->o[2]));

        //end time basis already sorted
        int maxAct = 0;
        ArrayList<Integer>  ans = new ArrayList<>();

        //1st act
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < en.length; i++) {
            if (activities[i][1]>=lastEnd){
                //select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println(maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
        }
        System.out.println();

    }
}
