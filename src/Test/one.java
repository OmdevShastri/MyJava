package Test;

public class one {
    public static void main(String[] args) {
        int n =15;
        for (int i = 1; i <= n; i++){
            int r3 = i%3;
            int r5 = i%5;
            if(i==1){
                System.out.println(i);
                continue;
            }
            if(r3==0 && r5==0){
                System.out.println("FizzBuzz");
            }else if(r3==0){
                System.out.println("Fizz");
            }else if(r5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }

        }
    }
}
