package Javapaid.BinaryTrees;

import java.util.ArrayList;
import java.util.HashMap;
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
        static class Info{
            int diam;
            int ht;

            public Info(int diam, int ht){
                this.diam = diam;
                this.ht = ht;

            }

        }
        public static Info diameter2(Node root){
            if (root==null){
                return new Info(0,0);
            }

            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);

            int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

            return new Info(diam, ht);

        }
        public static boolean isSubTree(Node root, Node subRoot){
            if (root==null){
                return false;
            }
            if (root.data == subRoot.data){
                if (isIdentical(root, subRoot)){
                    return true;
                }
            }

            return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
        }

        private static boolean isIdentical(Node node, Node subRoot) {
            if (node == null && subRoot ==null){
                return true;
            }else if (node == null || subRoot == null ||node.data != subRoot.data){
                return false;
            }
            if (!isIdentical(node.left, subRoot.left)){
                return false;
            }
            if (!isIdentical(node.right, subRoot.right)){
                return false;
            }

            return true;
        }
        static class InfoHD{
            Node node;
            int hd;
            public InfoHD(Node node, int hd){
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root){
            //level order
            Queue<InfoHD> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            int min =0; int max =0;
            q.add(new InfoHD(root, 0));
            q.add(null);

            while (!q.isEmpty()){
                InfoHD curr = q.remove();
                if (curr ==null){
                    if (q.isEmpty()){
                        break;
                    }else {
                        q.add(null);
                    }
                }else {
                    if (!map.containsKey(curr.hd)){
                        map.put(curr.hd ,curr.node);
                    }
                    if (curr.node.left !=null){
                        q.add(new InfoHD(curr.node.left, curr.hd-1));
                        min = Math.min(min, curr.hd-1);
                    }if (curr.node.right !=null){
                        q.add(new InfoHD(curr.node.right, curr.hd+1));
                        max = Math.max(max, curr.hd+1);
                    }
                }
            }
            for (int i = min; i <= max; i++) {
                System.out.println(map.get(i).data+ " ");
            }
            System.out.println();

        }
        public static void kLevel(Node root, int level, int k){
            if (root ==null){
                return;
            }
            if (level ==k){
                System.out.println(root.data+" ");
                return;
            }

            kLevel(root.left, level+1, k);
            kLevel(root.right, level+1, k);
        }

        public static boolean getPath(Node root, int n, ArrayList<Node> path){
            if (root ==null){
                return false;
            }
            path.add(root);
            if (root.data ==n){
                return true;
            }

            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if (foundLeft || foundRight){
                return true;
            }
            path.remove(path.size()-1);

            return false;
        }
        public static Node lca(Node root, int n1, int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root,n2, path2);

            //last common ancestor
            int i = 0;
            for (; i < path1.size() && i<path2.size(); i++) {
                if (path1.get(i) != path2.get(i)){
                    break;
                }
            }
            //last equal node -> i-1 th
            Node lca = path1.get(i-1);
            return lca;
        }

        public static Node lca2(Node root, int n1, int n2){
            if (root==null || root.data == n1 || root.data ==n2){
                return root;
            }

            Node leftLca = lca2(root.left, n1,n2);
            Node rightLca = lca2(root.right, n1,n2);

            //leftLCA = val rightLCA =null
            if (rightLca==null){
                return leftLca;
            }if (leftLca == null){
                return rightLca;
            }
            return root;
        }

    }

}
