class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
       List<List<Integer>> ans = new ArrayList<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length-2;i++)
       {
         if(i > 0 && nums[i] == nums[i-1])
        continue;
        int j=i+1,h=nums.length-1;
        while(j<h)
        {
            int sum=nums[j]+nums[h]+nums[i];
            if(sum==0)
            {
                List<Integer> t= new ArrayList<>();
                t.add(nums[i]);t.add(nums[j]);t.add(nums[h]);
                ans.add(t);
                j++;
                h--;
                while(j < h && nums[j] == nums[j-1])
                  j++;
                while(j<h && nums[h] == nums[h+1])
                  h--;
            }
            else if(sum>0)
             h--;
            else
             j++; 
        }
       } 
       return ans;
    }
}
