import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        int Tusla =0;


        int Nutan = 0;
        for(int i = 0; i<n; i++){
            if(str.charAt(i) == 'N')
                Nutan++;
            else if(str.charAt(i)== 'T')
                Tusla++;
//            else
//                System.out.println("Error");

        }
        if(Nutan >Tusla){
            System.out.println("Nutan");
        }else
            System.out.println("Tusla");

    }
}
