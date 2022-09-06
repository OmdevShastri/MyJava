package Javapaid;

import java.util.*;

public class calculator {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First: ");
        int a =sc.nextInt();
        System.out.print("Give an operator: ");
        String button = sc.next();
        System.out.print("Enter 2nd Operand: ");
        int b = sc.nextInt();
        int result = 0;


        switch (button) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
            case "%" -> result = a % b;
            case "^" -> result = a ^ b;
            default -> System.out.println("Invalid");
        }
        System.out.println("Here is the result "+ result);

    }
}

