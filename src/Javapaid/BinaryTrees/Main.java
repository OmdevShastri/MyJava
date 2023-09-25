package Javapaid.BinaryTrees;

public class Main {
    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        MyBinaryTree.BinaryTree tree = new MyBinaryTree.BinaryTree();
        MyBinaryTree.Node root= tree.buildTree(nodes);


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
        System.out.println(tree.diameter2(root).diam);
        System.out.println(tree.diameter2(root).ht);
    }
}
