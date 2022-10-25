package Javapaid.Strings;

public class StringFuncs {
    public static String subStr(String str, int si, int ei){
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String a = "Tony";
        String b = "Tony";
        String c = new String("Tony");
        if (a == c) {
            System.out.println("Equal");
        } else {
            System.out.println("not Equal");
        }
        if (a.equals(c)) {
            System.out.println("Equal");
        } else {
            System.out.println("not Equal");
        }

        System.out.println(subStr("tensile",0,3));
        String str = "tensile";
        System.out.println(str.substring(0,3));

        String [] fruits = {"apples","banana","mango"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i])<0){
                largest= fruits[i];
            }
        }
        System.out.println(largest);
    }
}
