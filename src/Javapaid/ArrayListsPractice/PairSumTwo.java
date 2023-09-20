package Javapaid.ArrayListsPractice;

import java.util.ArrayList;

public class PairSumTwo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        if (pairSumSol(list, target)){
            System.out.println("Exists");
        }else {
            System.out.println("Does not");
        }
        if (pairSumSolTwoPoint(list, target)){
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
                } else if (i ==j) {
                    continue;
                }
            }
        }
        return false;
    }

    private static boolean pairSumSolTwoPoint(ArrayList<Integer> list, int target){
        int bp =-1;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i)> list.get(i+1)){
                bp =1;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while (lp !=rp){
            if (list.get(lp)+ list.get(rp) == target){
                return true;
            } else if (list.get(lp)+ list.get(rp) < target) {
                lp = (lp+1)%n;
            } else if (list.get(lp)+ list.get(rp) > rp) {
                rp = (n+ rp -1)%n;
            }
        }
        return false;
    }
}
