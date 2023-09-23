package Javapaid.Stacks;

import java.util.Stack;

public class MaxAreaHistogram {

    private static int maxArea(int[] arr) {
        int maxA =0;
        int [] nsr = new int[arr.length];
        int [] nsl = new int[arr.length];

        //nextSmallerRight
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >=0 ; i--) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsr[i] = arr.length;
            }else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //nextSmallerLeft
        s = new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nsl[i] = -1 ;
            }else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //curr Area : width = j-i-1 = nsr[]-nsl[]-1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currA = height*width;
            maxA = Math.max(maxA, currA);

        }


        return maxA;
    }

    public static void main(String[] args) {
        int [] arr = {2,1,5,6,2,3};
        System.out.println(maxArea(arr));
    }


}
