class Solution {
    public int findMin(int[] nums) {
        return bin(nums,0,nums.length-1);
    }
    int bin(int arr[],int l,int h)
    {
        if(l==h)
         return arr[h];
         int mini=0;
        if(l<h)
        {
            int mid=l+(h-l)/2;
            int min1=bin(arr,l,mid);
            int min2=bin(arr,mid+1,h);
            mini=Math.min(min1,min2);
        }
        
        return mini;
    }
}
