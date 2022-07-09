package Practice;
import java.util.Scanner;

public class Oddnums {

        public static int countOdds(int low, int high) {

//            int low = sc.nextInt();
//            int high = sc.nextInt();
//            int count = 0;
//            for (int i = low; i <= high; i++) {
//                if (i % 2 != 0) {
//                    count++;
//                }
//            }
            //return count;
            return (high+1)/2 - low/2;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int low = sc.nextInt();
            int high = sc.nextInt();
            System.out.println(countOdds(low,high));
        }
    }
