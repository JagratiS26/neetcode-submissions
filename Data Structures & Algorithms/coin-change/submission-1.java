class Solution {
    public int coinChange(int[] coins, int amount) 
    {
     int n=coins.length;
     int[][]memo=new int[n][amount+1];
     for(int i=0;i<n;i++)
     {
        for(int j=1;j<=amount;j++)
        {
            if(i==0)
            {
                if(j%coins[i]==0)
                 memo[i][j]=j/coins[i];
                else
                 memo[i][j]=Integer.MAX_VALUE;
            }
            else
            {
                int take=Integer.MAX_VALUE,not=0;
                not+=memo[i-1][j];
                if(coins[i]<=j)
                {
                    int t=memo[i][j-coins[i]];
                    take=t==Integer.MAX_VALUE?t:1+t;
                }
                memo[i][j]=Math.min(take,not);
            }
        }
     }    
     return memo[n-1][amount]==Integer.MAX_VALUE?-1:memo[n-1][amount];
    }
}
