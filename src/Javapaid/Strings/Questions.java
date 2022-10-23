package Javapaid.Strings;

import static java.lang.Math.*;

public class Questions {
    public static float findShortest(String path){
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            //East
            if (path.charAt(i)=='E'){
                x++;
            }//West
            else if (path.charAt(i)=='W') {
                x--;
            }//North
            else if (path.charAt(i)=='N') {
                y++;
            }//South
            else {
                y--;
            }

        }
        return (float) Math.sqrt(pow(x,2)+pow(y,2));
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        String path1 = "SN";
        System.out.println( findShortest(path1));
    }
}
