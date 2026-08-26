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
    TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        bst(root, p, q, root);
        return res;
    }

    public void bst(TreeNode node, TreeNode p, TreeNode q, TreeNode com) {
        if(node == null) return;

        com = new TreeNode(node.val);
        if(p.val < node.val && q.val < node.val)
            bst(node.left, p, q, com);
        else if (p.val > node.val && q.val > node.val)
            bst(node.right, p, q, com);
        else{
            res = com;
            return;
        }
    }
}
