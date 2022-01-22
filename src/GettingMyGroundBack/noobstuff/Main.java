package GettingMyGroundBack.noobstuff;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        char op =sc.next().charAt(0);
        double out=0;
        /*String name = sc.nextLine();
        System.out.println(name);
        //if else
        int a =sc.nextInt();
        int b = sc.nextInt();

        if (a==b){
            System.out.println("They equal");
        }else if (a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("a is lesser");
        }
        //switch
        switch (a){
            case 1 : System.out.println("hmm");
            break;
            case 2 :
                System.out.println("great");
                break;
            case 3 :
                System.out.println("lovely"); break;
            default:
                System.out.println("You are out of luck");

        }
        */
        //HW
        switch (op) {
            case '+' -> out = a + b;
            case '-' -> out = a - b;
            case '*' -> out = a * b;
            case '/' -> out = a / b;
            case '%' -> out = a % b;
            default -> System.out.println("My calc small");
        }

        System.out.println("Processing... \n"+"Result: "+ out);

    }
}
