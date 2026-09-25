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
    public int kthSmallest(TreeNode root, int k) 
    {
       List<Integer> ans=dfs(root);
       return ans.get(k-1);
        
    }
    List<Integer> dfs(TreeNode root)
    {
        List<Integer> ans= new ArrayList<>();
        if(root==null)
         return ans;
        ans.addAll(dfs(root.left));
        ans.add(root.val);
        ans.addAll(dfs(root.right));
        return ans;
    }
}
