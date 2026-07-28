class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=nums[i]+prefix[i-1];
        }
        int count=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(prefix[i]==k)
               count++;
            for(int j=i-1;j>=0;j--)
            {
                if(prefix[i]-prefix[j]==k)
                  count++;
            }
        }
        return count;
    }
}