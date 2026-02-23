/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        int result=buildTree(root);
        return result;
    }

    public static int buildTree(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftNodes=buildTree(root.left);
        int rightNodes=buildTree(root.right);

        if (root.left == null) return rightNodes + 1;
        if (root.right == null) return leftNodes + 1;

        return Math.min(leftNodes,rightNodes)+1;
    }
}