class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1,mini=nums[0];
        
        while(l<=h)
        {
            if(nums[l]<nums[h])
            {
                mini=Math.min(mini,nums[l]);
                break;
            }
            int mid=l+(h-l)/2;
            mini= Math.min(mini, nums[mid]);
            if(nums[mid]>=nums[l])
             l=mid+1;
            else 
             h=mid-1;
        }
        return mini;
        
    }
}
