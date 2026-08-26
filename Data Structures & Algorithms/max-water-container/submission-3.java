class Solution {
    public int maxArea(int[] heights) 
    {
    int max=0,l=0,h=heights.length-1;
    while(l<h)
    {
        max=Math.max(Math.min(heights[l],heights[h])*(h-l),max);
        if(heights[l]<heights[h])
         l++;
        else
         h--;
    }    
    return max;
    }
}
