package Javapaid.Arrays;

public class trappedRainWater {//O(n)
    public static int trapWater(int [] heights){
        //calculate left max b
        int h = heights.length;
        int [] leftMax = new int[h];

        leftMax[0]= heights[0];
        for (int i = 1; i<h; i++){
            leftMax[i] = Math.max(heights[i], leftMax[i-1]);
        }

        //calculate right max b
        int[] rightMax = new int[h];
        rightMax[h-1]= heights[h-1];
        for (int i=h-2; i>=0; i--){
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
        }
        int trappedRainWater=0;
        //loop
        for (int i = 0; i < h; i++) {
            //waterlevel = min(leftmax b, rightmax b)
            int waterlevel = Math.min(leftMax[i],rightMax[i] );
            //trapped water = waterlevel - height
            trappedRainWater += waterlevel-heights[i];
        }
        return trappedRainWater;
    }
    public static void main(String  [] args){
        int [] height= {4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapWater(height));
    }
}
