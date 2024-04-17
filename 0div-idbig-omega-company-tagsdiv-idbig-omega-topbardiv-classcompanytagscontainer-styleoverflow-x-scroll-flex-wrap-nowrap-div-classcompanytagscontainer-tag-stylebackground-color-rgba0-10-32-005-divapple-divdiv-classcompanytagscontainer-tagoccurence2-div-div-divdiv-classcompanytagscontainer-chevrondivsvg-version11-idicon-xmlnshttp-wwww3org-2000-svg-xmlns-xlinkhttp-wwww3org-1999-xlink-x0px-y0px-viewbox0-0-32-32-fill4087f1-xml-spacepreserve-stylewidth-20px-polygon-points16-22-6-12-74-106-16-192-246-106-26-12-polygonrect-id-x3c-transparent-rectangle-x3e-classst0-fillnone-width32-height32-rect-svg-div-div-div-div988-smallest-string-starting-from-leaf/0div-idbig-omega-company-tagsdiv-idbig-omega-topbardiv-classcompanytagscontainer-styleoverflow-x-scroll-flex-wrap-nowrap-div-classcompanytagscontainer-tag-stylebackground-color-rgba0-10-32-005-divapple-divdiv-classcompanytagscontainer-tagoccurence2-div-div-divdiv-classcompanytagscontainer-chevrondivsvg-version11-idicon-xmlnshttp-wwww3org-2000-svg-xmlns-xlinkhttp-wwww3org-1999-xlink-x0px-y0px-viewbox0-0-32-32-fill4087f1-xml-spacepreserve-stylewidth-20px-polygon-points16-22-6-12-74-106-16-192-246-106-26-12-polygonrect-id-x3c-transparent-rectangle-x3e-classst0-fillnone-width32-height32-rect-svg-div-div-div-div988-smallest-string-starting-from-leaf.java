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
    String result = null;
    public String smallestFromLeaf(TreeNode root) {
        getPath(root,"");
        return result;
    }
    public void getPath(TreeNode node, String path) {
        if(node != null) {
            if(node.left == null && node.right == null) {
                path = (char)('a' + node.val) + path;
                if(result == null || path.compareTo(result) < 0) result = path;
            }
            if(node.left != null)
            getPath(node.left, (char)('a' + node.val) + path);
            if(node.right != null)
            getPath(node.right, (char)('a' + node.val) + path);
        }
    }

}