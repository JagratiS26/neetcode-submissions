class Solution {
    public void rotate(int[] nums, int k) 
    {
    k=k%nums.length;
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1) ;
    reverse(nums,k,nums.length-1);   
    }
    void reverse(int arr[],int l,int h)
    {
        while(l<h)
        {
            int t=arr[l];
            arr[l]=arr[h];
            arr[h]=t;
            l++;
            h--;
        }
    }
}