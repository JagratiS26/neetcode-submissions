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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)
         return ans;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int l=-101;
            for(int i=q.size();i>0;i--)
            {
                TreeNode x=q.poll();
                if(x!=null)
                {
                    l=x.val;
                    q.add(x.left);
                    q.add(x.right);
                }
            }
            if(l>-101)
             ans.add(l);
        }
        return ans;
    }
}
