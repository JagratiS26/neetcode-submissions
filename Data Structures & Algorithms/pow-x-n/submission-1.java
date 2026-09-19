class Solution {
    public double myPow(double x, int n) 
    {
      if(x==0)
        return x;
      if(n==0)
        return 1;
      if(n==1)
       return x;
      double ans=1;
      long b=Math.abs((long)n);
      while(b>=1)
      {
        if((b&1)==1)
        ans*=x;
        x*=x;
        b>>=1;
      }
    if(n<0)
      ans=1/ans;
      return ans;
    }
}
