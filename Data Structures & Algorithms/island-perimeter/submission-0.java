class Solution {
    int n,m,peri;
    public int islandPerimeter(int[][] grid) 
    {
    n=grid.length; m=grid[0].length;
    peri=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(grid[i][j]==1)
             {
                 bfs(i,j,grid);
                 return peri;
             }
        }
    }    
    return peri;
    }
    void bfs(int i, int j,int[][] grid)
    {
    Queue<int[]>q=new ArrayDeque<>();
    boolean[][] visited=new boolean[n][m];
    int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
    q.add(new int[]{i,j});
    visited[i][j]=true;
    while(!q.isEmpty())
    {
        int a[]=q.poll();
        for(int c[]:dir)
        {
            int x1=a[0]+c[0];
            int y1=a[1]+c[1];
            if(x1<0||x1>=n||y1<0||y1>=m||grid[x1][y1]==0)
            { peri++;continue;}
            else if(visited[x1][y1]==true)
             continue;
            else
            {
                q.offer(new int[]{x1,y1});
                visited[x1][y1]=true;
            }
        
        }
    }
    }
}