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
    public boolean isBalanced(TreeNode root) {
        return heightDFS(root)!=-1;
    }
    private int heightDFS(TreeNode curr){
        if(curr==null)  return 0;

        int leftHeight = heightDFS(curr.left);
        if(leftHeight == -1) return -1;
        int rightHeight = heightDFS(curr.right);
        if(rightHeight==-1) return -1;

        if(Math.abs(leftHeight-rightHeight)>1)  return -1;
        return 1+Math.max(leftHeight,rightHeight);
    }
}