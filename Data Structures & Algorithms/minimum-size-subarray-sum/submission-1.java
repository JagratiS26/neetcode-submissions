class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
    int start=0,l=nums.length+1,sum=0;    
    for(int i=0;i<nums.length;i++)
    {
        sum+=nums[i];
        while(sum>=target)
        {
            l=Math.min(l,i-start+1);
            sum=sum-nums[start];
            start++;
        }
    }
    if(l==nums.length+1)
     return 0;
     else
      return l;
    }
}