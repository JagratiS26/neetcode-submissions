class Solution {
    public int firstMissingPositive(int[] nums) 
    {
    Arrays.sort(nums);
    int found=1;
    for(int i=0;i<nums.length;i++)
    {
      if(nums[i]>0)
      {
        if(found==nums[i])
         found++;
        if(found<nums[i])
          return found;
        if(found>nums[i])
         found=nums[i]+1;
      }
    }  
    return found;  
    }
}