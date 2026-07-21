class Solution {
    public void sortColors(int[] nums) {
        int l=-1,h=nums.length,k=0;
        while(k<h)
        {
            if(nums[k]==0)
            {
                
                int t=nums[l+1];
                nums[l+1]=0;
                nums[k]=t;
                l++;
                k++;
            }
            else if(nums[k]==2)
            {
                int t=nums[h-1];
                nums[h-1]=2;
                nums[k]=t;
                h--;
            }
            else
             k++;
        }
        
    }
}