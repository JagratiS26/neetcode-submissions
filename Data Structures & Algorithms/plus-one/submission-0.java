class Solution {
    public int[] plusOne(int[] digits) 
    {
        int carry=1,n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            int x=(digits[i]+carry)%10;
            carry=(digits[i]+carry)/10;
            digits[i]=x;
        }
        if(carry==0)
         return digits;
        else
        {
            int ans[]=new int[n+1];
            ans[0]=carry;
            for(int i=0;i<n;i++)
            {
                ans[i+1]=digits[i];
            }
        return ans;
        }
    }
}
