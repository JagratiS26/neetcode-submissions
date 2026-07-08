class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if (nums.length==0)
        return 0;
        HashSet<Integer> set = new HashSet<>();
        int ans=1,maxans=1;
        for(int i:nums)
        {
            set.add(i);
        }
        for(int x:set)
        {
            if(!set.contains(x-1))
             {
                int current=x;
                ans=1;
             while(set.contains(current+1))
             {
                ans++;
                current++;
             }
             
            maxans=Math.max(ans,maxans);
             }
        }
        return maxans;
    }
}