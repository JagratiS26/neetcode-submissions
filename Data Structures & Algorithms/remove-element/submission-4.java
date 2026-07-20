class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==val)
          {
            int j=i;
            while(j<nums.length&& nums[j]==val)
             j++;
            if(j==nums.length)
             return i;
            else
            {
              int temp =nums[i];
              nums[i]=nums[j];
              nums[j]=temp;
            }
            i--;
          }
        }
        return nums.length;
        
    }
}