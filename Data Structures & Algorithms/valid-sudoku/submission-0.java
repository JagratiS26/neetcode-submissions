class Solution {
    public boolean isValidSudoku(char[][] b) 
    {
    for(int i=0;i<9;i++)
    {
        HashSet<Character> row= new HashSet<>();
        for(int j=0;j<9;j++)
        {
            if(b[i][j]=='.')
             continue;
            else if(row.contains(b[i][j]))
             return false;
            else
            row.add(b[i][j]);
        }
    } 
    for(int i=0;i<9;i++)
    {
        HashSet<Character> col= new HashSet<>();
        for(int j=0;j<9;j++)
        {
            if(b[j][i]=='.')
             continue;
            else if(col.contains(b[j][i]))
             return false;
            else
            col.add(b[j][i]);
        }
    } 
    for(int i=0;i<9;i++)
    {
        HashSet<Character> col= new HashSet<>();
        for(int j=0;j<3;j++)
        {
            for(int k=0;k<3;k++)
            {
                int row=(i/3)*3+j;
                int cols=(i%3)*3+k;
            if(b[row][cols]=='.')
             continue;
            else if(col.contains(b[row][cols]))
             return false;
            else
            col.add(b[row][cols]);
            }
        }
    }   
    return true;
    }
}
