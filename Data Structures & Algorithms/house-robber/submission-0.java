class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
         return nums[0];
        int memo[]= new int[n];
        memo[0]=nums[0];
        memo[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            int take=nums[i]+memo[i-2];
            int not=0+memo[i-1];
            memo[i]=Math.max(take,not);
        }
        return memo[n-1];
        
    }
}
