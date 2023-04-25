package RandomQs;

public class CountCharDigits {
    static void countChar(String s){
        int uC =0, iC =0, digits =0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c>='A'&&c<='Z')
                uC++;
            else if(c>='a'&&c<='z')
                iC++;
            else if(c>='0'&&c<='9')
                digits++;
        }
        System.out.println(uC + " " + iC + " " + digits);
    }
    public static void main(String[] args) {
        countChar("AccioJob@1");
    }
}
