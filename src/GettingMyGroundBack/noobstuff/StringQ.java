package GettingMyGroundBack.noobstuff;

import java.util.Scanner;

public class StringQ {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String username ="";
        //if()
        for (int i =0; i<email.length();i++){
            if (email.charAt(i)=='@'){
                break;

            }
            username += email.charAt(i);
        }
        System.out.println(username);

    }
}
