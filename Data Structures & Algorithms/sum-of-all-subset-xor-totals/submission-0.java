class Solution {
    public int subsetXORSum(int[] nums) 
    {
    int sum=0, n=nums.length;
    for(int i=0;i<(1<<n);i++)
    {
        int xor=0;
        for(int j=0;j<n;j++)
        {
            if((1&(i>>j))==1)
             xor=xor^nums[j];
        }
        sum+=xor;
    } 
    return sum;   
    }
}