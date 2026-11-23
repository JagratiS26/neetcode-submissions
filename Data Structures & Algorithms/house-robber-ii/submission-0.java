class Solution {
    public int rob(int[] nums) 
    {
    int n=nums.length;
    int m1[]=new int[n];
    int m[]=new int[n];
    if(n==1)
     return nums[0];
    m1[0]=nums[0];
    m1[1]=Math.max(nums[0],nums[1]);
    for(int i=2;i<n-1;i++)
    {
      m1[i]=Math.max(m1[i-1],nums[i]+m1[i-2]);
    }
    m[1]=nums[1];
    for(int i=2;i<n;i++)
     m[i]=Math.max(m[i-1],nums[i]+m[i-2]);
     return Math.max(m[n-1],m1[n-2]);
    }
    
}
