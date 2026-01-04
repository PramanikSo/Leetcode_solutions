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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        preOrder(root,ans);
        return ans;
    }
    // Iterative
    // private void preOrder(TreeNode node, List<Integer>ans){
    //     if(node==null){
    //         return;
    //     }
    //     Stack<TreeNode> stack=new Stack();
    //     stack.push(node);
    //     while(!stack.isEmpty()){
    //         TreeNode currNode = stack.pop();
    //         ans.add(currNode.val);
    //         if(currNode.right!=null){
    //             stack.push(currNode.right);
    //         }
    //         if(currNode.left!=null){
    //             stack.push(currNode.left);
    //         }

    //     }
    // }

    // Recursive
    private void preOrder(TreeNode node, List<Integer>ans){
        if(node==null){
            return;
        }
        ans.add(node.val);
        preOrder(node.left,ans);
        preOrder(node.right,ans);
    }
}