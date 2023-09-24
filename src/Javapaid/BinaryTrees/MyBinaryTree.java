package Javapaid.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class MyBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public static Node buildTree(int [] nodes){
            idx++;
            if (nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preOrder(Node root){
            if (root ==null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root){
            if (root ==null){
                System.out.print(-1+" ");
                return;
            }

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if (root ==null){
                System.out.print(-1+" ");
                return;
            }
            postOrder(root.right);
            postOrder(root.left);
            System.out.print(root.data + " ");
        }
        public static void levelOrder(Node root){
            if (root ==null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node currNode = q.remove();
                if (currNode == null){
                    System.out.println();
                    if (q.isEmpty()){
                        break;
                    }else {
                        q.add(null);
                    }
                }else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if (currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static int height(Node root){
            if (root ==null){
                return 0;
            }
            int lh= height(root.left);
            int rh = height(root.right);

            return Math.max(lh,rh)+1;
        }
        public static int countTNodes(Node root){
            if (root==null){
                return 0;
            }
            int lcount = countTNodes(root.left);
            int rcount = countTNodes(root.right);

            return lcount+rcount+1;
        }
        public static int sumT(Node root){
            if (root==null){
                return 0;
            }
            return sumT(root.left)+sumT(root.right)+root.data;
        }
        public static int diameter(Node root){
            if (root==null){
                return 0;
            }

            int ldiam = diameter(root.left);
            int lht = height(root.left);
            int rdiam = diameter(root.right);
            int rht = height(root.right);

            int sDiam = lht+rht+1;

            return Math.max(sDiam,(Math.max(ldiam,rdiam)));
        }
    }

}
