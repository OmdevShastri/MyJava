package Javapaid.Arrays;

public class didSomethinRepeat {
    public static boolean atLeastTwice(int [] arr){
        int check = 0;
        for (int i = 0; i < arr.length-1; i++) {
            check= arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]==check){
                    return true;
                }else {
                    continue;
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
        int [] arr= new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(atLeastTwice(arr));
    }
}
