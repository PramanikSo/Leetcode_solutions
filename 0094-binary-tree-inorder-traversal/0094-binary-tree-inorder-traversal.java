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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        inorder(ans,root);
        return ans;
    }
    private void inorder(List<Integer>ans,TreeNode curr){
        if(curr==null)  return;
        
        inorder(ans,curr.left);
        ans.add(curr.val);
        inorder(ans,curr.right);
    }
}