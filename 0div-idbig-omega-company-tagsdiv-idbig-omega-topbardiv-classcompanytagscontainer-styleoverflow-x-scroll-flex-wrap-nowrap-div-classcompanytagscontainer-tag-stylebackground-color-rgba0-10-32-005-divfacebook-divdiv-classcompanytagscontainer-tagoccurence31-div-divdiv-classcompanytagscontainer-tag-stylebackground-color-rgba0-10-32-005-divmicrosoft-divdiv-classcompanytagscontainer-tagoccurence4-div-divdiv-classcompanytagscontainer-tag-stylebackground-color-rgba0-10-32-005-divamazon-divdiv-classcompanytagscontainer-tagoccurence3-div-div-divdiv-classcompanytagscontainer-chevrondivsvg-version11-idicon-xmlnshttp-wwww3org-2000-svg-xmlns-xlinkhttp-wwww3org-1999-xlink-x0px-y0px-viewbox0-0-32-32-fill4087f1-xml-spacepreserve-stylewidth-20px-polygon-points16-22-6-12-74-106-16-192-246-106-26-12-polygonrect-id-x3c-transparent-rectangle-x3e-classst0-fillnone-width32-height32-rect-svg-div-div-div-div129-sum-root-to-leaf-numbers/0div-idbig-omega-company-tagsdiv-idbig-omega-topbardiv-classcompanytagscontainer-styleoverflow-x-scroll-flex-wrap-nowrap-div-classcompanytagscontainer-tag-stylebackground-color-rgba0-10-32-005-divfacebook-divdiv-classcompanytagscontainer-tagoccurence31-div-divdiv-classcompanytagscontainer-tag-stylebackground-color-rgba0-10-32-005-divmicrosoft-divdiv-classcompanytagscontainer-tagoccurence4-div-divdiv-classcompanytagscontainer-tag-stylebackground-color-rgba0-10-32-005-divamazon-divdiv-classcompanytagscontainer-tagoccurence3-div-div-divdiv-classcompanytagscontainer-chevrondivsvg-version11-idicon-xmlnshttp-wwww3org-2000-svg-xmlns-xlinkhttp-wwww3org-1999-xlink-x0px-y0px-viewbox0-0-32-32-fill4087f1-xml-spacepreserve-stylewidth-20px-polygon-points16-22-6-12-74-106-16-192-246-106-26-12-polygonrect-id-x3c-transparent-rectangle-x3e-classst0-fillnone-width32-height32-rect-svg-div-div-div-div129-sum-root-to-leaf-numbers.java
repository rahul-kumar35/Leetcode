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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        if(root.left == null && root.right == null) return root.val;
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode root, int val){
    if(root == null) return;
        val = val*10 + root.val;
        if(root.left == null && root.right == null){
            sum += val;
            return;
        }
        dfs(root.left, val);

        dfs(root.right, val);
    }
}