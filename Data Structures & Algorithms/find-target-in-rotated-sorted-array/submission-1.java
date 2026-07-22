class Solution {
    public int search(int[] nums, int target) {
   int l=0,h=nums.length-1,mini=0; 
        while(l<=h)
        {
            if(nums[l]<nums[h])
            {
                if(nums[l]<nums[mini])
                mini=l;
                break;
            }
            int mid=l+(h-l)/2;
            if(nums[mini]> nums[mid])
            mini=mid;
            if(nums[mid]>=nums[l])
             l=mid+1;
            else 
             h=mid-1;
        }
            int found1= bin(nums,mini,nums.length-1,target);
            int found2=bin(nums,0,mini-1,target);
            if(found1!=-1)
             return found1;
            else if(found2!=-1)
             return found2;
            else
            return -1;
            
        
    }
    int bin(int arr[],int l,int h,int key)
    {
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]==key)
             return mid;
            else if(arr[mid]>key)
             h=mid-1;
            else
             l=mid+1;
        }
        return -1;
    }
}
