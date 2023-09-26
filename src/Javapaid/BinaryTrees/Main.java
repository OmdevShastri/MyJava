package Javapaid.BinaryTrees;
import Javapaid.BinaryTrees.MyBinaryTree.*;

import static Javapaid.BinaryTrees.MyBinaryTree.BinaryTree.topView;

public class Main {
    public static void main(String[] args) {
//        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1, 7,-1,-1};
//        MyBinaryTree.BinaryTree tree = new MyBinaryTree.BinaryTree();
//        MyBinaryTree.Node root= tree.buildTree(nodes);

//        int [] nodeSub = {2,4,-1,-1,5,-1,-1};
//        MyBinaryTree.BinaryTree subTree = new MyBinaryTree.BinaryTree();
//        MyBinaryTree.Node root1= subTree.buildTree(nodeSub);

//        MyBinaryTree.Node subRoot = new MyBinaryTree.Node(2);
//        subRoot.left = new MyBinaryTree.Node(4);
        //subRoot.right = new MyBinaryTree.Node(5);


//        tree.preOrder(root);
//        System.out.println();
//        tree.inOrder(root);
//        System.out.println();
//        tree.postOrder(root);
//        System.out.println();
//        tree.levelOrder(root);
//        System.out.println();
//        System.out.println(tree.height(root));
//        System.out.println(tree.countTNodes(root));
//        System.out.println(tree.sumT(root));
//        System.out.println(tree.diameter2(root).diam);
//        System.out.println(tree.diameter2(root).ht);
//        System.out.println(MyBinaryTree.BinaryTree.isSubTree(root, subRoot));

        Node root = new Node(1);
        root.left =new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        topView(root);
    }
}
