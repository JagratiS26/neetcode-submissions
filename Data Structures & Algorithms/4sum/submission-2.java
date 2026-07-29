class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target)
    {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++)
            {
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                int l=j+1,h=nums.length-1;
                while(l<h)
                {
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[h];
                    if(sum==target)
                    {
                        ans.add(List.of(nums[i],nums[j],nums[l],nums[h]));
                        while(l<h&&nums[l]==nums[l+1]) l++;
                        while(l<h&&nums[h]==nums[h-1]) h--;
                        l++;h--;

                    }
                    else if(sum>target)
                    {
                        h--;
                    }
                    else
                     l++;
                }
            }
        }
        return ans;           
    }
}