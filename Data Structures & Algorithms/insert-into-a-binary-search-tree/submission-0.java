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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode n= new TreeNode(val);
        if(root==null)
         return n;
        if(root.val>val&&root.left==null)
        {
            root.left=n;
        }
        else if(root.val>val)
         insertIntoBST(root.left,val);
        else if(root.val<val&&root.right==null)
          root.right=n;
        else if(root.val<val)
          insertIntoBST(root.right,val);
        return root;

    }
}