package GettingMyGroundBack.noobstuff;

public class sorting {
    public static void prtArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void main(String [] args){
        int[] arr = {23,95,9,88,96};

        //bubble sort
//        for (int i=0; i<arr.length-1; i++){
//            for (int j=0; j<arr.length-i-1;j++){
//                if (arr[j]>arr[j+1]){
//                    int temp = arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
        //selection sort
        for (int i=0; i<arr.length-1; i++){
            int smallest=i;
            for (int j=i+1; j< arr.length; j++){

                //if (arr[i]>arr[j]){
                if (arr[smallest]>arr[j]){
                    smallest=j;
                    //temp = arr[i];
                    //arr[i]=arr[j];
                    //arr[j]=temp;
                }
                System.out.println("*");
            }
            int temp= arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        //insertion sort
        for (int i=1;i<arr.length; i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] =arr[j];
                j--;
            }
            //placement
            arr[j+1]=current;

        }

        prtArr(arr);

    }
}
