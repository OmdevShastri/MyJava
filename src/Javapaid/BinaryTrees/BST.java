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

    public static boolean isValidBST(Node root,Node min, Node max){
        if (root ==null){
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        } else if (max!=null && root.data>= max.data) {
            return false;
        }

        return isValidBST(root.left,min,root) && isValidBST(root.right, root, max);
    }
    public static Node createMirror(Node root){ //O(n)
        if (root ==null){
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left =rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void prtPreOrder(Node root){
        if (root ==null){
            return;
        }

        System.out.print(root.data + " ");
        prtPreOrder(root.left);
        prtPreOrder(root.right);

    }

    public static Node createBSTArray(int[] arr, int st, int en){
        if (st>en){
            return null;
        }
        int mid = (st+en)/2;

        Node root = new Node(arr[mid]);
        root.left = createBSTArray(arr, st, mid-1);
        root.right = createBSTArray(arr, mid+1, en);

        return root;
    }

    public static void getInOrder(Node root, ArrayList<Integer> inOrder){
        if (root== null){
            return;
        }

        getInOrder(root.left,inOrder);
        inOrder.add(root.data);
        getInOrder(root.right,inOrder);
    }

    public static Node balanceBST(Node root){
        //calc inOrder sequence
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInOrder(root,inOrder);

        //sorted InOrder  to balanced BST
        root = createBSTArray(inOrder,0,inOrder.size()-1);
        return root;
    }

    private static Node createBSTArray(ArrayList<Integer> arr, int st, int en) {
        if (st>en){
            return null;
        }
        int mid = (st+en)/2;

        Node root = new Node(arr.get(mid));
        root.left = createBSTArray(arr, st, mid-1);
        root.right = createBSTArray(arr, mid+1, en);

        return root;
    }

    public static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST =0;

    public static Info lasrgestBST(Node root){
        if (root == null){
            return new Info(true, 0, Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo = lasrgestBST(root.left);
        Info rightInfo = lasrgestBST(root.right);
        int size = leftInfo.size + rightInfo.size +1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if (root.data<= leftInfo.max|| root.data>=rightInfo.min){
            return new Info(false, size, min, max);
        }
        if (leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST,size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min ,max);
    }

    public static Node mergeBST(Node root1, Node root2){ //O(n+m) = O(n)
        //get inOrder seq
        //step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInOrder(root1, arr1);
        //step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInOrder(root2, arr2);

        //merge
        int i =0,j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while (i< arr1.size()&&i< arr2.size()){
            if (arr1.get(i)<=arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while (i< arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        while (j< arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }

        //sorted array to BST
        return createBSTArray(finalArr,0,finalArr.size()-1);
    }
    public static void main(String[] args) {
//        int [] vals = {8,5,3,6,10,11};
//        Node root = null;
//
//        for (int i = 0; i < vals.length; i++) {
//            root= insert(root, vals[i]);
//        }
//
//        inOrderTraverse(root);
////        if (search(root, 6)){
//            System.out.println("found");
//        }else {
//            System.out.println("not found");
//        }
//        root = remove(root, 5);
//        System.out.println();
//        prtInRange(root,5,12);
//        inOrderTraverse(root);
//        System.out.println();
//        prtRoot2Leaf(root,new ArrayList<>());
//        if (isValidBST(root,null,null)){
//            System.out.println("valid");
//        }else {
//            System.out.println(-1);
//        }

//        root = createMirror(root);
//        prtPreOrder(root);

//        int [] arr = {3,5,6,8,10,11,12};
//
//        Node root = createBSTArray(arr, 0, arr.length-1);
//        prtPreOrder(root);

//        Node root = new Node(50);
//        root.left = new Node(30);
//        root.left.left =new Node(5);
//        root.left.right =new Node(20);
//
//        root.right = new Node(60);
//        root.right.left = new Node(45);
//        root.right.right = new Node(70);
//        root.right.right.left = new Node(65);
//        root.right.right.right = new Node(80);

//        root = balaceBST(root);

//        prtPreOrder(root);

//        Info info = lasrgestBST(root);
//        System.out.println(maxBST);


        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);


        Node root = mergeBST(root1,root2);
        prtPreOrder(root);
    }
}

