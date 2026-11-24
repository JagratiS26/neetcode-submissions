class Solution {
    // public int numDecodings(String s) 
    // {
    //      int n=s.length();
    //      return solve(n-1,s.toCharArray());
    // }
    // int solve(int i,char ch[])
    // {
    //     if(i<0)
    //      return 1;
    //     if(ch[0]=='0')
    //       return 0;
    //     int one=solve(i-1,ch);
    //     int two=0;
    //     if(i>0&&ch[i-1]!=0&&Integer.parseInt(ch[i-1]+"")*10+Integer.parseInt(ch[i]+"")<=26)
    //        two=solve(i-2,ch);
    //     return one+two;
    // } ----> Recursive code 
    public int numDecodings(String s) 
    {
         int n=s.length();
         int memo[]=new int[n+1];
         if(s.charAt(0)=='0')
          return 0;
         Arrays.fill(memo,-1);
         return solve(n-1,s.toCharArray(),memo);
    }
    int solve(int i,char ch[],int memo[])
    {
        if(i<0)
         return 1;
        if(memo[i+1]!=-1)
          return memo[i+1];
        int one=0,two=0;
        if(ch[i]!='0')
           one=solve(i-1,ch,memo);
        if(i>0&&ch[i-1]!='0'&&Integer.parseInt(ch[i-1]+"")*10+Integer.parseInt(ch[i]+"")<=26)
           two=solve(i-2,ch,memo);
        return memo[i+1]=one+two;
    }
}
