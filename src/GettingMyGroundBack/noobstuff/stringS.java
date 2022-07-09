package GettingMyGroundBack.noobstuff;

public class stringS {
    public static void main(String [] args){
        //Concatenation
        String half1 = " tredf";
        String half2 = "wer34";
        String full = half1+half2;
        System.out.println(full.length());

        for (int i=0; i<full.length(); i++){
            System.out.println(full.charAt(i));
        }
        //compare
        if(half1.equals(half2)){
            System.out.println("They same");
        }else {
            System.out.println("they arnt");
        }
        System.out.println(full.substring(2));

        String str= "458";
        int num = Integer.parseInt(str);
        System.out.println(num);
        String str1 = Integer.toString(num);
        System.out.println(str1.length());

    }
}
