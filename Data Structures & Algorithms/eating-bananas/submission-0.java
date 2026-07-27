class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
    int max=Integer.MIN_VALUE;
    for(int i:piles)
     max=Math.max(i,max);
    int l=1;
    int mini=Integer.MAX_VALUE;
    while(l<=max)
    {
        int mid=l+(max-l)/2;
        int time=0;
        for(int i=0;i<piles.length;i++)
        {
           time+=(piles[i]+mid-1)/mid;
        }
        if(time<=h)
        {
         max=mid-1;
        mini=mid;
        }
        else 
        {
            l=mid+1;
        }
    }
    return mini;
    }
}
