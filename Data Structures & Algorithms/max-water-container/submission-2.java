class Solution {
    public int maxArea(int[] heights) {
        int max=0, l=0,h=heights.length-1;
        while(l<h)
        {
            int area=(h-l)*Math.min(heights[l],heights[h]);
            max=Math.max(area,max);
            if(heights[l]<heights[h])
             l++;
            else if(heights[l]>heights[h])
             h--;
             else
             {
                l++;h--;
             }

        }
       return max; 
    }
}
