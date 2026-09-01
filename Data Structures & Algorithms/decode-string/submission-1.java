class Solution {
    private int i=0;
    public String decodeString(String s) 
    {
        return helper(s);
    }
    String helper(String s)
    {
       StringBuilder sb=new StringBuilder();
       int k=0;
       while(i<s.length())
       {
        char c=s.charAt(i);
        if(Character.isDigit(c))
        {
            k=k*10+(c-'0');
        }
        else if(c=='[')
        {
          i++;
          String sub=helper(s);
          while(k-- > 0) 
            sb.append(sub);
          k=0;
        }
        else if(c==']')
          return sb.toString();
       else
        sb.append(c);
        i++;
       }
       return sb.toString();
       
    }

}