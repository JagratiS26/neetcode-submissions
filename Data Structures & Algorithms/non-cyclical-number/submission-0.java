class Solution {
    public boolean isHappy(int n) 
    {
        HashSet<Integer> mp=new HashSet<>();
        while(n!=1)
        {
            if(mp.contains(n))
              return false;
            mp.add(n);
            n=squares(n);
        }
        return true;
        
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
