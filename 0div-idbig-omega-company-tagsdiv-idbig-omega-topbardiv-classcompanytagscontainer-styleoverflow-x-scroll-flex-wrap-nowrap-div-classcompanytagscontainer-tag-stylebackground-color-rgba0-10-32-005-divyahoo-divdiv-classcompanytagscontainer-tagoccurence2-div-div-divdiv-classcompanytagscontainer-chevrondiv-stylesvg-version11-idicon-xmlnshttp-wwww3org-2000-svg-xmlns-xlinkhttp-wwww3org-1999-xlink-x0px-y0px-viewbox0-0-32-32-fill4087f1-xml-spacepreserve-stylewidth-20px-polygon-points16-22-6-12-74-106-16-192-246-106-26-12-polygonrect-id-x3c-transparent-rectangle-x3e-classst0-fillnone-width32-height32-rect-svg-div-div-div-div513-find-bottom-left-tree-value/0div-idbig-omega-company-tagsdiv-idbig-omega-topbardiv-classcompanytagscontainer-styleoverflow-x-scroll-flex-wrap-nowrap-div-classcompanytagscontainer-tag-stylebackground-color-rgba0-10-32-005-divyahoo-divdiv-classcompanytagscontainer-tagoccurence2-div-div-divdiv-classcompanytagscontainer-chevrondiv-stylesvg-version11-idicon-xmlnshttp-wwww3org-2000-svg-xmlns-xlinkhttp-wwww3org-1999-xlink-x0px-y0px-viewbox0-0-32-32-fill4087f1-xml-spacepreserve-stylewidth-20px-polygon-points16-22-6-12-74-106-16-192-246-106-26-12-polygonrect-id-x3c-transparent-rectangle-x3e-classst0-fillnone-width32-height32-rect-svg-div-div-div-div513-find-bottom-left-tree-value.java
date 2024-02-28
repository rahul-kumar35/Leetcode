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
    public int findBottomLeftValue(TreeNode root) {
        int temp = root.val;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                   break; 
                }else{
                    temp = q.peek().val;
                    q.add(null);
                }
            }else{
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
        return temp;
    }
}