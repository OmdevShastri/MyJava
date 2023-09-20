package Javapaid.ArrayListsPractice;

import java.util.ArrayList;

public class PairSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        if (pairSumSol(list, 5)){
            System.out.println("Exists");
        }else {
            System.out.println("Does not");
        }
        if (pairSumSolTwoPoint(list, 5)){
            System.out.println("Exists");
        }else {
            System.out.println("Does not");
        }

    }

    //brute force
    private static boolean pairSumSol(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i+j == target){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean pairSumSolTwoPoint(ArrayList<Integer> list, int target) {
        int lp =0; int rp = list.size()-1;

        while (lp<rp){

            if (list.get(lp)+ list.get(rp) == target){
                return true;
            } else if (list.get(lp)+ list.get(rp) < rp) {
                lp++;
            } else if (list.get(lp)+ list.get(rp) > rp) {
                rp--;
            }

        }
        return false;
    }
}
