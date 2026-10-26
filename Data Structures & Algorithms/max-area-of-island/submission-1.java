class Solution {
    int m,n;
    public int maxAreaOfIsland(int[][] grid) {
        int area=0;
        m=grid.length;
        n=grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]>0)
                 area=Math.max(area,dfs(grid,i,j));
            }
        }
        return area;
        
    }
    int dfs(int[][] grid,int i, int j)
    {
        if(i<0||i>=m||j<0||j>=n||grid[i][j]<=0)
          return 0;
        int a=1;
        grid[i][j]=-1;
        a+=dfs(grid,i+1,j);
        a+=dfs(grid,i-1,j);
        a+=dfs(grid,i,j+1);
        a+=dfs(grid,i,j-1);
        return a;

    }
}
