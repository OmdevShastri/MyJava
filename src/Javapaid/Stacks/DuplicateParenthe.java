package Javapaid.Stacks;

import java.util.Stack;

public class DuplicateParenthe {
    private static boolean dupesPresent(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if (ch == ')' || ch == '}' || ch == ']'){
                int count=0;
                //|| s.peek() !='{' ||s.peek() != '[' //could't make it work
                while (s.peek() != '(' ){
                    s.pop();
                    count++;
                }
                if (count<1){
                    return true;//duplicates present
                }else {
                    s.pop(); //opening pair
                }

            }else {
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //valid string
        String str1 = "((a+b)+(c+d))";
        String str2 = "((a+b))";
        System.out.println(dupesPresent(str1));
        System.out.println(dupesPresent(str2));
    }


}
