class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target)
    {
        Arrays.sort(nums);
        Set<List<Integer>> ans= new HashSet<>();
        for(int i=0;i<nums.length-3;i++)
        {
            for(int j=i+1;j<nums.length-2;j++)
            {
                int l=j+1,h=nums.length-1;
                while(l<h)
                {
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[h];
                    if(sum==target)
                    {
                        ans.add(List.of(nums[i],nums[j],nums[l],nums[h]));
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
        return new ArrayList<>(ans);           
    }
}