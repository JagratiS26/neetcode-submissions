class Solution {
    public int firstMissingPositive(int[] nums) 
    { 
     int freq[]=new int[nums.length+1];
     for(int i=0;i<nums.length;i++)
     {
      if(nums[i]>0&&nums[i]<=nums.length)
      freq[nums[i]-1]++;
     } 
     for(int i=0;i<=nums.length;i++)
      if (freq[i]==0)
        return i+1;
      return nums.length+1;
    }
}