class Solution {
    public List<Integer> spiralOrder(int[][] matrix) 
    {
    List<Integer> ans= new ArrayList<>();
    int s=0;
    int rows=matrix.length;
    int cols=matrix[0].length;
    int m=Math.min(rows,cols);
    while(s<m/2)
    {
        for(int i=s;i<cols-1-s;i++)
         ans.add(matrix[s][i]);
        for(int i=s;i<matrix.length-1-s;i++)
         ans.add(matrix[i][cols-1-s]);
        for(int i=cols-1-s;i>s;i--)
         ans.add(matrix[rows-1-s][i]);
        for(int i=matrix.length-1-s;i>s;i--)
         ans.add(matrix[i][s]);
         s++;         
    }   
    if(rows <= cols && rows % 2 == 1)
    {
        for(int i=s; i<cols-s; i++)
            ans.add(matrix[s][i]);
    }
    else if(cols < rows && cols % 2 == 1)
    {
        for(int i=s; i<rows-s; i++)
            ans.add(matrix[i][s]);
    }
    return ans; 
    }
}
