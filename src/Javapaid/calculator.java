package Javapaid;

import java.util.*;

public class calculator {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        String button = sc.next();
        int b = sc.nextInt();;
        int result = 0;


        switch(button){
            case "+":
                result= a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                result=a/b;
                break;
            case "%":
                result=a%b;
                break;
            case "^":
                result=a^b;
                break;
            default:
                System.out.println("Invalid");

        }
        System.out.println("Here is the result "+ result);

    }
}

