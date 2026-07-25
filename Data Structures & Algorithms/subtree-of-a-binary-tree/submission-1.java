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
    TreeNode old;
    public boolean isSubtree(TreeNode p, TreeNode q) {
        if(p == null)
            return false;
        if(q == null)
            return true;

        if(isSameTree(p, q))
            return true;

        return isSubtree(p.left, q) || isSubtree(p.right, q);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            if(p != q)
                return false;
            return true;
        }

        if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        else
            return false;
    }
}
