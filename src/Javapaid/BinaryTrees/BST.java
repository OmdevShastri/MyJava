package Javapaid.BinaryTrees;

import java.util.ArrayList;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root, int val){
        if (root ==null){
            root =new Node(val);
            return root;
        }
        if (root.data>val){
            //left subtree
            root.left = insert(root.left,val);
        }else {
            //right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrderTraverse(Node root){
        if (root ==null){
            return;
        }
        inOrderTraverse(root.left);
        System.out.print(root.data+" ");
        inOrderTraverse(root.right) ;
    }

    public static boolean search(Node root, int key){
        if (root ==null){
            return false;
        }

        if (root.data == key){
            return true;
        }
        if (root.data > key){
            return search(root.left,key);
        }else {
            return search(root.right, key);
        }
    }

    public static Node remove(Node root, int val){
        if (root.data< val){
            root.right =remove(root.right,val);
        } else if (root.data>val) {
            root.left = remove(root.left,val);
        }
        else {
            //voila
            //case 1 - leaf node
            if (root.left == null && root.right == null){
                return null;
            }

            //case 2 - 1 child
            if (root.left == null){
                return root.right;
            }else if (root.right==null){
                return root.left;
            }
            //case 3 - 2 children
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = remove(root.right, IS.data);
        }
        return root;
    }

    private static Node findInOrderSuccessor(Node root) {
        while (root.left!=null){
            root = root.left;
        }
        return root;
    }

    public static void prtInRange(Node root, int k1, int k2){
        if (root == null){
            return;
        }
        if (root.data>=k1 && root.data<=k2){
            prtInRange(root.left, k1,k2);
            System.out.print(root.data +" ");
            prtInRange(root.right,k1,k2);
        } else if (root.data<k1) {
            prtInRange(root.left, k1,k2);
        }else {
            prtInRange(root.right, k1,k2);
        }
    }

    public static void prtRoot2Leaf(Node root, ArrayList<Integer> path){
        if (root ==null){
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right ==null){
            prtPath(path);
        }

        prtRoot2Leaf(root.left,path);
        prtRoot2Leaf(root.right,path);
        path.remove(path.size()-1);
    }

    private static void prtPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        int [] vals = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for (int i = 0; i < vals.length; i++) {
            root= insert(root, vals[i]);
        }

        inOrderTraverse(root);
//        if (search(root, 6)){
//            System.out.println("found");
//        }else {
//            System.out.println("not found");
//        }
//        root = remove(root, 5);
//        System.out.println();
//        prtInRange(root,5,12);
//        inOrderTraverse(root);
        System.out.println();
        prtRoot2Leaf(root,new ArrayList<>());
    }
}

