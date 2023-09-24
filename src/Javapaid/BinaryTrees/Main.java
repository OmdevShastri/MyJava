package Javapaid.BinaryTrees;

public class Main {
    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        MyBinaryTree.BinaryTree tree = new MyBinaryTree.BinaryTree();
        MyBinaryTree.Node root= tree.buildTree(nodes);


        tree.preOrder(root);
    }
}
