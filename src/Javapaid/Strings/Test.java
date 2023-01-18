package Javapaid.Strings;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));

        String str3 = "ApnaCollege".replace("l","");
        System.out.println(str3);
    }
}
