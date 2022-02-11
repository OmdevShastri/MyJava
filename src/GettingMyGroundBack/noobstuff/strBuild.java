package GettingMyGroundBack.noobstuff;

public class strBuild {
    public static void main(String []args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
//        //char at
//        System.out.println(sb.charAt(0));
//
//        //set char at index
//        sb.setCharAt(0,'P');
//        System.out.println(sb);
        sb.insert(0,'S');
        System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);

        sb.delete(2,3);
        System.out.println(sb);

    }
}
