package Javapaid.Tries;

public class StartWithProblem {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;
        public Node(){
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if (curr.children[idx] == null){
                curr.children[idx] = new Node();

            }
            curr = curr.children[idx];
        }
        curr.eow =true;
    }

    public static boolean search(String key){
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i)-'a';
            if (curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static boolean startsWith(String prefix){
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i)-'a';
            if (curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String [] word = {"apple","app", "mango", "man", "woman"};
        String prefix = "app";
        String pre2 = "moon";

        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        System.out.println(startsWith(pre2));
    }
}
