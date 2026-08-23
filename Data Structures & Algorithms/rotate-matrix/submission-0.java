class Solution {
    public void rotate(int[][] matrix) 
    {
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=i+1;j<matrix[0].length;j++)
        {
            int t=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=t;
        }
    } 
     for(int i=0;i<matrix.length;i++)
    {
     int l=0,h=matrix[0].length-1;
     while(l<h)
     {
        int t=matrix[i][l];
        matrix[i][l]=matrix[i][h];
        matrix[i][h]=t;
        l++;h--;
     }
    }      
    }
}
