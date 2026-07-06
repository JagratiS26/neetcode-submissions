class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
       int a=0,b=matrix.length-1;
       while(a<=b)
       {
         int mid=a+(b-a)/2;
         if(matrix[mid][matrix[mid].length-1]>=target &&
         matrix[mid][0]<=target) 
         {
            int l=0, h=matrix[0].length-1;
            while(l<=h)
            {
                int m=l+(h-l)/2;
                if(matrix[mid][m]==target)
                return true;
                else if(matrix[mid][m]>target)
                 h=m-1;
                else
                 l=m+1;
            }
            return false;
         }  
         else if(matrix[mid][matrix[mid].length-1]<target)
          a=mid+1;
         else if (matrix[mid][0]>target)
          b=mid-1;
        }
        return false;
    }
}
