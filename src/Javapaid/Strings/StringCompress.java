package Javapaid.Strings;

import java.util.Scanner;

public class StringCompress {
    public static StringBuilder strCompress(StringBuilder str){ //O(n)
        StringBuilder strOut = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Integer count=1;
            while (i< str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            strOut.append(str.charAt(i));
            if (count>1)
                strOut.append(count);
        }
        return strOut;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        StringBuilder str0 = new StringBuilder("iiiaaaaaaabbcyyyyyy");
        System.out.println(strCompress(str0));
        System.out.println(strCompress(str));

    }
}
