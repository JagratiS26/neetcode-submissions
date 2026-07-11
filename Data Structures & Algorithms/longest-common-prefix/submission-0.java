class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==0)
        return "";
        else if(strs.length==1)
         return strs[0];
     StringBuilder sb =new StringBuilder();int a=0;
     Arrays.sort(strs, Comparator.comparingInt(String::length));
     while(a<strs[0].length())
     {
        int found=1;
        char ch=strs[0].charAt(a);
        for(int i=1;i<strs.length;i++)
        {
            if(strs[i].charAt(a)==ch)
            found++;
        }
        if(found==strs.length)
         sb.append(ch);
        else
         break;
         a++;
     }  
     return sb.toString();
    }
}