class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int l=0, h=matrix.length*matrix[0].length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            int i=mid/matrix[0].length,j=mid%matrix[0].length;
            if(matrix[i][j]==target)
            return true;
            else if(matrix[i][j]<target)
            l=mid+1;
            else
            h=mid-1;
        }
        return false;
    }
}
