package Javapaid.Arrays;

public class subArrs {
    public static void printSubArr(int[] arr){
        //O(n^3)
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
    public static int prefixSum(int[] arr){
        //O(n^2)
        int max_Sum=Integer.MIN_VALUE;
        int tSum=0;
        int [] prefix = new int[arr.length];
        prefix[0]=arr[0];
        //prefix sum calculation
        for (int i=1; i< arr.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for (int i=0; i<arr.length; i++){
            //int start = i;
            for (int j=i;j< arr.length; j++){
                //int end =j;
                tSum= i == 0? prefix[j]:prefix[j]-prefix[i-1];
                if (max_Sum<tSum) max_Sum=tSum;
                tSum=0;
            }
            System.out.println();
        }
        return max_Sum;
    }
    public static void kadanes(int [] arr){
        int mS=Integer.MIN_VALUE;
        int cS=0;

        for (int i=0; i<arr.length; i++){
            cS=cS+arr[i];
            if (cS<0){
                cS=0;
            }
            mS=Math.max(cS,mS);
        }
        System.out.println("Max sub Array sum using Kadanes Algo is: "+ mS);
    }
    public static void main(String [] args){
        int [] arr = {-2,-3,4,-1,-2,1,5,-3};

        //printSubArr(arr);
        System.out.println("Max sub array sum with prefix Sum method is: "+prefixSum(arr));
        kadanes(arr);
    }
}
