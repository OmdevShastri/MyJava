package Javapaid.Arrays;

public class subArrs {
    public static void printSubArr(int[] arr){
        int total=0;
        int max_Sum=Integer.MIN_VALUE;
        int tSum=0;

        for (int i=0; i<arr.length; i++){
            //int start = i;
            for (int j=i;j< arr.length; j++){
                System.out.print("(");
                for (int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    tSum+=arr[k];
                }
                total++;
                System.out.println(")"+"  Sum of this sub array: "+tSum);
                if (max_Sum<tSum) max_Sum=tSum;
                tSum=0;
            }
            System.out.println();
        }
        System.out.println("The total number of sub arrays are: "+total);
        System.out.println("And Max sub Array sum is: "+max_Sum);
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,0};

        printSubArr(arr);

    }
}
