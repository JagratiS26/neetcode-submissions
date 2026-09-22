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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
       if(p.val>q.val)
         {
            TreeNode t=p;
            p=q;
            q=t;
         } 
         if(root==null)
          return root;
         if(p==null&&q==null)
          return null;
         if(p==null&&q!=null)
           return q;
          if(q==null&&p!=null)
            return p;
         if(root.val>=p.val&&root.val<=q.val)
           return root;
        else if(root.val>p.val&&root.val>q.val)
         return lowestCommonAncestor(root.left,p,q);
        else
         return lowestCommonAncestor(root.right,p,q);
    }
}
