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

        if(root == null)
            return 0;

        return max(root, 0);
    }

    public int max(TreeNode root, int max){
        if(root == null)
            return max;
        max++;
        return Math.max(max(root.left, max), max(root.right, max));
    }
}
