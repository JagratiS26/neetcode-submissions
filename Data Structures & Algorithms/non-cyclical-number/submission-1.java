class Solution {
    public boolean isHappy(int n) 
    {
        int slow=n;
        int fast=squares(n);
        while(slow!=fast)
        {
            slow=squares(slow);
            fast=squares(squares(fast));
        }
        if(fast==1)
         return true;
        return false;
        
    }
    private int squares(int n)
    {
        int ans=0;
        while(n!=0)
        {
            int d=n%10;
            ans+=d*d;
            n/=10;
        }
        return ans;
    }
}
