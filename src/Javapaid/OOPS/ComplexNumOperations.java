package Javapaid.OOPS;

import java.util.Scanner;

public class ComplexNumOperations {
    public static void main(String[] args) {
        Complex comp= new Complex();
        Scanner sc = new Scanner(System.in);

        Complex.setA(sc.nextInt());
        Complex.setB(sc.nextInt());
        Complex.setC(sc.nextInt());
        Complex.setD(sc.nextInt());

        comp.getSum();
        comp.getSDiff();
        comp.getProd();
    }

}
class Complex{
    static int a,b,c,d;

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Complex.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Complex.b = b;
    }

    public static int getC() {
        return c;
    }

    public static void setC(int c) {
        Complex.c = c;
    }

    public static int getD() {
        return d;
    }

    public static void setD(int d) {
        Complex.d = d;
    }

    void getSum(){
        System.out.println((a+c) +" "+ (b+d)+"i");
    }
    void getSDiff(){
        System.out.println((a-c) +" "+ (b-d)+"i");
    }
    void getProd(){
        System.out.println(((a*c)-(b*d)) +" "+ ((a*d)+(b*c))+"i");
    }
}
