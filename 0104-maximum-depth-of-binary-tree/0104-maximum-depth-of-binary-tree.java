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
    public int maxDepth(TreeNode root) {
        if(root==null)  return 0;
    /*-------------------using recursion DFS
        // int leftHeight=maxDepth(root.left);
        // int rightHeight=maxDepth(root.right);

        // return 1+Math.max(leftHeight,rightHeight);
        ------------------------*/

        /*-----------using BFS (level order Traversal) */
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int depth=0;
        
        while(!q.isEmpty()){
            int size=q.size();
            depth++;
            for(int i=1;i<=size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return depth;

    }

}