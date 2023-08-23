package Javapaid.Recursion;

public class BinaryStrProblem {
    public static void bStrP(int n, int lastP, String str){

        if (n == 0) {
            System.out.println(str);
            return;
        }
        //work
//        if (lastP == 0) {
//            //sit 0 on chair n
//            bStrP(n-1, 0, str.append("0"));
//            //sit 1 on chair
//            bStrP(n-1, 1, str.append("1"));
//        }else {
//            //sit 0 on chair n
//            bStrP(n-1, 0, str.append("0"));
//        }
        //sit 0 on chair n
        bStrP(n-1, 0, str+"0");
        if (lastP == 0){
            //sit 1 on chair
            bStrP(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        bStrP(3, 0, "");
    }
}
