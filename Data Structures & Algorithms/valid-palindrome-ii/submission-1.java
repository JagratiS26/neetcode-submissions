class Solution {
    public boolean validPalindrome(String s) 
    {
     int l=0,h=s.length()-1;
     char ch[]= s.toCharArray();
     while(l<h)
     {
        if(ch[l]==ch[h])
        {
            l++;
            h--;
        }
        else
        {
            boolean found1=isPal(ch,l+1,h);
            boolean found2=isPal(ch,l,h-1);
            if(found1||found2)
             return true;
            else
             return false;
        }
     }
     return true;      
    }
    boolean isPal(char ch[],int l,int h)
    {
        while(l<h)
        {
            if(ch[l]==ch[h])
              {
                l++;
                h--;
              }
            else 
            return false;
        }
        return true;
    }
}