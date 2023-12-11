package LeetCode;

public class InvertBinaryTree {
    public static void main(String[] args) {

    }
    class Solution{
        public TreeNode invertTree(TreeNode root) {
            if (root == null) return null;
            TreeNode node = new TreeNode(root.val);
            node.right = invertTree(root.left);
            node.val = root.val;
            node.left = invertTree(root.right);
            return node;
        }
        public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
        }
    }
}
