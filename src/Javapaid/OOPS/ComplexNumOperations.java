package Javapaid.OOPS;

import java.util.Scanner;

//public class ComplexNumOperations {
//    public static void main(String[] args) {
//        Complex comp= new Complex();
//        Scanner sc = new Scanner(System.in);
//
//        Complex.setA(sc.nextInt());
//        Complex.setB(sc.nextInt());
//        Complex.setC(sc.nextInt());
//        Complex.setD(sc.nextInt());
//
//        comp.getSum();
//        comp.getSDiff();
//        comp.getProd();
//    }
//
//}
class ComplexNumOperations {
    public static void main(String[] args){
        Complex c = new Complex(4,4);
        Complex d = new Complex(4,4);
        Complex e = Complex.add(c,d);
        Complex f = Complex.diff(c,d);
        Complex g = Complex.product(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
class Complex{
//    static int a,b,c,d;
//
//    public static int getA() {
//        return a;
//    }
//
//    public static void setA(int a) {
//        Complex.a = a;
//    }
//
//    public static int getB() {
//        return b;
//    }
//
//    public static void setB(int b) {
//        Complex.b = b;
//    }
//
//    public static int getC() {
//        return c;
//    }
//
//    public static void setC(int c) {
//        Complex.c = c;
//    }
//
//    public static int getD() {
//        return d;
//    }
//
//    public static void setD(int d) {
//        Complex.d = d;
//    }
//
//    void getSum(){
//        System.out.println((a+c) +" "+ (b+d)+"i");
//    }
//    void getSDiff(){
//        System.out.println((a-c) +" "+ (b-d)+"i");
//    }
//    void getProd(){
//        System.out.println(((a*c)-(b*d)) +" "+ ((a*d)+(b*c))+"i");
//    }
int real;
    int imag;
    public Complex(int r, int i){
        real = r;
        imag = i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    public static Complex product(Complex a, Complex b){
        return new
                Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }
    public void printComplex(){
        if(real == 0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(imag == 0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}
