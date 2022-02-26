    package TCS_CodeVitaSeason10;

    import java.util.Scanner;

    public class f_MaxSum {
        public static int SumA(int arr[], int W){
            int tMax=0,mSum=0;

            for (int i=0; i< arr.length-(W);i+=++W){
                for (int j =0; j<W;j++) {
                    tMax +=arr[i+j];
                }
                if (tMax>mSum) {
                    mSum += tMax;
                }
                tMax=0;
            }
            return mSum;
        }
            public static int SumB(int arr[], int W, int D){
                int tMax1=0,tMax0=0,mSum=0;
                for (int i=0; i< arr.length-(W+D);i+=(W+D+1)){

                    for (int j =0; j<(W+D);j++) {
                        tMax1 +=arr[i+j];
                    }
                    if (tMax1>tMax0) {
                        mSum += tMax1;
                    }
                    tMax0=tMax1;
                    tMax0=0;
                }
                return mSum;
            }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            //input
            int N=8,W=5,D=-2;
//            int N = sc.nextInt();
//            int W = sc.nextInt();
//            int D = sc.nextInt();
            //System.out.println(N+" "+W+" "+D);

            //int[] arr = new int[N];
            int[] arr={4, 5, 6, 1, 2 ,7, 8, 9};
//            for (int i=0; i<N; i++){
//                arr[i]=sc.nextInt();
//            }

            //output
            int sumA= SumA(arr, W);
            System.out.println(sumA);
            int sumB= SumB(arr, W, D);
            System.out.println(sumB);
            if (sumA>sumB){
                System.out.println("Wrong"+Math.abs(sumA-sumB));
            }else if (sumA<sumB){
                System.out.println("Right"+Math.abs(sumA-sumB));
            }else
                System.out.println("Both are Right");


        }
            }
