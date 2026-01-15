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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        // postOrder(ans,root);
        iterativePostOrderUsingTwoStack(ans,root);
        return ans;
    }

    private void postOrder(List<Integer>ans,TreeNode curr){
        if(curr==null)  return;

        postOrder(ans,curr.left);
        postOrder(ans,curr.right);
        ans.add(curr.val);
    }

    private void iterativePostOrderUsingTwoStack(List<Integer>ans,TreeNode curr){
        if(curr==null)  return;
        Stack<TreeNode>s1=new Stack<>();
        Stack<TreeNode>s2=new Stack<>();
        s1.push(curr);

        while(!s1.isEmpty()){
            curr=s1.pop();
            s2.push(curr);
            if(curr.left!=null){
                s1.push(curr.left);
            }
            if(curr.right!=null){
                s1.push(curr.right);
            }
        }

        while(!s2.isEmpty()){
            ans.add(s2.pop().val);
        }
    }
}