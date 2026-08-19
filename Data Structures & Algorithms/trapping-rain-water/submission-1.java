class Solution {
    public int trap(int[] height)
     {
       int l=0,r=height.length-1,l_max=0,r_max=0,total=0;
       while(l<r)
       {
        if(height[l]<height[r])
        {
            if(l_max<height[l])
              l_max=height[l];
            else
              total+=l_max-height[l];
            l++;            
        }
        else
        {
            if(r_max<height[r])
              r_max=height[r];
            else
              total+=r_max-height[r];
            r--;;            
        }
       } 
       return total;
    }
}
