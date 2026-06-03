class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
    int product[]= new int[nums.length];
     int pr=1;
     int zero=0;
     for(int i:nums)
     {
        if(i==0)
        {
        zero++;
        continue;
        }
        pr*=i;
     }
     if(zero>1)
     pr=0;
     for(int i=0;i<nums.length;i++)
     {
        if(zero>0)
        {
        if(nums[i]==0)
        product[i]=pr;
        else
        product[i]=0;
        }
        else
        product[i]=pr/nums[i];
     }
     return product;
    }
}  
