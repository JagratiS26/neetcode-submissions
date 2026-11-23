class Solution {
    public int tribonacci(int n) 
    {
    int memo[]=new int[n];
    if(n==0)
     return 0;
    if(n==1)
    return 1;
    if(n==2)
     return 1;
    if(n==3)
     return 2;
    memo[0]=memo[1]=1;
    memo[2]=2;
    for(int i=3;i<n;i++)
     memo[i]=memo[i-1]+memo[i-2]+memo[i-3];
    return memo[n-1]; 
    }
}