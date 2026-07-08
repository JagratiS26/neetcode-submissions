class Solution {
    public int lengthOfLongestSubstring(String s) {
        char ch[]= s.toCharArray();
        if(s.length()==0)
        return 0;
        int maxi=1,start=0;
        boolean found=false;
        for(int i=1;i<ch.length;i++)
        {  
           int j=i-1;
           for(;j>=start&&ch[j]!=ch[i];j--);
           start=j+1;
           maxi=Math.max(maxi,(i-start)+1);
        }
       return maxi; 
    }
}
